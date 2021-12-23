import java.util.Scanner;
public class Fibannaci {
    static Scanner scan = new Scanner(System.in);

    static int fib(int f,int s, int n)
    {
        if(n==0)
        {
            return s;
        }
        int temp=s;
        s=f+s;
        f=temp;
        return fib(f,s,--n);
    }
    public static void main(String[] args) {
        int n = scan.nextInt();
        int first=0;
        int second=1;
        System.out.println("answer: "+fib(first,second,n));
    }
}
// Pingalli 
// 1 1 2 3 5 8 13 21 ...