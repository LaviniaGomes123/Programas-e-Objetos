package IdadeVotar;

public class Idade {
    public int idade;
    
    public Pessoa(int idade){
        this.idade = idade;

        public int VerificarIdade(){
            int aux;
            if (idade < 18){
                aux = 1;
            }else if (idade >= 18){
                aux = 2;
            }
        }
    }

}
