import java.util.Scanner;

public class FrequencyChart {
    //instance variables
    private int[] list;
    private String chart = "";


    //Constructor
    public FrequencyChart(int[] inp) {
        list = inp;
    }

    //methods
    public String makeChart() {
        int oneCount = 0;
        int twoCount = 0;
        int threeCount = 0;
        int fourCount = 0;
        int fiveCount = 0;
        int sixCount = 0;
        int sevenCount = 0;
        int eightCount = 0;
        int nineCount = 0;
        int tenCount = 0;

        for (int num : list) {
            if (num >= 0 && num <= 10) {
                oneCount++;
            } else if (num >= 11 && num <= 20) {
                twoCount++;
            } else if (num >= 21 && num <= 30) {
                threeCount++;
            } else if (num >= 31 && num <= 40) {
                fourCount++;
            } else if (num >= 41 && num <= 50) {
                fiveCount++;
            } else if (num >= 51 && num <= 60) {
                sixCount++;
            } else if (num >= 61 && num <= 70) {
                sevenCount++;
            } else if (num >= 71 && num <= 80) {
                eightCount++;
            } else if (num >= 81 && num <= 90) {
                nineCount++;
            } else if (num >= 91 && num <= 100) {
                tenCount++;
            }
        }

        chart += "0 - 10 | ";
        for (int i = 0; i < oneCount; i++) {
            chart += "*";
        }
        chart += "\n";

        chart += "11 - 20 | ";
        for (int i = 0; i < twoCount; i++) {
            chart += "*";
        }
        chart += "\n";

        chart += "21 - 30 | ";
        for (int i = 0; i < threeCount; i++) {
            chart += "*";
        }
        chart += "\n";

        chart += "31 - 40 | ";
        for (int i = 0; i < fourCount; i++) {
            chart += "*";
        }
        chart += "\n";

        chart += "41 - 50 | ";
        for (int i = 0; i < fiveCount; i++) {
            chart += "*";
        }
        chart += "\n";

        chart += "51 - 60 | ";
        for (int i = 0; i < sixCount; i++) {
            chart += "*";
        }
        chart += "\n";

        chart += "61 - 70 | ";
        for (int i = 0; i < sevenCount; i++) {
            chart += "*";
        }
        chart += "\n";

        chart += "71 - 80 | ";
        for (int i = 0; i < eightCount; i++) {
            chart += "*";
        }
        chart += "\n";

        chart += "81 - 90 | ";
        for (int i = 0; i < nineCount; i++) {
            chart += "*";
        }
        chart += "\n";

        chart += "91 - 100 | ";
        for (int i = 0; i < tenCount; i++) {
            chart += "*";
        }

        return chart;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many values in your data set?");
        int size = scan.nextInt();

        int[] data = new int[size];

        System.out.println("Enter data value one at a time, followed by enter:");
        int val = 0;
        for (int i = 0; i < data.length; i++) {
            val = scan.nextInt();
            data[i] = val;
        }

        FrequencyChart chart = new FrequencyChart(data);


        System.out.println(chart.makeChart());
    }
}
