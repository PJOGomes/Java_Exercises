package Paulo.exercises;

public class GreatestCommonDivider {
    public static int getGreatestCommonDivisor (int first, int second) {
        if(first < 10 || second < 10) {
            return -1;
        }
        int maior;
        int GCD = 1;
        if(first > second) {
            maior = first;
        } else {
            maior = second;
        }
        for (int i = 1; i <= maior/2; i++) {
            if(first%i == 0 && second%i == 0) {
                GCD = i;
            }
        }
        return GCD;
    }
}
