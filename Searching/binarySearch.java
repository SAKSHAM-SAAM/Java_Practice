import java.util.*;
public class binarySearch {
    static Scanner scan= new Scanner(System.in);
    static boolean binary(int arr[],int n, int key)
    {
        int low=0;
        int high=n-1;

        while(low <= high)
        {
            int mid =low + (high)/2;
            if(arr[mid] == key)
            {
                return true;
            }
            else if(arr[mid] < key)
            {
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return false;
    }
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
        Arrays.sort(arr, 0, n);
/*      Debug
        for(int a:arr)
            System.out.printf("%d ",a); */

        boolean ans = binary(arr, n, key);
        if(ans)
        {
            System.out.printf("Key exist.\n");
        }else{
            System.out.printf("Key does not exist.\n");
        }
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
