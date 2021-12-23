/**
 * meanMedian
 */
import java.util.Scanner;
import java.util.Arrays;
public class meanMedian {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n=scan.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=arr[i]+sum;
        }
        double mean = sum/n;
        Arrays.sort(arr, 0, n);
        int median  = arr[n/2];

        System.out.println("Mean -> "+ mean +" and Median ->"+ median);
    }
}