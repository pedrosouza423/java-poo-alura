public class TesteReferencias {
    
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;
        System.out.println("saldo primeira conta é " + primeiraConta.saldo);

        Conta segundaConta = primeiraConta;
        segundaConta.saldo = 500;
        
        System.out.println(primeiraConta.saldo);

    }
}
