public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    // public Funcionario(String nome, String cpf, double salario) {
    //     this.nome = nome;
    //     this.cpf = cpf;
    //     this.salario = salario;
    // }

    public double getBonificacao(){
        return this.salario * 0.05;
    }

    //Getters
    public String getCpf() {
        return cpf;
    }
    
    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    //Setters
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


}
