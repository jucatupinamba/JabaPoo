//Programa em produção, para trabalhar os conceitos de POO
//Projeto pessoal
public class ProgramKBeauty {
    public static void main (String [] args){

       Agendamento a1 = new Agendamento();
       a1.setNome("Marcia");
       a1.setTelefone(33224499);
       a1.setCalendario(12);
       a1.setHorario(12.45);
       System.out.println(a1.toString());

    }
}
