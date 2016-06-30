import java.util.Scanner;


public class Odd {


    public static void main(String arg[]) {

        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        
        for(int i = a+1; i < b; i++)
            if(i % 2 == 1)
                System.out.println(i);
    }
}
