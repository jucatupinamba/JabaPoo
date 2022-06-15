import java.util.Scanner;

public class ProgramaEscola {
    public static void main (String [] args){
        Usuario p1 = new Usuario();
        Aluno p2 = new Aluno();
        Funcionario p3 = new Funcionario();
        Professor p4 = new Professor();

        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");

        p2.setCurso("Informática");
        p4.setSalario(2500.75);
        p3.setSetor("Estoque");

        p4.receberAum();
        p2.alterarMatr();
        p3.mudarTrabalho();

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

    }
}
