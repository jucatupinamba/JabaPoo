public class Animais {
    String tipoAnimal;
    double peso;

    public Animais(String tipoAnimal, double peso) {
        super();
        this.tipoAnimal = tipoAnimal;
        this.peso = peso;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
