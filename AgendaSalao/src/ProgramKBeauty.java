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
       List<Servico> servico = new ArrayList<>();

       System.out.println("Digite o nome e telefone da cliente que deseja cadastrar: ");
       System.out.println("Digite END caso deseje encerrar a lista");

       for(int i = 0; i <= cliente.size(); i++){
           if(!scan.hasNext("END")){
               cliente.add(new Cliente(scan.nextLine(), scan.nextInt()));
           }
       }

       System.out.println("Qual serviço deseja cadastrar? \n 1 - Cabelo \n 2 - Unha");
       int serv = 0;
       if(serv == 1){

       }
       if(serv == 2){

       }
       else{
           System.out.println("Número inválido");
       }


    }
}
