
import java.util.Scanner;

public class SwapChar {

    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String letter[] = s.split("");
        for (int i = 1; i < letter.length - 1; i += 2) {
         
            String j = letter[i + 1];
            letter[i + 1] = letter[i];
            letter[i] = j;
        }
        for(String a : letter)
            System.out.print(a);
    }
}
