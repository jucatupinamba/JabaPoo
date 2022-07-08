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


        Iterator<Calculo> iterator = lista.iterator();

        Object soma = 0;         //modificar lógica double não soma com objeto
        while (iterator.hasNext()) {            //hasNext(true or false) - enqto tiver lista
            Object next = iterator.next();      //capta o dado do array e passa a variavel next
            soma += next;                       //passa o valor da variavel next para a soma - somando.
        }

        Double media = soma/lista.size();       //Calculando a média da temperatura
        Calculo calc = new Calculo(media);      //Passando a média para outro construtor

        System.out.printf("A média de temperatura do semestre é : %.2fºC", media);



    }
}