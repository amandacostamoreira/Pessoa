
public class Pessoa {

    private String nome;
    private int idade;
    private String cpf;
    
    public Pessoa() {
        nome= "sem nome";
        idade= 0
        cpf= "000.000.000-00"
    }
    
    public Pessoa(String nome,int idade, String cpf){
        this.nome= nome;
        this.idade= idade;
        this.cpf=cpf;
    }
    
    public void
            alteraDados(String nome, int idade, String cpf) {
                    this.nome=nome;
                    this.idade=idade;
                    this.cpf=cpf;
            }
            
public void mostraDados() {             
    System.out.println("nome: "+ nome);
    System.out.println("idade: "+ idade);
    System.out.println("cpf: "+ cpf);        
}


            
            
        
      
    

