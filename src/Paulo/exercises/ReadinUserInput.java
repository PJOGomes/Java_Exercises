package Paulo.exercises;

import java.util.Scanner;

public class ReadinUserInput {
    public static void function () {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum=0;
        while(count<10)
        {
            System.out.println("Enter number #" + (count+1) + ":");
            if(scanner.hasNextInt()) {
                sum += scanner.nextInt();
                count++;
            } else {
                System.out.println("Invalid Integer");
            }
            scanner.nextLine();
        }
        System.out.println("The 10 number sum is: "+sum);
        scanner.close();
    }
}
