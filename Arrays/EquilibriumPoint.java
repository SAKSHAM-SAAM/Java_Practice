import java.util.*;
public class EquilibriumPoint {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        // taking input
        int n= scan.nextInt();
        int []arr = new int[n];
        for(int i=0;i <n; i++)
        {
            arr[i] = scan.nextInt();
        }

        // Array sum
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }

        // finding index
        int ans = -1;
        int prefix=0;
        for(int i=0;i<n;i++)
        {
            if(prefix == sum-arr[i])
            {
                ans=i;
                break;
            }
            sum=sum-arr[i];
            prefix=prefix+arr[i];
        }
        // print index
        System.out.printf("index -> %d",ans);
    }
}
