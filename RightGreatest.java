
/**
 *
 * @author PS
 */
import java.util.Scanner;

public class RightGreatest {

    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int largest;
        for(int i = 0; i < n - 2; i++) {
            largest = i + 1;
            for(int j = i + 2; j < n; j++) {
                if(arr[largest] < arr[j]) {
                    largest = j;
                }
            }
            arr[i] = arr[largest];
        }
        arr[n - 2] = arr[n - 1];
        arr[n - 1] = 0;
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}
