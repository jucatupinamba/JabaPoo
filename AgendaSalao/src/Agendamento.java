public class Agendamento extends Servico{
    private Integer calendario;            //Pesquisar import calendar
    private double horario;                //Pesquisar import time

    public Agendamento(String tipo, double tempo, double valor, Integer calendario, double horario) {
        super(tipo, tempo, valor);
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
}
