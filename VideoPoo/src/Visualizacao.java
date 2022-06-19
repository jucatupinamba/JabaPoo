public class Visualizacao {
    private Gafanhoto espectador;
    private Video filmes;

    public Visualizacao(Gafanhoto espectador, Video filmes) {
        this.espectador = espectador;
        this.filmes = filmes;
        espectador.setTotAssistido(espectador.getTotAssistido() + 1);
        filmes.setViews(filmes.getViews() + 1);
    }

    public void avaliar(){          // abaixo o exemplo de sobrecarga
        filmes.setAvaliacao(5);

    }

    public void avaliar(int nota){     //métodos iguais assinaturas diferentes mesma classe
        filmes.setAvaliacao(nota);
    }

    public void avaliar(float porc){
        int tot = 0;
        if(porc <= 20){
            tot = 3;
        } else if (porc <= 50) {
            tot = 5;
        } else if (porc <= 90){
            tot = 8;
        } else {
            tot = 10;
        }
        filmes.setAvaliacao(tot);
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilmes() {
        return filmes;
    }

    public void setFilmes(Video filmes) {
        this.filmes = filmes;
    }
    @Override
    public String toString() {
        return "Gafanhoto: " + espectador.toString() + '\n' +
                "Filme: " + filmes.toString();
    }
}
