public class Gerente extends Funcionario {
    private int senha;

    // public Gerente() {
    //     super(String nome, String cpf, double salario);
    // }
    
    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autenticar(int senha){
        if(this.senha == senha){
            return true;
        }
        return false;
    }

    public double getBonificacao(){
        return super.getBonificacao() + super.getSalario();
    }

}
