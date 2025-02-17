package IdadeVotar;

public class Pessoa {
    public int idade;

    public Pessoa(int idade) {
        this.idade = idade;
    }

    public int VerificarIdade(){

        if (idade < 18){
            return 1;  //nao pode votar
        }else{
            return 2; //pode votar
        }

    }

}


