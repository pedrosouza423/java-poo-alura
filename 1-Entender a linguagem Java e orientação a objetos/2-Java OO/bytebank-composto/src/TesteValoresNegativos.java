public class TesteValoresNegativos {
    
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.depositar(-2);
        // conta.sacar(200);
        System.out.println(conta.getSaldo());

    }
}
