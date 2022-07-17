import br.com.model.Gato;

import java.util.*;

public class  Main {
    public static void main(String[] args) {

        List<Gato> gatos = new ArrayList<>(){{
           add(new Gato("Menininha",5,"Malhada"));
            add(new Gato("Creiton",5,"Frajola"));
            add(new Gato("Vitoria",3,"Branca"));
        }};

        Collections.shuffle(gatos); // listando aleatoriamente
        System.out.println(gatos); // listando na ordem de inserção
        Collections.sort(gatos); // Ordenando por nome (implementando classe com Comparable
        Collections.sort(gatos, new ComparatorIdade()); // Criando classe para comparar a idade
        gatos.sort(new ComparatorIdade()); // outra forma de chamar a classe
        Collections.sort(gatos, new ComparatorCor()); // Criando classe para comparar a Cor
        gatos.sort(new ComparatorCor()); // outra forma de chamar a classe
        Collections.sort(gatos, new ComparatorNomeCorIdade()); // Criando classe para comparar a Nome e os desempates caso haja igual
        gatos.sort(new ComparatorNomeCorIdade()); // outra forma de chamar a classe
    }

}
class ComparatorIdade implements Comparator<Gato>{
    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato>{
    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if (cor != 0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}