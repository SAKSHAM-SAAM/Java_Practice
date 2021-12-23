/**
 * Insert at end of array
 */
import java.util.Scanner;
/**
 * InsertAtStart
 */
public class InsertAtStart {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scan.nextInt();
        int[] arr = new int[n];

        // Entrries in array
        for(int i=0;i<n;i++)
        {
            arr[i] = scan.nextInt();
        }

        // Print array
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i] + " ");
        }
    }
}