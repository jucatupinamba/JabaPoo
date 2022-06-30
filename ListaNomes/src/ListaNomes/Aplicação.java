package ListaNomes;

import java.util.ArrayList;
import java.util.List;

public class Aplicação {
    public static void main (String [] args){
        List<String> lista = new ArrayList<>();

        lista.add("Carlos");
        lista.add("Marcos");
        lista.add("Max");
        lista.add(1, "David");
        lista.add("Bob");

        System.out.println(lista.indexOf("Marcos"));   // retorna o local do elemento pesquisado. caso false = -1









    }
}
