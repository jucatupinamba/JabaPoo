/*
Faça um programa que receba a temperatura média dos 6
primeiros meses do ano e armazene-as em uma lista.

Após isto, calcule a média semestral das temperaturas e
mostre todas as temperaturas acima desta média, e em que
mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2
– Fevereiro e etc).
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProgramaArray {
    public static void main(String[] args) {

        List<Calculo> lista = new ArrayList<>(){{
            add(new Calculo(30.1d, "Janeiro"));
            add(new Calculo(28.5d, "Fevereiro"));
            add(new Calculo(29.1d, "Março"));
            add(new Calculo(25.4d, "Abril"));
            add(new Calculo(26.7d, "Maio"));
            add(new Calculo(24.6d, "Junho"));
        }};

        double soma = 0;
        for(int i = 0; i < lista.size(); i++){              //lógica para somar todas as temperaturas do período
            soma += lista.get(i).getTemperatura();
        }

        double media = soma/lista.size();                   //cálculo da média de temperatura do período
        System.out.printf("A média de temperatura no período foi de %.2f%n", media);

        System.out.println("Os meses que tiveram temperatura acima da média foram: ");
        for(int i=0; i < lista.size(); i++) {               //laço com lógica para impressão de condicionais
                if (lista.get(i).getTemperatura() > media) {    //lógica para condicional de temperatura acima da média
                System.out.println(lista.get(i).toString());
            }
        }
    }


}