public class ProgramaVideo {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Dogtown");
        v[1] = new Video("Kelly Potter");
        v[2] = new Video("Condenados");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, 'M', "juba");
        g[1] = new Gafanhoto("Creuza", 12, 'F', "creuzita");


        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[0]);
        System.out.println(vis[0].toString());
    }
}
