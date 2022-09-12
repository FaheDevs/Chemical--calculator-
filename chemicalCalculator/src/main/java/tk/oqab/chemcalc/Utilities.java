package tk.oqab.chemcalc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utilities {


    public static Map<String, Substance> elementsMap = ElementsInfo.getElementsMap();
    public static String symbolsCalc = "";

    public static List<String> splitCompound(String compound) {

        if (compound.isEmpty()) return null;
        List<String> parts = new ArrayList();
        int count = 0;
        Matcher m = Pattern.compile("[A-Z][a-z]?\\d*|\\(.*?\\)\\d+\n*").matcher(compound);
        while (m.find()) {
            count += m.group().length();
            parts.add(m.group());
        }

        if (count != compound.length()) return null;
        return parts;

    }

    public static double getMolarMass(String compound) {

        List<String> parts = splitCompound(compound);
        double result = 0;

        for (String ele : parts) {
            if (ele.startsWith("(")) {
                int scalar = Integer.parseInt(ele.substring(ele.indexOf(")") + 1));

                result += scalar * getMolarMass(ele.substring(ele.indexOf("(") + 1, ele.indexOf(")")));
            } else {

                String number = ele.replaceAll("[^0-9]", "");
                String symbol = ele.replaceAll("[0-9]", "");
                int scalar = (number.isEmpty()) ? 1 : Integer.parseInt(number);
                symbolsCalc += scalar + " x " + elementsMap.get(symbol).getMass();
                result += scalar * elementsMap.get(symbol).getMass();

            }
        }

        return result;
    }


}