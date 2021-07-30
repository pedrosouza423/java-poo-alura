public class TestaBanco {
    
    public static void main(String[] args) {
        Cliente primeiraConta = new Cliente();
        primeiraConta.nome = "Pedro Souza";

        Conta contaDoPedro = new Conta();
        contaDoPedro.titular = primeiraConta.nome;

    }
}
