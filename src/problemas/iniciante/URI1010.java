package problemas.iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class URI1010 {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int codigo;
        int quantidade;
        double valor;
        double total = 0;
        double valorTotal = 0;

        for(int i = 1; i <= 2; i++){
            codigo = sc.nextInt();
            quantidade = sc.nextInt();
            valor = sc.nextDouble();
            total =  quantidade * valor;
            valorTotal += total;
        }
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);

        sc.close();
    }
}
