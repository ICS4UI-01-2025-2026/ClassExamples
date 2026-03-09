public class Recursion
{

    
    public static long fibLoop(int n)
    {
        long[] nums = new long[n+1];
        nums[0] = 0;
        nums[1] = 1;
        for(int i = 2; i <= n; i++){
            nums[i] = nums[i-1] + nums[i-2];
        }
        return nums[n];
    }

    public static long fibRec(int n){
        // base case
        if(n == 0 || n == 1)
        {
            return n;
        }
        // recursive call
        return fibRec(n-1) + fibRec(n-2);
    }


    public static int sumFrom1To(int n){
        if(n == 1){
            return n;
        }
        return sumFrom1To(n-1) + n;
    }

    public static void main(String[] args) {
        System.out.println(fibRec(60));
    }
}