public class TestaBanco {
    
    public static void main(String[] args) {
        Cliente pedro = new Cliente();
        pedro.nome = "Pedro Souza";

        Conta contaDoPedro = new Conta();
        contaDoPedro.titular = pedro;

        System.out.println(contaDoPedro.titular.nome);
        

    }
}
