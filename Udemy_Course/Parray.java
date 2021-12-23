import java.util.Scanner;

class ArrayPractice{
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args)
    {
        int[] arr = new int[10];
        for(int i=0;i<10;i++)
        {
            arr[i] = scn.nextInt();
        }

        int sum=0;
        for(int i=0;i<10;i++)
        {
            sum = sum + arr[i];
        }
        System.out.println("Sum of all numbers->" + sum);
    }
}