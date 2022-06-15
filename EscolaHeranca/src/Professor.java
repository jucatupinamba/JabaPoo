public class Professor extends Usuario{
    private String especialidade;
    private double salario;

    public void receberAum(){
        setSalario(getSalario() * 0.05);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
