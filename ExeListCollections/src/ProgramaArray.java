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
        List<Double> lista = new ArrayList<>();

        lista.add(29.5d);
        lista.add(30.0d);
        lista.add(27.4d);
        lista.add(25.8d);
        lista.add(28.0d);
        lista.add(23.2d);

        Iterator<Double> iterator = lista.iterator();

        Double soma = 0d;
        while (iterator.hasNext()) {            //hasNext(true or false) - enqto tiver lista
            Double next = iterator.next();      //capta o dado do array e passa a variavel next
            soma += next;                       //passa o valor da variavel next para a soma - somando.
        }
        System.out.printf("A média de temperatura do semestre é : %.2fºC", soma/lista.size());
    }
}