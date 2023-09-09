import java.util.ArrayList;

// Classe Turma
class Turma {
    private Professor professor;
    private Disciplina disciplina;
    private ArrayList<Aluno> alunos;

    public Turma(Professor professor, Disciplina disciplina) {
        this.professor = professor;
        this.disciplina = disciplina;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void realizarEnsalamento() {
        System.out.println("Ensalamento da turma:");
        System.out.println("Disciplina: " + disciplina.getNome());
        System.out.println("Professor: " + professor.getNome());
        System.out.println("Alunos matriculados:");
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome() + " - " + aluno.getCurso());
        }
        System.out.println();
    }
}

