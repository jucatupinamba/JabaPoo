public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected char sexo;
    protected int experiência;

    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiência = 0;
    }

    protected void ganharExp(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getExperiência() {
        return experiência;
    }

    public void setExperiência(int experiência) {
        this.experiência = experiência;
    }

    @Override
    public String toString() {
        return "Pessoa" +
                "Nome: " + nome + '\n' +
                "Idade: " + idade + '\n' +
                "Sexo: " + sexo + '\n' +
                "Experiência: " + experiência;
    }
}
