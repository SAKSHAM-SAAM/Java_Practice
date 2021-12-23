/**
 * PStringBuild
 */
import java.util.*;
/**
 * thing
 */
class thing {

    StringBuilder name = new StringBuilder("");

    thing(String pname)
    {
        this.name.append(pname);
    }
    @Override
    public String toString() {
        //// TODO Auto-generated method stub
        return name.toString();
    }
};
public class PStringBuild {
    static Scanner scan = new Scanner(System.in);
    static void solve()
    {
        String input = scan.next();
        thing one = new thing(input);
        
        System.out.printf("String of the class thing -> %s", one);
    }
    public static void main(String[] args) {
        int tt = scan.nextInt();
        while(tt > 0)
        {
            solve();
            tt--;
        }
    }
}