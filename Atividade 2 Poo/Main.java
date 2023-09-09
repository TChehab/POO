import java.util.ArrayList;

// Classe Pessoa para representar alunos e professores
class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

// Classe Aluno que herda de Pessoa
class Aluno extends Pessoa {
    private String curso;

    public Aluno(String nome, String curso) {
        super(nome);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }
}

// Classe Professor que herda de Pessoa
class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, String disciplina) {
        super(nome);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }
}

// Classe Disciplina
class Disciplina {
    private String nome;

    public Disciplina(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

// Classe Curso
class Curso {
    private String nome;
    private ArrayList<Disciplina> disciplinas;

    public Curso(String nome) {
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }
}

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
