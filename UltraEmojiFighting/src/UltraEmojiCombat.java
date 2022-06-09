import java.util.Scanner;

public class UltraEmojiCombat {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        Lutador l = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.90f, 11, 1, 2);
        l.ganharLuta();
        l.ganharLuta();
        l.apresentacao();
    }
}
