package Paulo.exercises;

import static java.lang.StrictMath.sqrt;

public class LargestPrime {
    public static int getLargestPrime(int number) {
        if(number < 0) {
            return -1;
        }
        int largestPrime =0;
        int largestDivider = 1;
        for(int i = 2; i<=number; i++) {
            if(number % i == 0 ) {
                for (int j = 2; j<=sqrt(i);j++) {
                    if(i % j == 0)
                    {
                        largestDivider = j;
                    }
                }
                if(largestDivider == 1)
                {
                    largestPrime = i;
                }
                }
            }

        if(largestPrime == 0) {
            return -1;
        } else {
            return largestPrime;
        }
    }

}
