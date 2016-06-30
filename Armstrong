import java.util.Scanner;

public class Armstrong {

    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);
        int sum = 0, n, t;
        n = sc.nextInt();
        int s = n;
        while(n > 0) {
            
            t = n % 10;
            sum += t*t*t;
            n /= 10;
        }
        
        if(s == sum)
            System.out.println("Armstrong number");
        else
            System.out.println("Not Armstrong number");
    }
}
