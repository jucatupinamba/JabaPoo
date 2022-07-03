
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/*
 Lista de funcionários com funcionalidade de aumento, verificação de ID
 Desenvolvendo alguns princípios de Orientação ao Objeto e instanciação de objeto em lista.
 */

public class Funcionarios{

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Processo> list = new ArrayList<>();

        // PARTE 1 - LEITURA DE DADOS:

        System.out.print("Quantos funcionários serão registrados? ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println();
            System.out.println("Funcionário #" + i + ": ");

            System.out.print("Id: ");
            int id = sc.nextInt();
            while (hasId(list, id)) {
                System.out.print("Id existente. Tente novamente: ");
                id = sc.nextInt();
            }

            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salário: ");
            double salary = sc.nextDouble();
            list.add(new Processo(id, name, salary));
        }

        // PARTE 2 - AUMENTO DE SALÁRIO:

        System.out.println();
        System.out.print("Digite a id do funcionário para receber aumento: ");
        int id = sc.nextInt();
        Processo emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null) {
            System.out.println("Esta id não existe!");
        }
        else {
            System.out.print("Digite a porcentagem: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        // PART 3 - LISTING EMPLOYEES:

        System.out.println();
        System.out.println("Lista de funcionários:");
        for (Processo obj : list) {
            System.out.println(obj);
        }

        sc.close();
    }

    public static boolean hasId(List<Processo> list, int id) {
        Processo emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}