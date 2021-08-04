public class TesteFuncionario {
    
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(("Pedro"), "123.456.789-10", 4200);

        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getBonificacao());

    }
}
