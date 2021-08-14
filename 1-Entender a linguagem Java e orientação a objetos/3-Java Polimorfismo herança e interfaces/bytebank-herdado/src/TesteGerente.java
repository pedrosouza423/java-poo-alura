public class TesteGerente {
    
    public static void main(String[] args) {
        Gerente gerente = new Gerente();

        gerente.setNome("Pedro");
        gerente.setCpf("12345678910");
        gerente.setSalario(5000);
        gerente.setSenha(123);

        System.out.println(gerente.getBonificacao());
    }
}
