
import java.util.Scanner;

public class StringToInt {

    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i;
        for(i = 0; i < s.length(); i++) {
            if(!Character.isDigit(s.charAt(i)))
                break;
        }
        if(i == s.length())
            System.out.print(Integer.parseInt(s));
        else
            System.out.print("Not a valid int");
    }
}
