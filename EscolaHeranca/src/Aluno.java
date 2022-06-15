public class Aluno extends Usuario{
    private boolean matricula;
    private String curso;

    public void alterarMatr(){
       this.matricula = ! matricula;
    }

    public boolean isMatricula() {
        return matricula;
    }

    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
