public class CriaConta {
    
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.depositar(300);
        System.out.println(primeiraConta.getSaldo());
        
        primeiraConta.sacar(310);
        System.out.println(primeiraConta.getSaldo());

    }
}
