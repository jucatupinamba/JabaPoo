import java.util.Comparator;

public class Calculo {
    private Double temperatura;
    private String mes;



    public Calculo(Double temperatura, String mes) {
        this.temperatura = temperatura;
        this.mes = mes;
    }

    public String toString(){
        return getMes() + ' ' + getTemperatura() + "ºC";
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

}