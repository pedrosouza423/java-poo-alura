public class Gerente extends Funcionario {
    private int senha;

    public Gerente() {
        super();
    }
    

    public boolean autenticar(int senha){
        if(this.senha == senha){
            return true;
        }
        return false;
    }

    // public double getBonificacao(){
    //     return this.salario;
    // }

}
