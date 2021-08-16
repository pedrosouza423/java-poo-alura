public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int numContas;

    public Conta(int agencia, int numero, Cliente titular){
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;

        numContas++;
    }

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
    public static int getNumContas() {
        return numContas;
    }

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
        if(numero <= 0){
            System.out.println("Você não pode colocar um número negativo ou igual a zero");
            return;
        }
        this.numero = numero;
    }

    public void setAgencia(int agencia) {
        if(agencia <= 0){
            System.out.println("Você não pode colocar um número de agencia negativo ou igual a zero");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }


}
