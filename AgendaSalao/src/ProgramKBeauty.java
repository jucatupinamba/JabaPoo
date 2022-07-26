import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Programa em produção, para trabalhar os conceitos de POO
//Projeto pessoal
public class ProgramKBeauty {
    public static void main (String [] args){
       Scanner scan = new Scanner(System.in);
       Agendamento a1 = new Agendamento();
       List<Cliente> cliente = new ArrayList<>();

       System.out.println("Digite o nome e telefone da cliente que deseja cadastrar: ");
       System.out.println("Digite 0 caso deseje encerrar a lista");

       for(int i = 0; i <= cliente.size(); i++){
           if(!scan.hasNextInt()){
               cliente.add(new Cliente(scan.nextLine(), scan.nextInt()));
           }
       }
    }
}
