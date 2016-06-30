import java.util.Scanner;

public class Reverse {

    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(new StringBuffer(s).reverse().toString());
    }
}

