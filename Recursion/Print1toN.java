import java.util.Scanner;

public class Print1toN{
    static Scanner scan = new Scanner(System.in);
    static void rec(int x)
    {
        if(x==1) System.out.println("1\n");
        else{
            System.out.println(x);
            x--;
            rec(x);
        }
    }
    public static void main(String[] args) {
        int n = scan.nextInt();
        rec(n);
    }
}
