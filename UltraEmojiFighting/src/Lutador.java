public class Lutador {
    private String nome;

    private String  nacionalidade;
    private int idade;
    private double altura, peso;

    private String categoria;
    private int vitoria, empate, derrota;

    public Lutador(String no, String na, int id, double al, double pe,
                        int vi,  int de, int em){
        setNome(no);
        setNacionalidade(na);
        setIdade(id);
        setAltura(al);
        setPeso(pe);
        setVitoria(vi);
        setDerrota(de);
        setEmpate(em);
    }
    public void apresentacao(){
        System.out.println("Lutador: " + getNome());
        System.out.println("Origem: " + getNacionalidade());
        System.out.println(getIdade() + " anos");
        System.out.printf("%.2f m de altura %n", getAltura());
        System.out.printf("Pesando: %.2f Kg %n", getPeso());
        System.out.println("Categoria: Peso " + getCategoria());
        System.out.println("Ganhou: " + getVitoria());
        System.out.println("Perdeu: " + getDerrota());
        System.out.println("Empatou: " + getEmpate());
    }

    public void status(){
        System.out.println(getNome());
        System.out.println("É um peso " + getCategoria());
        System.out.println(getVitoria() + " vitórias");
        System.out.println(getDerrota() + " derrotas");
        System.out.println(getEmpate() + " empates");
    }

    public void ganharLuta(){
        setVitoria(getVitoria() + 1);
    }

    public void perderLuta(){
        setDerrota(getDerrota() + 1);
    }

    public void empatarLuta(){
        setEmpate(getEmpate() + 1);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double al) {
        this.altura = al;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double pe) {
        this.peso = pe;
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(peso < 52.2){
            categoria = "Inválido";
        }
        else if (peso <= 70.30){
            categoria = "Leve";
        }
        else if(peso <= 83.90){
            categoria = "Médio";
        }
        else if (peso > 83.90 && peso < 120.00){
            categoria = "Pesado";
        }
        else {
            categoria = "Inválido";
        }
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vi) {
        this.vitoria = vi;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int em) {
        this.empate = em;
    }

    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int de) {
        this.derrota = de;
    }
}
