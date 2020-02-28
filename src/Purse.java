import java.util.ArrayList;

public class Purse {
    private ArrayList<Coin> coins;

    public Purse() {
        coins = new ArrayList<Coin>();
    }


    public void add(Coin aCoin) {
        coins.add(aCoin);
    }

    public double getTotal() {
        double total = 0;
        for (int i = 0; i < coins.size(); i++) {
            total += coins.get(i).getValue();
        }
        return total;
    }


    public int count(Coin aCoin) {
        int count = 0;
        for (Coin coin : coins) {
            if(coin.equals(aCoin)){
                count++;
            }
        }
        return count;
    }

    public String findSmallest() {
        double smallest = coins.get(0).getValue();
        Coin small = coins.get(0);
        for (int i = 0; i < coins.size(); i++) {
            if(coins.get(i).getValue() < smallest) {
                smallest = coins.get(i).getValue();
                small = coins.get(i);
            }
        }
        return small.getName();
    }

}
