package Paulo.exercises;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int amount = 0;
        while(true) {
            if(scanner.hasNextInt()) {
                sum += scanner.nextInt();
                amount++;
                // scanner.nextLine();
            } else {
                System.out.println("SUM = "+ sum + " AVG = " + Math.round((double)sum/(double)amount));
                break;
            }
        }
        scanner.close();
    }
}
