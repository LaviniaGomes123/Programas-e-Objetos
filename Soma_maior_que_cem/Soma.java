package Soma_maior_que_cem;

public class Soma {
    public int primeiro_numero;
    public int segundo_numero;

    public Soma (int primeiro_numero, int segundo_numero){
        this.primeiro_numero = primeiro_numero;
        this.segundo_numero = segundo_numero;
    }
    //verifica se a soma é maior que 100
    public int VerificandoSoma(){
        int sum = primeiro_numero + segundo_numero;
        if (sum > 100){
            return 1;
        }else {
            return 2;
        }

    }

}
