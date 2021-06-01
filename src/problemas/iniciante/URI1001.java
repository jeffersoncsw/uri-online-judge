package problemas.iniciante;

import java.io.IOException;
import java.util.Scanner;

public class URI1001 {

    public static void main(String[] args) throws IOException {
        int a;
        int b;
        int x = 0;

        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        x = a + b;
        System.out.println("X = " + x);
        in.close();
    }
}
