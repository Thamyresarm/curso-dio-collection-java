
import java.util.LinkedList;
import java.util.Queue;

public class TesteQueue {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        fila.add("Juliana");
        fila.add("Pedro");
        fila.add("Carlos");
        fila.add("Larissa");
        fila.add("João");

        System.out.println(fila); //Exibe toda a Lista

        System.out.println(fila.peek()); // Mostra primeiro elemento sem remover
        System.out.println(fila); //Exibe toda a Lista
        System.out.println(fila.poll());
        System.out.println(fila); //Exibe toda a Lista
        fila.add("Daniel");
        System.out.println(fila); //Exibe toda a Lista
        //fila.indexOf("Daniel"); não tem como usar o indexof
        System.out.println(fila.size()); // Exibe tamanho da Lista
        System.out.println(fila.isEmpty()); // Exibe boolean se esta vazio
        System.out.println((fila.contains("Carlos"))); // verifica se o elemento esta na lista

    }
}
