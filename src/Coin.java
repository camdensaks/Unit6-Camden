public class Coin {
    private double myValue;

    private String myName;

    public Coin(double value, String name) {
        myValue = value;
        myName = name;
    }

    public double getValue() {
        return myValue;
    }

    public String getName() {
        return myName;
    }

    public boolean equals(Coin aCoin) {
        return this.myName.equals(aCoin.myName) && this.myValue == aCoin.myValue;
    }
}

