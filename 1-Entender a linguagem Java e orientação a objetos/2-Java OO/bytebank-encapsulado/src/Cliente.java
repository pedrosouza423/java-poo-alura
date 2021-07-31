public class Cliente {
        private String nome;
        private String cpf;
        private String profissao;

        public Cliente(String nome, String cpf, String profissao) {
            this.nome = nome;
            this.cpf = cpf;
            this.profissao = profissao;
        }

        //getters
        public String getNome() {
            return nome;
        }

        public String getCpf() {
            return cpf;
        }

        public String getprofissao() {
            return profissao;
        }

        //setters
        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public void setprofissao(String profissao) {
            this.profissao = profissao;
        }

}
