import java.util.Scanner;
public class towerOfHanoi {
    static Scanner scan = new Scanner(System.in);

    static void Tower(int n,char from, char to, char aux)
    {
        // Inorder 
        if(n==0) return;
        Tower(n-1, from, aux, to);
        System.out.println("From "+from+" to "+ to);
        Tower(n-1,aux,to,from);
    }
    public static void main(String[] args) {
        System.out.print("Enter the number of rings in the tower : ");
        int level = scan.nextInt();

        Tower(level,'A','B','C');
    }
}
