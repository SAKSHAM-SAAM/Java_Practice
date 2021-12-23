import java.util.Scanner;
public class PScanner {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Input 10 numbers ->");

        int sum=0;
        for(int i=0; i< 10; i++)
        {
            int x=scn.nextInt();
            sum=sum+x;
        }
        System.out.println("Sum of all numbers ->" + sum);
    }
}
