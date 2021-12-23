import java.util.*;
/**
 * Statement:
 * Given a sorted array of positive integers. Your task is to rearrange 
 *  the array elements alternatively i.e first element should be max value, 
 * second should be min value, third should be second max, 
 * fourth should be second min and so on.
 */
public class AlterRearrange {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= scan.nextInt();
        }

        Arrays.sort(arr);

        int mode= arr[n-1]+1;
        int str = 0;
        int end = n-1;

        for(int i=0;i<n;i++)
        {
            if(i%2 == 0) // even
            {
                arr[i] = arr[i] + mode*(arr[end] % mode);
                end--;
            }else{ // odd 
                arr[i] = arr[i] + mode*(arr[str] % mode);
                str++;
            }
        }

        for(int i=0;i<n;i++)
        {
            System.out.printf("%d ",arr[i]/mode);
        }
    }
}
