import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcionarios {
    public static void main (String [] args){
        Processo processo = new Processo();
        List<Object> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int i = 0;

        System.out.println("Quantos funcionários deseja cadastrar? ");
        int quant = sc.nextInt();

        while (i < quant){
            System.out.println("Digite a ID: ");
            processo.setId(sc.nextInt());
            sc.nextLine();
            System.out.println("Digite o nome do funcionário: ");
            processo.setNome(sc.nextLine());
            System.out.println("Digite o salário: R$ ");
            processo.setSalario(sc.nextDouble());
            lista.add(new Processo(processo.getId(), processo.getNome(), processo.getSalario())); //dificuldade em captar dados
            i++;
        }
        
        //or(int i : lista){
            System.out.println("Empregado #" + i );
            System.out.println(lista.get(i).toString());
        }
    }
