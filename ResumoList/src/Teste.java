import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        System.out.println(nomes); // exibe todas os itens da lista

        int index = nomes.indexOf("Carlos"); // retorna o indice do elemento
        nomes.set(index, "Roberto"); // altera o elemento por indice
        System.out.println(nomes); // exibe todas os itens da lista
        System.out.println(nomes.get(1));
        nomes.remove(4);
        System.out.println(nomes); // exibe todas os itens da lista
        nomes.remove("João");
        System.out.println(nomes); // exibe todas os itens da lista
        System.out.println(nomes.size()); //exibe tamanho da Lista
        nomes.contains("Juliana"); // Procura o elemento
        nomes2.add("Ismael");
        nomes2.add("Rodrigo");
        System.out.println(nomes2); // exibe todas os itens da lista
        nomes2.addAll(nomes);
        System.out.println(nomes2); // exibe todas os itens da lista
        Collections.sort(nomes2); // Ordena a lista do menor para o maior
        System.out.println(nomes2); // exibe todas os itens da lista
        nomes2.isEmpty(); // retorna boolean se vazia
        nomes.clear(); // esvazia
        nomes.isEmpty();


    }
}
