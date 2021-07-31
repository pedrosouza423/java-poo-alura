public class TestaGetESet {
    
    public static void main(String[] args) {
        Conta conta = new Conta(1001, 54, new Cliente("Pedro Souza", "123.456.789-10", "Programador"));
        
        System.out.println(conta.getTitular().getNome());
        System.out.println(conta.getTitular().getCpf());
        System.out.println(conta.getTitular().getprofissao());
        
        System.out.println(conta.getSaldo());


    }
}
