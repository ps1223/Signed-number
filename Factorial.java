
import java.util.Scanner;

public class Factorial {

    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        if(n == 0)
            System.out.print("1");
        else
            System.out.print(fact);
    }
}

