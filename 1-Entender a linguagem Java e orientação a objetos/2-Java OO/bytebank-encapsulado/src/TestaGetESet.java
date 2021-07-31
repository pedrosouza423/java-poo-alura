public class TestaGetESet {
    
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setNumero(1234);
        System.out.println(conta.getNumero());

        Cliente cliente = new Cliente();
        conta.setTitular(cliente);

        cliente.setNome("Pedro Henrique");
        cliente.setCpf("123.456.789-10");
        cliente.setprofissao("Programador");
        
        System.out.println(conta.getTitular().getNome());
        System.out.println(conta.getTitular().getCpf());
        System.out.println(conta.getTitular().getprofissao());


    }
}
