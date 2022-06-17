public class Mamifero  extends Animal{
    protected char corPelo;

    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero.");
    }

    public char getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(char corPelo) {
        this.corPelo = corPelo;
    }
}
