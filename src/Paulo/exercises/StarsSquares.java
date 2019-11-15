package Paulo.exercises;

public class StarsSquares {
    public static void printSquareStar(int number) {
        if(number < 5) {
            System.out.println("Invalid Value");
            return;
        }
        for(int currentRow = 1; currentRow<=number; currentRow++)
        {
            for(int column = 1; column<=number; column++) {
                if(currentRow == 1||currentRow == number||column == 1 || column == number || currentRow == column ||column == number - currentRow + 1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
