public class Pessoa {

    // Atributos da classe (privados, seguindo encapsulamento)
    private String nome;
    private int idade;
    private String cpf;

    // ===== Construtor PARAMETRIZADO =====
    // Recebe os três valores na criação do objeto
    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    // ===== Construtor DEFAULT (padrão) =====
    // Não recebe parâmetros; inicializa com valores fixos
    public Pessoa() {
        this.nome = "Não informado";
        this.idade = 0;
        this.cpf = "000.000.000-00";
    }

    // ===== Método para alterar os três atributos =====
    public void alterarDados(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    // Getters (opcional, mas útil para acessar os dados)
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    // toString: facilita a exibição do objeto no println
    @Override
    public String toString() {
        return "Pessoa{nome='" + nome + "', idade=" + idade + ", cpf='" + cpf + "'}";
    }
}
