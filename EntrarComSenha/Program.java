package EntrarComSenha;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a senha: ");
        int senha = sc.nextInt();

        INSenha inSenha = new INSenha(senha);

        int Result= inSenha.VerificarSenha();

        Show(Result);

        sc.close();

    }

    public static void Show(int Result){
        if (Result == 1){
            System.out.println("BEM VINDO!");
        }else{
            System.out.println("SENHA INCORRETA!");
        }
    }

}
