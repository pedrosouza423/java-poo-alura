public class CriaConta {
    
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.depositar(300);
        
        Conta pedroConta = new Conta();
        primeiraConta.transferir(200, pedroConta);

        System.out.println(primeiraConta.getSaldo()+ " Saldo da conta");
        System.out.println(pedroConta.getSaldo()+ " Saldo da conta do Pedro");

        pedroConta.titular = "Pedro Souza";
        System.out.println(pedroConta.titular);

    }
}
