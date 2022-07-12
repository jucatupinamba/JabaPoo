package ListaNomes;
/*
Criar um programa onde, ao informar um nome, ele deve pesquisar em uma lista já existente o nome informado.
Ele deve retornar uma msg dizendo se foi encontrado ou não o nome nessa lista.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Aplicação {
    public static void main (String [] args) {

        Processo processo = new Processo();
        Scanner scan = new Scanner(System.in);
        List<String> lista = new ArrayList<>(){{        //inicialização da lista
            add("Carlos");
            add("Marcos");
            add(1, "David");        //add em array especifico
            add("Juca");
            add("Teepo");
            add("Maria");
            add("Luiza");
        }};

       System.out.println("Digite o nome a pesquisar: ");
       processo.setNome(scan.nextLine());

       for(int i = 0; i < lista.size(); i++){                  //laço para percorrer a lista
           if(lista.get(i).equals(processo.getNome())){         //lógica booleana para pesquisa do nome
               System.out.println("Nome " + processo.getNome() + " encontrado com sucesso.");   //saída de dados
           }
           else{
               System.out.println("Nome pesquisado não encontrado.");               //saída de dados
           }
       }
    }
}

