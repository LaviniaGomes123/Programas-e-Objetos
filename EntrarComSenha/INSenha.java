package EntrarComSenha;

public class INSenha {
    public int senha;

    public INSenha(int senha){
        this.senha = senha;
    }

    public int VerificarSenha(){
        if (senha == 1234){
            return 1;
        }else{
            return 2;
        }

    }

}
