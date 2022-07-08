import java.util.Comparator;

public class Calculo implements Comparator<Calculo> {
    private Double temperatura;
    private String mes;

    private Double media;

    public Calculo(Double temperatura, String mes) {
        this.temperatura = temperatura;
        this.mes = mes;
    }

    public Calculo(Double media) {
        this.media = media;
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

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    @Override
    public int compareTo(Calculo calc) {
        return this.getTemperatura().compareTo(calc.getTemperatura());
    }

    @Override
    public int compare(Calculo o1, Calculo media) {
        return Double.compare(o1.getTemperatura(), media.getMedia());
    }
}
