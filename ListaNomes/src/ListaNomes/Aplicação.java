package ListaNomes;

import java.util.ArrayList;
import java.util.List;

public class Aplicação {
    public static void main (String [] args){
        List<String> lista = new ArrayList<String>();

        lista.add("Carlos");
        lista.add("Marcos");
        lista.add("Max");
        lista.add("David");
        lista.add("Bob");

        for( String x : lista){
        System.out.println(lista.contains("Marcos"));  // teste
        }








    }
}
