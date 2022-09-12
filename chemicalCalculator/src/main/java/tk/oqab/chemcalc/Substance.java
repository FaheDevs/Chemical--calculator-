package tk.oqab.chemcalc;

public final class Substance {
    private final String symbol;
    private final String name;
    private final double mass;

    public Substance(String symbol, String name, double atomicMass) {
        this.symbol = symbol;
        this.name = name;
        this.mass = atomicMass;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }


    public double getMass() {
        return mass;
    }

    @Override
    public String toString() {
        return "Substance{" +
                "symbol='" + symbol + '\'' +
                ", name='" + name + '\'' +
                ", mass=" + mass +
                '}';
    }
}
