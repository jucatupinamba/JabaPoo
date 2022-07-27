package application.produtos;

import java.util.ArrayList;
import java.util.List;

public class ListaDeCompras extends Produtos {

    List<Produtos> listaProdutos = new ArrayList<>();

    protected ListaDeCompras(String nome, String setor, Double preco) {
        super(nome, setor, preco);
    }
}
