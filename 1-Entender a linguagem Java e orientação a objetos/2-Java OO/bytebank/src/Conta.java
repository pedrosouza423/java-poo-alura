import java.util.function.Function;

public class Conta {
    private double saldo;
    public int agencia;
    public int numero;
    public String titular;

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

    public double getSaldo() {
        return saldo;
    }

    
}
