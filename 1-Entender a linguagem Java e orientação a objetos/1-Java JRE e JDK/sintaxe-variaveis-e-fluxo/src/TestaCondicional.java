public class TestaCondicional {
    
    public static void main(String[] args) {
        int idade = 16;
        boolean acompanhado = true;

        if(idade >= 18 || (idade >= 16 && acompanhado == true) ){
            System.out.println("Pode entrar");
        }else{
            System.out.println("Você não pode entrar");
        }



    }
}
