import java.util.Scanner;

class GFG{
    static Scanner scan = new Scanner(System.in);
    static boolean isPrime(int n)
    {
        if(n<=1) return false;

        if(n%2 == 0) return false;
        if(n%3 == 0) return false;

        for(int i=5; i*i < n; i=i+6)
        {
            if((n%i==0) || (n%(i+2)==0))
            {
                return false;
            }
        }

        return true;
    }
    public static void main(String []args)
    {
        int input = scan.nextInt();
        
        while(input>0)
        {
            int n=scan.nextInt();

            if(isPrime(n))
            {
                System.out.println("Prime.\n");
            }else{
                System.out.println("Not prime.\n");
            }

            input--;
        }
    }
}