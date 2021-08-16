public class ContaCorrente extends Conta{
    
    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    //Métodos
    @Override
    public void sacar(double valor) {
        valor += 0.2;
        if(valor > 0){
            super.sacar(valor);
        }
        System.out.println("Sua conta não possui saldo o suficiente para sacar este valor");
        return;
    }

}
