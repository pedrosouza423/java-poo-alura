public class TesteReferencia {
    
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Pedro");
        g1.setSalario(5000);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        System.out.println(controle.getSoma());

        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(2000);
        controle.registra(funcionario);
        System.out.println(controle.getSoma());

        EditorVideo editorVideo = new EditorVideo();
        editorVideo.setSalario(2500);
        controle.registra(editorVideo);
        System.out.println(controle.getSoma());

    }
}
