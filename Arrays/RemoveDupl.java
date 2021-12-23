import java.util.*;
public class RemoveDupl {
    static Scanner scan = new Scanner(System.in);

    static int removeDuplicate(int arr[],int n)
    {
        int index=1;
        for(int i=1;i<n;i++)
        {
            if(arr[index-1] != arr[i])
            {
                arr[index]=arr[i];
                index++;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int n=scan.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        int size = removeDuplicate(arr,n);

        for (int i = 0; i < size; i++) {
            System.out.printf("%d ",arr[i]);
        }
    }
}
