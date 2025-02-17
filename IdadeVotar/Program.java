package IdadeVotar;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite sua idade");
        int idade = sc.nextInt();

        Pessoa pessoa = new Pessoa(idade);

        int Resultado = pessoa.VerificarIdade();

        ShowResult(Resultado);

        sc.close();

    }
    public static void ShowResult(int Resultado){
        if (Resultado == 1 ){
            System.out.println("nao pode votar");
        }else if (Resultado == 2){
            System.out.println("pode votar");
        }
    }
}
