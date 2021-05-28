package problemas.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class URI1002 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        double n = 3.14159;
        double raio = in.nextDouble();
        double area = n * Math.pow(raio, 2);
        System.out.printf("A=%.4f\n", area);

        in.close();
    }
}
