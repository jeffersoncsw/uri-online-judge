package problemas.iniciante;

import java.io.IOException;
import java.util.Scanner;

public class URI1001 {

    public static void main(String[] args) throws IOException {
        int A;
        int B;
        int X = 0;

        Scanner in = new Scanner(System.in);
        A = in.nextInt();
        B = in.nextInt();
        X = A + B;
        System.out.println("X = " + X);
        in.close();
    }
}
