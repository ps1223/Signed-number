import java.util.Scanner;

public class PrimeSeries {

    public static void main(String arg[]) {

        int a, b, i;
        Scanner sc = new Scanner(System.in);
        int count = 0;
        a = sc.nextInt();
        b = sc.nextInt();
        for (int n = a + 1; n < b; n++) {
            for (i = 2; i < n / 2; i++) {

                if (n % i == 0) {
                    break;
                }

            }
            if (i == n / 2) {
                count++;
            }
        }
        System.out.print(count);
    }
}
