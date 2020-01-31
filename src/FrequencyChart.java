import java.util.Scanner;

public class FrequencyChart {
    //instance variables
    private int[] list;

    //Constructor
    public FrequencyChart(int[] list){
        this.list = list;
    }

    //methods
    public String makeChart(){

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many values in your data set?");
        int size = scan.nextInt();

        int[] data = new int[size];

        System.out.println("Enter data value one at a time, followed by enter:");
        int vsl = 0;
        for (int i = 0; i < data.length; i++) {
            val = scan.nextInt();
            data[i] = val;
        }

        FrequencyChart = new FrequencyChart(data);


        System.out.println(chart.makeChart());
    }
}
