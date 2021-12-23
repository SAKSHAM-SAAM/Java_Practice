import java.util.Scanner;
public class sumOfDigits {
    static Scanner scan = new Scanner(System.in);
    static int SumDigit(int n)
    {
        if(n<10)
        {
            return n;
        }else{
            return (n%10+ SumDigit(n/10));
        }
    }
    public static void main(String[] args) {
        int n = scan.nextInt();
        System.out.println(SumDigit(n));
    }
}
