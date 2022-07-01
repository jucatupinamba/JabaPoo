package ListaNomes;

import java.util.ArrayList;
import java.util.List;

public class Aplicação {
    public static void main (String [] args) {
        List<String> lista = new ArrayList<>();
        Processo pr = new Processo();

        int b = 1;

        lista.add("Carlos");
        lista.add("Marcos");
        lista.add("Max");
        lista.add(1, "David");
        lista.add("Bob");
        lista.add("Marcos");
        lista.add("Donna");

        System.out.println(lista.indexOf("Marcos"));   // retorna o local do elemento pesquisado. caso false = -1

        for (String x : lista) {

            if (x == "Marcos"){     // problema do desafio resolvido, melhorar a lógica da impressão de dados
                System.out.println("Nome " + x + " encontrado " + b + " vezes.");
                b++;
            }


        }
    }

}

