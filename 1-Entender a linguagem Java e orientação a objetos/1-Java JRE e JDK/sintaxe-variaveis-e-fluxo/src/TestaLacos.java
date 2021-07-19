public class TestaLacos {
    
    public static void main(String[] args) {
        int total = 1;
        int num = 9;
        for (int i = num; i > 1; i--) {
            total *= i;
            // System.out.println(i);
        }

        System.out.println("O fatorial de "+num+ " = "+total );

    }
}
