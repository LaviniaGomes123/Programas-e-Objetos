package MaiorNumero;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //usuario insere os numeros
        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        Numero numero = new Numero(a, b, c);

        // Obtém o maior número
        int aux = numero.MaiorNumero();

        // Imprime o maior número
        System.out.println("maior numero: " + aux);

        sc.close();
    }
}
