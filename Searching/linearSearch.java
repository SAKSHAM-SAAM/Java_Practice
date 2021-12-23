/**
 * linearSearch
 */
import java.util.*;
public class linearSearch {
    static Scanner scan = new Scanner(System.in);
    static void solve()
    {
        int n=scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scan.nextInt();
        }
        int key;
        key=scan.nextInt();

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == key)
            {
                System.out.printf("Key exists.\n");
                return;
            }
        }
        System.out.printf("Key does not exists.\n");
    }
    public static void main(String[] args) {
        int tt = scan.nextInt();
        while(tt > 0)
        {
            solve();
            tt--;
        }
    }
}