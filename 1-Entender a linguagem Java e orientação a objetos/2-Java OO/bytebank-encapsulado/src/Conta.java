public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

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

    //Getters
    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public Cliente getTitular() {
        return titular;
    }

    //Setters
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }


}
