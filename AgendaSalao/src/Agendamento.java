public class Agendamento extends Servico{
    private Integer calendario;            //Pesquisar import calendar
    private double horario;                //Pesquisar import time

    public Agendamento() {
        super(getTipo(), tempo, valor);
        this.calendario = calendario;
        this.horario = horario;
    }

    public Integer getCalendario() {
        return calendario;
    }

    public void setCalendario(Integer calendario) {
        this.calendario = calendario;
    }

    public double getHorario() {
        return horario;
    }

    public void setHorario(double horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Agendamento: " +
                "Nome: " + getNome() +
                "Telefone: " + getTelefone() +
                "Data: " + calendario +
                "Horario: " + horario;
    }
}
