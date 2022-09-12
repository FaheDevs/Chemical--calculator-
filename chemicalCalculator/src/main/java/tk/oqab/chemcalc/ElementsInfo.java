package tk.oqab.chemcalc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ElementsInfo {
    public static Map<String, Substance> getElementsMap() {

        Map<String, Substance> elementsMap = new HashMap<>();

        elementsMap.put("H", new Substance("H", "Hydrogen", 1.00797));
        elementsMap.put("He", new Substance("He", "Helium", 4.0026));
        elementsMap.put("Li", new Substance("Li", "Lithium", 6.941));
        elementsMap.put("Be", new Substance("Be", "Beryllium", 9.01218));
        elementsMap.put("B", new Substance("B", "Boron", 10.81));
        elementsMap.put("C", new Substance("C", "Carbon", 12.011));
        elementsMap.put("N", new Substance("N", "Nitrogen", 14.0067));
        elementsMap.put("O", new Substance("O", "Oxygen", 15.9994));
        elementsMap.put("F", new Substance("F", "Fluorine", 18.998403));
        elementsMap.put("Ne", new Substance("Ne", "Neon", 20.179));
        elementsMap.put("Na", new Substance("Na", "Sodium", 22.98977));
        elementsMap.put("Mg", new Substance("Mg", "Magnesium", 24.305));
        elementsMap.put("Al", new Substance("Al", "Aluminum", 26.98154));
        elementsMap.put("Si", new Substance("Si", "Silicon", 28.0855));
        elementsMap.put("P", new Substance("P", "Phosphorus", 30.97376));
        elementsMap.put("S", new Substance("S", "Sulfur", 32.06));
        elementsMap.put("Cl", new Substance("Cl", "Chlorine", 35.453));
        elementsMap.put("K", new Substance("K", "Potassium", 39.0983));
        elementsMap.put("Ar", new Substance("Ar", "Argon", 39.948));
        elementsMap.put("Ca", new Substance("Ca", "Calcium", 40.08));
        elementsMap.put("Sc", new Substance("Sc", "Scandium", 44.9559));
        elementsMap.put("Ti", new Substance("Ti", "Titanium", 47.9));
        elementsMap.put("V", new Substance("V", "Vanadium", 50.9415));
        elementsMap.put("Cr", new Substance("Cr", "Chromium", 51.996));
        elementsMap.put("Mn", new Substance("Mn", "Manganese", 54.938));
        elementsMap.put("Fe", new Substance("Fe", "Iron", 55.847));
        elementsMap.put("Ni", new Substance("Ni", "Nickel", 58.7));
        elementsMap.put("Co", new Substance("Co", "Cobalt", 58.9332));
        elementsMap.put("Cu", new Substance("Cu", "Copper", 63.546));
        elementsMap.put("Zn", new Substance("Zn", "Zinc", 65.38));
        elementsMap.put("Ga", new Substance("Ga", "Gallium", 69.72));
        elementsMap.put("Ge", new Substance("Ge", "Germanium", 72.59));
        elementsMap.put("As", new Substance("As", "Arsenic", 74.9216));
        elementsMap.put("Se", new Substance("Se", "Selenium", 78.96));
        elementsMap.put("Br", new Substance("Br", "Bromine", 79.904));
        elementsMap.put("Kr", new Substance("Kr", "Krypton", 83.8));
        elementsMap.put("Rb", new Substance("Rb", "Rubidium", 85.4678));
        elementsMap.put("Sr", new Substance("Sr", "Strontium", 87.62));
        elementsMap.put("Y", new Substance("Y", "Yttrium", 88.9059));
        elementsMap.put("Zr", new Substance("Zr", "Zirconium", 91.22));
        elementsMap.put("Nb", new Substance("Nb", "Niobium", 92.9064));
        elementsMap.put("Mo", new Substance("Mo", "Molybdenum", 95.94));
        elementsMap.put("Tc", new Substance("Tc", "Technetium", 98.0));
        elementsMap.put("Ru", new Substance("Ru", "Ruthenium", 101.07));
        elementsMap.put("Rh", new Substance("Rh", "Rhodium", 102.9055));
        elementsMap.put("Pd", new Substance("Pd", "Palladium", 106.4));
        elementsMap.put("Ag", new Substance("Ag", "Silver", 107.868));
        elementsMap.put("Cd", new Substance("Cd", "Cadmium", 112.41));
        elementsMap.put("In", new Substance("In", "Indium", 114.82));
        elementsMap.put("Sn", new Substance("Sn", "Tin", 118.69));
        elementsMap.put("Sb", new Substance("Sb", "Antimony", 121.75));
        elementsMap.put("I", new Substance("I", "Iodine", 126.9045));
        elementsMap.put("Te", new Substance("Te", "Tellurium", 127.6));
        elementsMap.put("Xe", new Substance("Xe", "Xenon", 131.3));
        elementsMap.put("Cs", new Substance("Cs", "Cesium", 132.9054));
        elementsMap.put("Ba", new Substance("Ba", "Barium", 137.33));
        elementsMap.put("La", new Substance("La", "Lanthanum", 138.9055));
        elementsMap.put("Ce", new Substance("Ce", "Cerium", 140.12));
        elementsMap.put("Pr", new Substance("Pr", "Praseodymium", 140.9077));
        elementsMap.put("Nd", new Substance("Nd", "Neodymium", 144.24));
        elementsMap.put("Pm", new Substance("Pm", "Promethium", 145.0));
        elementsMap.put("Sm", new Substance("Sm", "Samarium", 150.4));
        elementsMap.put("Eu", new Substance("Eu", "Europium", 151.96));
        elementsMap.put("Gd", new Substance("Gd", "Gadolinium", 157.25));
        elementsMap.put("Tb", new Substance("Tb", "Terbium", 158.9254));
        elementsMap.put("Dy", new Substance("Dy", "Dysprosium", 162.5));
        elementsMap.put("Ho", new Substance("Ho", "Holmium", 164.9304));
        elementsMap.put("Er", new Substance("Er", "Erbium", 167.26));
        elementsMap.put("Tm", new Substance("Tm", "Thulium", 168.9342));
        elementsMap.put("Yb", new Substance("Yb", "Ytterbium", 173.04));
        elementsMap.put("Lu", new Substance("Lu", "Lutetium", 174.967));
        elementsMap.put("Hf", new Substance("Hf", "Hafnium", 178.49));
        elementsMap.put("Ta", new Substance("Ta", "Tantalum", 180.9479));
        elementsMap.put("W", new Substance("W", "Tungsten", 183.85));
        elementsMap.put("Re", new Substance("Re", "Rhenium", 186.207));
        elementsMap.put("Os", new Substance("Os", "Osmium", 190.2));
        elementsMap.put("Ir", new Substance("Ir", "Iridium", 192.22));
        elementsMap.put("Pt", new Substance("Pt", "Platinum", 195.09));
        elementsMap.put("Au", new Substance("Au", "Gold", 196.9665));
        elementsMap.put("Hg", new Substance("Hg", "Mercury", 200.59));
        elementsMap.put("Tl", new Substance("Tl", "Thallium", 204.37));
        elementsMap.put("Pb", new Substance("Pb", "Lead", 207.2));
        elementsMap.put("Bi", new Substance("Bi", "Bismuth", 208.9804));
        elementsMap.put("Po", new Substance("Po", "Polonium", 209.0));
        elementsMap.put("At", new Substance("At", "Astatine", 210.0));
        elementsMap.put("Rn", new Substance("Rn", "Radon", 222.0));
        elementsMap.put("Fr", new Substance("Fr", "Francium", 223.0));
        elementsMap.put("Ra", new Substance("Ra", "Radium", 226.0254));
        elementsMap.put("Ac", new Substance("Ac", "Actinium", 227.0278));
        elementsMap.put("Pa", new Substance("Pa", "Protactinium", 231.0359));
        elementsMap.put("Th", new Substance("Th", "Thorium", 232.0381));
        elementsMap.put("Np", new Substance("Np", "Neptunium", 237.0482));
        elementsMap.put("U", new Substance("U", "Uranium", 238.029));
        elementsMap.put("Pu", new Substance("Pu", "Plutonium", 242.0));
        elementsMap.put("Am", new Substance("Am", "Americium", 243.0));
        elementsMap.put("Bk", new Substance("Bk", "Berkelium", 247.0));
        elementsMap.put("Cm", new Substance("Cm", "Curium", 247.0));
        elementsMap.put("No", new Substance("No", "Nobelium", 250.0));
        elementsMap.put("Cf", new Substance("Cf", "Californium", 251.0));
        elementsMap.put("Es", new Substance("Es", "Einsteinium", 252.0));
        elementsMap.put("Hs", new Substance("Hs", "Hassium", 255.0));
        elementsMap.put("Mt", new Substance("Mt", "Meitnerium", 256.0));
        elementsMap.put("Fm", new Substance("Fm", "Fermium", 257.0));
        elementsMap.put("Md", new Substance("Md", "Mendelevium", 258.0));
        elementsMap.put("Lr", new Substance("Lr", "Lawrencium", 260.0));
        elementsMap.put("Rf", new Substance("Rf", "Rutherfordium", 261.0));
        elementsMap.put("Bh", new Substance("Bh", "Bohrium", 262.0));
        elementsMap.put("Db", new Substance("Db", "Dubnium", 262.0));
        elementsMap.put("Sg", new Substance("Sg", "Seaborgium", 263.0));
        elementsMap.put("Uun", new Substance("Uun", "Ununnilium", 269.0));
        elementsMap.put("Uuu", new Substance("Uuu", "Unununium", 272.0));
        elementsMap.put("Uub", new Substance("Uub", "Ununbiium", 277.0));

        return elementsMap;
    }


    public static List<String> getCompoundsList() {
        List<String> compoundsSymbols = new ArrayList<>();

        compoundsSymbols.add("C2H4O");
        compoundsSymbols.add("C2H5NO");
        compoundsSymbols.add("CH3COOH");
        compoundsSymbols.add("C3H6O");
        compoundsSymbols.add("C2H3N");
        compoundsSymbols.add("AlCl3");
        compoundsSymbols.add("Al(NO3)3");
        compoundsSymbols.add("Al2(SO4)3");
        compoundsSymbols.add("NH3");
        compoundsSymbols.add("CH3COONH4");
        compoundsSymbols.add("(NH4)2CO3");
        compoundsSymbols.add("NH4Cl");
        compoundsSymbols.add("(NH4)2Cr2O7");
        compoundsSymbols.add("NH4OH");
        compoundsSymbols.add("NH4NO3");
        compoundsSymbols.add("(NH4)2C2O4");
        compoundsSymbols.add("(NH4)2SO4");
        compoundsSymbols.add("SbCl3");
        compoundsSymbols.add("SbCl5");
        compoundsSymbols.add("BaCl2");
        compoundsSymbols.add("Ba(OH)2");
        compoundsSymbols.add("Ba(NO3)2");
        compoundsSymbols.add("BiCl3");
        compoundsSymbols.add("Bi(NO3)3");
        compoundsSymbols.add("C4H10O");
        compoundsSymbols.add("C4H8O2");
        compoundsSymbols.add("Cd(NO3)2");
        compoundsSymbols.add("CdSO4");
        compoundsSymbols.add("CaCl2");
        compoundsSymbols.add("Ca(OH)2");
        compoundsSymbols.add("Ca(NO3)2");
        compoundsSymbols.add("CaSO4");
        compoundsSymbols.add("CS2");
        compoundsSymbols.add("C2H3ClO2");
        compoundsSymbols.add("HAuCl4");
        compoundsSymbols.add("CHCl3");
        compoundsSymbols.add("H2PtCl6");
        compoundsSymbols.add("CrCl3");
        compoundsSymbols.add("Cr(NO3)3");
        compoundsSymbols.add("Cr2(SO4)3");
        compoundsSymbols.add("CrO3");
        compoundsSymbols.add("C6H8O7");
        compoundsSymbols.add("Co(NO3)2");
        compoundsSymbols.add("CoSO4");
        compoundsSymbols.add("Cu2Cl2");
        compoundsSymbols.add("CuCl2");
        compoundsSymbols.add("Cu(NO3)2");
        compoundsSymbols.add("CuSO4");
        compoundsSymbols.add("C2H2Cl2O2");
        compoundsSymbols.add("(C2H5)2O");
        compoundsSymbols.add("(CH3CNOH)2");
        compoundsSymbols.add("Na2C10H14N2O8");
        compoundsSymbols.add("C2H5OH");
        compoundsSymbols.add("(CH2OH)2");
        compoundsSymbols.add("CH2O");
        compoundsSymbols.add("CH2O2");
        compoundsSymbols.add("C6H12O6");
        compoundsSymbols.add("C6H12O6");
        compoundsSymbols.add("C3H8O3");
        compoundsSymbols.add("H2SiF6");
        compoundsSymbols.add("N2H4");
        compoundsSymbols.add("HBr");
        compoundsSymbols.add("HCl");
        compoundsSymbols.add("HCN");
        compoundsSymbols.add("HF");
        compoundsSymbols.add("H2O2");
        compoundsSymbols.add("HI");
        compoundsSymbols.add("HIO3");
        compoundsSymbols.add("FeSO4(NH4)2SO4");
        compoundsSymbols.add("FeSO4");
        compoundsSymbols.add("FeCl3");
        compoundsSymbols.add("Fe(NO3)3");
        compoundsSymbols.add("Fe2(SO4)3");
        compoundsSymbols.add("C4H10O");
        compoundsSymbols.add("C3H6O3");
        compoundsSymbols.add("C12H22O11");
        compoundsSymbols.add("Pb(C2H3O2)2");
        compoundsSymbols.add("PbCl2");
        compoundsSymbols.add("Pb(NO3)2");
        compoundsSymbols.add("Pb(C2H3O2)4");
        compoundsSymbols.add("LiCl");
        compoundsSymbols.add("MgCl2");
        compoundsSymbols.add("Mg(NO3)2");
        compoundsSymbols.add("MgSO4");
        compoundsSymbols.add("C4H4O4");
        compoundsSymbols.add("C3H4O4");
        compoundsSymbols.add("C12H22O11");
        compoundsSymbols.add("MnCl2");
        compoundsSymbols.add("MnSO4");
        compoundsSymbols.add("C6H14O6");
        compoundsSymbols.add("HgCl2");
        compoundsSymbols.add("Hg(NO3)2");
        compoundsSymbols.add("HgSO4");
        compoundsSymbols.add("CH3OH");
        compoundsSymbols.add("C3H6O2");
        compoundsSymbols.add("NiCl2");
        compoundsSymbols.add("Ni(NO3)2");
        compoundsSymbols.add("NiSO4");
        compoundsSymbols.add("C10H14N2");
        compoundsSymbols.add("HNO3");
        compoundsSymbols.add("H2C2O4");
        compoundsSymbols.add("C5H11OH");
        compoundsSymbols.add("HClO4");
        compoundsSymbols.add("C6H6O");
        compoundsSymbols.add("H3PO4");
        compoundsSymbols.add("KHCO3");
        compoundsSymbols.add("KBrO3");
        compoundsSymbols.add("KBr");
        compoundsSymbols.add("K2CO3");
        compoundsSymbols.add("KClO3");
        compoundsSymbols.add("KCl");
        compoundsSymbols.add("K2CrO4");
        compoundsSymbols.add("KCN");
        compoundsSymbols.add("K2Cr2O7");
        compoundsSymbols.add("KH2PO4");
        compoundsSymbols.add("K4Fe(CN)6");
        compoundsSymbols.add("K3Fe(CN)6");
        compoundsSymbols.add("K2HPO4");
        compoundsSymbols.add("KOH");
        compoundsSymbols.add("KIO3");
        compoundsSymbols.add("KI");
        compoundsSymbols.add("KNO3");
        compoundsSymbols.add("KNO2");
        compoundsSymbols.add("KMnO4");
        compoundsSymbols.add("K2SO4");
        compoundsSymbols.add("K2SO3");
        compoundsSymbols.add("K2C4H4O6");
        compoundsSymbols.add("KCNS");
        compoundsSymbols.add("CH3CH2CH2OH");
        compoundsSymbols.add("CH3CHOHCH3");
        compoundsSymbols.add("C5H5N");
        compoundsSymbols.add("C6H6O2");
        compoundsSymbols.add("C12H22O11");
        compoundsSymbols.add("AgNO3");
        compoundsSymbols.add("Ag2SO4");
        compoundsSymbols.add("NaC2H3O2");
        compoundsSymbols.add("Na3AsO4");
        compoundsSymbols.add("NaBr");
        compoundsSymbols.add("Na2CO3");
        compoundsSymbols.add("NaClO3");
        compoundsSymbols.add("NaCl");
        compoundsSymbols.add("Na2CrO4");
        compoundsSymbols.add("Na3C6H5O7");
        compoundsSymbols.add("Na2Cr2O7");
        compoundsSymbols.add("NaH2PO4");
        compoundsSymbols.add("HCOONa");
        compoundsSymbols.add("NaHCO3");
        compoundsSymbols.add("Na2HPO4");
        compoundsSymbols.add("NaHC4H4O6");
        compoundsSymbols.add("NaOH");
        compoundsSymbols.add("NaNO3");
        compoundsSymbols.add("NaNO2");
        compoundsSymbols.add("Na3PO4");
        compoundsSymbols.add("NaKC4H4O6");
        compoundsSymbols.add("Na2SO4");
        compoundsSymbols.add("Na2S");
        compoundsSymbols.add("Na2SO3");
        compoundsSymbols.add("Na2C4H4O6");
        compoundsSymbols.add("Na2S2O3");
        compoundsSymbols.add("SrCl2");
        compoundsSymbols.add("Sr(NO3)2");
        compoundsSymbols.add("SrSO4");
        compoundsSymbols.add("H2SO4");
        compoundsSymbols.add("H2SO3");
        compoundsSymbols.add("H2C4H4O6");
        compoundsSymbols.add("CH4N2S");
        compoundsSymbols.add("SnCl2");
        compoundsSymbols.add("SnCl4");
        compoundsSymbols.add("CCl3COOH");
        compoundsSymbols.add("(HOCH2)3CNH2");
        compoundsSymbols.add("(NH2)2CO");
        compoundsSymbols.add("C3H7NO2");
        compoundsSymbols.add("ZnBr2");
        compoundsSymbols.add("ZnCl2");
        compoundsSymbols.add("Zn(NO3)2");
        compoundsSymbols.add("ZnSO4");

        return compoundsSymbols;
    }
}
