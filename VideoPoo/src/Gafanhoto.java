public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, char sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }

    public void viuMaisUm(){

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override  // poliforfismo por sobrescrição
    public String toString() {
        return "Gafanhoto " + '\n' +
                "---------------" + '\n' +
                "Nome: " + getNome() + '\n' +
                "Idade: " + getIdade() + '\n' +
                "Sexo: " + getSexo() + '\n' +
                "Login: " + getLogin() + '\n' +
                "Vídeos Assistidos: " + getTotAssistido();
    }
}
