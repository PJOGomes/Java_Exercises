package Paulo.exercises;

public class NumberToWords {
    public static void numberToWords(int number) {
        if(number < 1 ) {
            System.out.println("invalid Value");
        }
        int total = getDigitCount(number);
        number = reverse(number);
        int digit;
        int totalReversed = getDigitCount(number);
        int repeat = total - totalReversed;
        for( int i = 0; i<repeat; i++)
        {
            System.out.println("Zero ");
        }
        while (number >0){
            digit = number % 10;
            number /=10;
            switch (digit){
                case 0:
                    System.out.println("Zero ");
                    break;
                case 1:
                    System.out.println("One ");
                    break;
                case 2:
                    System.out.println("Two ");
                    break;
                case 3:
                    System.out.println("Three ");
                    break;
                case 4:
                    System.out.println("Four ");
                    break;
                case 5:
                    System.out.println("Five ");
                    break;
                case 6:
                    System.out.println("Six ");
                    break;
                case 7:
                    System.out.println("Seven ");
                    break;
                case 8:
                    System.out.println("Eight ");
                    break;
                default:
                    System.out.println("Nine ");
                    break;
            }
        }
    }

    public static int reverse ( int number) {
        int reversed = 0;
        while (number >0) {
            reversed *=10;
            reversed += number % 10;
            number /= 10;
        }

        return reversed;
    }

    public static int getDigitCount (int number) {
        int count = 0;
        while (number>0) {
            count++;
            number /=10;
        }
        return count;
    }
}
