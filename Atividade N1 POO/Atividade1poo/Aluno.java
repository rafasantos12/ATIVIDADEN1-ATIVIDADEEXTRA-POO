public class Aluno {
    private String nome;
    private int idade;
    private String curso;
   
    public Aluno(String nome, int idade, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        
    }
    public String getNome() {
        return nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public String getCurso() {
        return curso;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + ", tenho " + idade + " anos e estou cursando " + curso + ".");
    }
    
    public void estudar() {
        System.out.println(nome + " está estudando para a prova de " + curso + ".");
    }
}
