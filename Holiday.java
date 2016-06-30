
import java.util.Scanner;

public class Holiday {

    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.equals("Saturday") || s.equals("Sunday"))
            System.out.println("false");
        else
            System.out.println("true");
    }
}
