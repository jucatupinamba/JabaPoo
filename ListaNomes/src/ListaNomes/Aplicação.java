package ListaNomes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplicação {
    public static void main (String [] args) {
        List<String> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Processo pr = new Processo();

        int b = 0, c =0;
        String nome;

        lista.add("Carlos");
        lista.add("Marcos");
        lista.add("Max");
        lista.add(1, "David");
        lista.add("Bob");
        lista.add("Marcos");
        lista.add("Donna");


        System.out.println(lista.indexOf("Marcos"));   // retorna o local do elemento pesquisado. caso false = -1

        for (String x : lista) {
            if (x == "Marcos"){
                b++;
            } else{
                c++;
            }
        }
        System.out.println("Nome " + " encontrado " + b + " vezes, " + c + " nomes não compativeis.");
        System.out.println("Em uma lista de " +  lista.size() + " nomes");
    }

}

