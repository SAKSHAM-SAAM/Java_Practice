import java.util.Scanner;
public class RotateArray {
    static Scanner scan = new Scanner(System.in);
    /**
     * Rotate left by one place
     */
    static void rotate(int arr[],int n)
    {
        int temp=arr[0];
        for(int i=1;i<n;i++)
        {
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
    }

    public static void main(String[] args) {
        int n= scan.nextInt();
        int []arr = new int[n];
        for(int i=0;i <n; i++)
        {
            arr[i] = scan.nextInt();
        }

        // Rotate array function
        rotate(arr,n);

        for(int i=0;i<n;i++)
        {
            System.out.printf("%d ",arr[i]);
        }
    }
}
