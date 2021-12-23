import java.util.Scanner;
public class insertAtIndex {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        int []arr = new int[n];

        // Entrries in array
        for(int i=0;i<n;i++)
        {
            arr[i] = scan.nextInt();
        }

        int index = scan.nextInt();
        int data  = scan.nextInt();

        arr[index] = data;

        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
