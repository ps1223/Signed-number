
import java.util.Scanner;

/**
 *
 * @author PS
 */
public class Repeat {
    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = 0;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n - 1; j++) {
                if(arr[i] == arr[j]) {
                    flag = 1;
                    break;
                }
            }
            if(flag == 1) {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
