public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, char sexo, int experiência, String login, int totAssistido) {
        super(nome, idade, sexo, experiência);
        this.login = login;
        this.totAssistido = totAssistido;
    }

    public void viuMaisUm(){

    }


}
