package Soma_maior_que_cem;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira 2 numeros: ");
        int primeiro_numero = sc.nextInt();
        int segundo_numero = sc.nextInt();

        Soma soma = new Soma(primeiro_numero,segundo_numero);

        int ResultadoNumero = soma.VerificandoSoma();

        ResultadoSoma(ResultadoNumero);

        sc.close();
    }

    public static void ResultadoSoma(int ResultadoNumero){
        if (ResultadoNumero == 1){
            System.out.println("a soma dos numeros inseridos é maior que 100");
        }else {
            System.out.println("a soma dos numeros inseridos nao é maior que 100");
        }
        // product.setQuantity(qunatity);
    }
}
