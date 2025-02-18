public class Aluno extends Pessoa {

    private int matricula;

    public Aluno (){
        this("", 0, 0);
        this.matricula = 0;
    }

    public Aluno (String nome, int idade){
        this (nome,idade, 0,0);
    }

    public Aluno (String nome, int idade, long cpf, int matricula){
        super(nome,idade,cpf);
        this.matricula = matricula;
    }

    public void setMatriculaAluno ( int setMatriculaAluno){
        this.setMatriculaAluno = setMatriculaAluno;
    }

    public int getMatriculaAluno (){
        return thisget.MatriculaAluno;
    }

    @Override
    public String toString (){
        return "Aluno{ "Aluno " + super.toString() + ", matricula =" + getMatriculaAluno() + "}";
    }
}