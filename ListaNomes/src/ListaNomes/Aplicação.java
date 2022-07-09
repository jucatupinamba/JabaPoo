package ListaNomes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Aplicação {
    public static void main (String [] args) {
        List<String> lista = new ArrayList<>(){{
            add("Carlos");
            add("Marcos");
            add(1, "David");        //add em array especifico
            add("Juca");
            add("Marcos");
            add("Maria");
            add("Luiza");
        }};
        int b = 0, c = 0;

        System.out.println(lista.indexOf("Marcos"));   // retorna o local do elemento pesquisado. caso false = -1
        lista.set(4, "Luffy");     //Troca a string fazendo referência à posição do array

        for (String x : lista) {
            if (x == "Marcos") {
                b++;
            } else {
                c++;
            }
        }
        System.out.println("Nome " + " encontrado " + b + " vezes, " + c + " nomes não compativeis.");
        System.out.println("Em uma lista de " + lista.size() + " nomes");
        System.out.println("Nome Marcos encontra-se na lista ? - " + lista.contains("Marcos"));
            // acima outro método booleano de pesquisa

        Collections.sort(lista);       //Ação para ordenar a lista, no caso, ordem alfabética
        System.out.println(lista);

    }

}

