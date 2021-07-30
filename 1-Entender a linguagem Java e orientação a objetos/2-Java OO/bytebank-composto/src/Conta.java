import java.util.function.Function;

public class Conta {
    private double saldo;
    public int agencia;
    public int numero;
    public String titular;

    //Métodos
    public void sacar(double valor) {
        if(valor > this.saldo){
            System.out.println("Saldo indisponivel em sua conta");
            return;
        }
        this.saldo -= valor;
    }

    public void depositar(double valor) {
        if(valor < 0){
            System.out.println("Você não pode depositar valores negativos");
            return;
        }
        this.saldo += valor;
    }

    public void transferir(double valor, Conta conta) {
        if(valor > this.saldo){
            System.out.println("Você não possui saldo o suficiente para essa transferencia");
            return;
        }

        this.sacar(valor);
        conta.depositar(valor);

    }

    //Getters e setters
    public double getSaldo() {
        return saldo;
    }

    
}
