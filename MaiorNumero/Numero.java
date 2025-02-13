package MaiorNumero;

public class Numero {
    public int a;
    public int b;
    public int c;


    public Numero(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //verifica o maior numero
    public int MaiorNumero() {
        int aux;
        if (a > b && a > c) {
            aux = a;
        } else if (b > a && b > c) {
            aux = b;
        } else {
            aux = c;
        }
        return aux;
    }
}





