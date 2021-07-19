public class TesteEscopo {
    
    public static void main(String[] args) {
        double salario = 2000.0;
        double taxa;


        if(salario > 1900 && salario <= 2800){
            taxa = 0.075 * salario;
            salario -= taxa;
        }else if(salario > 2800 && salario <= 3751){
            taxa = 0.15 * salario;
            salario -= taxa;
        }else{
            taxa = 0.225 * salario;
            salario -= taxa;
        }


        System.out.println(salario);
    }
}
