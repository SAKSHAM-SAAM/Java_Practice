import java.util.*;
public class reverseArray {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n=scan.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        // explicit reversal of array
        for(int i=0;i<=n/2;i++)
        {
            int x=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=x;
        }

        // output
        for(int i=0;i<n;i++)
        {
            System.out.printf("%d ",arr[i]);
        }
    }
}
