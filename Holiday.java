
import java.util.Scanner;

public class Holiday {

    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.equals("Saturday") || s.equals("Sunday"))
            System.out.println("false");
        else if(s.equals("Monday") || s.equals("Tuesday") s.equals("Wednesday") || s.equals("Thursday") s.equals("Friday"))
            System.out.println("true");
    }
}
