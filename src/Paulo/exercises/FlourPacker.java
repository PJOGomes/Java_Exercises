package Paulo.exercises;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if(bigCount<0||smallCount<0||goal<0) {
            return false;
        }
        if(5*bigCount + smallCount <goal) {
            return false;
        } else if(5*bigCount + smallCount == goal)
        {
            return true;
        } else {
            int num1 = goal/5;
            int num2 = goal-num1*5;
            System.out.println(num1 +' '+num2);
            if(num1<= bigCount && num2<=smallCount)
            {
                return true;
            } else return bigCount <= num1 && smallCount >= goal - 5 * bigCount;
        }
    }
}
