package ListaNomes;

import java.util.List;

public class Processo {
    public static Boolean procuraNome(List<String> lista, int posicaoAtual, String nome) {
        for(int i = 0; i < posicaoAtual; i++) {
            if(lista.equals(nome)) {
                return true;
            }
        }

        return false;
    }
}
