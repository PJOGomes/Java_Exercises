package Paulo.exercises;

public class SumOdd {
    public static boolean isOdd( int number) {
        if(number <0) {
            return false;
        }

       if(number % 2 != 0){
           return true;
       } else {
           return false;
       }
    }

    public static int sumOdd (int start, int end) {
        int sum = 0;
        if (start < 0 || end < 0 || end < start) {
            return -1;
        } else {
            for (int i = start; i < end + 1; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
        }
        return sum;
    }
}
