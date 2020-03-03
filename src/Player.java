import java.util.ArrayList;

public class Player {
    private ArrayList<Card> Hand;



    public Player(){
        this.Hand = new ArrayList<>();
    }

    public ArrayList<Card> getHand(){
        return Hand;
    }

    public String toString(){
        return "Player{" + "Hand:" + Hand + "}";
    }


    public static void main(String[] args){
        Player p = new Player();
        System.out.println(p.getHand());
    }
}
