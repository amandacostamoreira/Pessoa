public class TestePessoa {

    public static void main(String[] args) {

        // Objeto criado com o construtor PARAMETRIZADO
        Pessoa pessoa1 = new Pessoa("Maria Silva", 30, "123.456.789-00");

        // Objeto criado com o construtor DEFAULT
        Pessoa pessoa2 = new Pessoa();

        System.out.println("Pessoa 1: " + pessoa1);
        System.out.println("Pessoa 2 (antes de alterar): " + pessoa2);

        // Alterando os dados do segundo objeto usando o método criado
        pessoa2.alterarDados("João Souza", 25, "987.654.321-00");

        System.out.println("Pessoa 2 (depois de alterar): " + pessoa2);
    }
}
