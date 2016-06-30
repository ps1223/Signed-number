import java.util.Scanner;


public class Prime {


    public static void main(String a[]) {

        int n, i;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(i = 2; i < n/2; i++)
        {
         
            if(n % i == 0)
            {
                break;
            }
            
        }
        if(i == n/2)
            System.out.print("Prime");
        else
            System.out.println("Not Prime");
        
    }
}
