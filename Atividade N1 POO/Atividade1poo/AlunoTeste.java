public class AlunoTeste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Rafael", 20, "001", "ADS");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Idade: " + aluno1.getIdade());
        System.out.println("Matrícula: " + aluno1.getMatricula());
        System.out.println("Curso: " + aluno1.getCurso());

        Aluno aluno2 = new Aluno("Maria Santos", 21, "002", "Medicina");
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Idade: " + aluno2.getIdade());
        System.out.println("Matrícula: " + aluno2.getMatricula());
        System.out.println("Curso: " + aluno2.getCurso());

        Aluno aluno3 = new Aluno("Pedro Souza", 19, "003", "Direito");
        System.out.println("Nome: " + aluno3.getNome());
        System.out.println("Idade: " + aluno3.getIdade());
        System.out.println("Matrícula: " + aluno3.getMatricula());
        System.out.println("Curso: " + aluno3.getCurso());
    }
}