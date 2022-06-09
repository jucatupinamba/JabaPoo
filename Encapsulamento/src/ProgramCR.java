public class ProgramCR {
    /*
        Programa simulando os comandos de um controle remoto;
        Exercício para a prática de encapsulamento;
     */
    public static void main (String [] args){
        ControleRemoto c = new ControleRemoto();
        //Comandos de teste do funcionamento do controle remoto.
        c.ligar();
        c.maisVolume();
        c.abrirMenu();
    }
}
