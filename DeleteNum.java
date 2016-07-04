
/**
 *
 * @author PS
 */
import java.util.Scanner;

public class DeleteNum {

    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int del = sc.nextInt();
        for(int i : arr)
            if(i != del)
                System.out.println(i + " ");
    }
}
