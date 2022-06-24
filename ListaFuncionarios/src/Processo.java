import java.util.List;

public class Processo {
    private int id;
    private String nome;
    private double salario;
    private double porcentagem;

    public Processo() {

    }

    public Processo(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentoSalario(){
        
    }

    @Override
    public String toString() {
        return "Id: " + getId() + '\n' +
                "Nome: " + getNome() + '\n' +
                "Salario: " + getSalario();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(double porcentagem) {
        this.porcentagem = porcentagem;
    }
}
