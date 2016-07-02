
/**
 *
 * @author PS
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LeastNumber {

    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        int []a = new int[String.valueOf(num).length()];
        for(int i = 0; num > 0; i++) {
            a[i] = num % 10;
            num = num / 10;
        }
        while(k > 0) {
            int large = 0;
            for(int i = 0; i < a.length - 1; i++) {
                if(a[i] < a[i + 1]) {
                    large = i + 1;
                }
            }
            a[large] = -1;
            k--;
        }
        Arrays.sort(a);
        for(int i : a) {
            if(i != -1)
                System.out.print(i);
        }
    }
}
