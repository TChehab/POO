import java.util.ArrayList;

// Classe Ensalamento que executa o ensalamento
class Ensalamento {
    public static void main(String[] args) {
        // Criação de objetos para alunos, professores, disciplinas e cursos
        Aluno[] alunos = {
            new Aluno("Alfredo", "TI"),
            new Aluno("Peterson", "ADM"),
            new Aluno("Wendel", "TI"),
            new Aluno("Ian", "ADM"),
            new Aluno("Debra", "TI"),
            new Aluno("Luana", "ADM"),
            new Aluno("Bruno", "TI"),
            new Aluno("Romeu", "ADM"),
            new Aluno("Julieta", "TI"),
            new Aluno("Maria", "ADM"),
            new Aluno("Capitú", "TI"),
            new Aluno("Bentinho", "ADM"),
            new Aluno("Amélia", "TI")
        };

        Professor[] professores = {
            new Professor("Mia", "POO"),
            new Professor("Saulo", "Estrutura de Dados"),
            new Professor("Paula", "BI")
        };

        Disciplina[] disciplinas = {
            new Disciplina("POO do curso de TI"),
            new Disciplina("Estrutura de Dados do curso de TI"),
            new Disciplina("BI do curso de ADM")
        };

        Curso[] cursos = {
            new Curso("TI"),
            new Curso("ADM")
        };

        // Adicionar disciplinas aos cursos
        cursos[0].adicionarDisciplina(disciplinas[0]);
        cursos[0].adicionarDisciplina(disciplinas[1]);
        cursos[1].adicionarDisciplina(disciplinas[2]);

        // Realizar ensalamento
        Turma turma1 = new Turma(professores[0], disciplinas[0]);
        Turma turma2 = new Turma(professores[1], disciplinas[1]);

        for (Aluno aluno : alunos) {
            if (aluno.getCurso().equals("TI")) {
                turma1.adicionarAluno(aluno);
            } else if (aluno.getCurso().equals("ADM")) {
                turma2.adicionarAluno(aluno);
            }
        }

        turma1.realizarEnsalamento();
        turma2.realizarEnsalamento();
    }
}
