import java.util.*;
public class kadane {
    static Scanner scan = new Scanner(System.in);
    static void solve()
    {
        int n = scan.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scan.nextInt();
        }

        int currSum=0;
        int maxSum =0;
        for(int i=0;i<n;i++)
        {
            currSum = Math.max(currSum + arr[i], arr[i]);
            maxSum = Math.max(currSum, maxSum);
        }

        System.out.printf(("%d <- answer.\n"), maxSum);
    }
    public static void main(String[] args) {
        int tt  = scan.nextInt();
        while(tt > 0)
        {
            solve();
            tt--;
        }
    }
}
