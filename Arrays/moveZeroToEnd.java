import java.util.*;
public class moveZeroToEnd {
    static Scanner scan = new Scanner(System.in);

    static void moveZero(int arr[],int len)
    {
        int index=0;
        for(int i=0; i<len; i++)
        {
            if(arr[i]!=0)
            {
                arr[index]=arr[i];
                index++;
            }
        }
        while(index < len)
        {
            arr[index]=0;
            index++;
        }
    }
    public static void main(String[] args) {
        int n=scan.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        moveZero(arr,n);

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ",arr[i]);
        }
    }
}
