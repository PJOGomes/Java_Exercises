package Paulo.exercises;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        int numToCheck= number;
        int digit = 0;
        if(numToCheck<0) {
            number *=-1;
            numToCheck *=-1;
        }
        int reverseNumber = 0;
        while(number >0) {
            digit = number%10;
            reverseNumber *=10;
            reverseNumber +=digit;
            number /= 10;
        }
        if(numToCheck == reverseNumber) {
            return true;
        } else {
            return false;
        }
    }
}
