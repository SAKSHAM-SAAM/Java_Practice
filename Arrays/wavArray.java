import java.util.Scanner;
import java.util.*;
public class wavArray {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n= scan.nextInt();
        int []arr = new int[n];
        for(int i=0;i <n; i++)
        {
            arr[i] = scan.nextInt();
        }

        Arrays.sort(arr);

        for(int i=1;i<n;i=2+i)
        {
            int t = arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=t;
        }

        // Print array
        for(int i=0;i<n;i++)
        {
            System.out.printf("%d ",arr[i]);
        }
    }
}
