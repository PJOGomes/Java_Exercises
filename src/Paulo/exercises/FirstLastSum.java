package Paulo.exercises;

public class FirstLastSum {
    public static int sumFirstAndLastDigit(int number) {
        if(number < 0) {
            return -1;
        }

        int firstDigit = number%10;
        while (number>=10) {
            number/=10;
        }
        return number+firstDigit;
    }
}
