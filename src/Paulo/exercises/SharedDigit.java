package Paulo.exercises;

public class SharedDigit {
    public static boolean hasSharedDigit (int number1, int number2) {
        if(number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99) {
            return false;
        }
        int primeiro1 = number1 % 10;
        number1 /= 10;
        int primeiro2 = number2 % 10;
        number2 /= 10;
        if(number1 == number2 || number1 == primeiro2 || primeiro1 == number2 || primeiro1 == primeiro2) {
            return true;
        } else {
            return false;
        }
    }
}
