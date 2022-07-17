import java.util.*;

public class ExemploList {
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<Double>();

        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        System.out.println("Exibindo lista" + notas.toString());
        System.out.println("Exibindo a posição da nota 5.0: " + notas.indexOf(5d));
        System.out.println("Adicionando na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println("Substituindo a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0); // usou o set com o paramentro localizando a posição
        System.out.println("Confirindo se a nota 5.0 está na lista: " + notas.contains(5d)); // retorna bolean
        System.out.println("Exibindo todas as notas na ordem em que foram informados: ");
        for (Double nota : notas) System.out.print(nota + " "); // foreach
        System.out.println("");
        System.out.println("Exibindo a terceira nota adicionada: " + notas.get(2));
        System.out.println("Exibindo a menor nota: " + Collections.min(notas));
        System.out.println("Exibindo a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator(); // percorre a List
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);
        System.out.println("Exiba a média das notas: " + (soma/notas.size())); // size tamanho da List
        System.out.println("Remova a nota de valor 0: ");
        notas.remove(0d);
        System.out.println("Remova a nota da posição 0");
        notas.remove(0);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

       // System.out.println("Apague toda a lista");
      //  notas.clear();

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty()); // retorna boleam

        LinkedList notas2 = new LinkedList(notas); // recebendo valores de Notas
        System.out.println(notas2);

        System.out.println(notas2.get(0));
        notas2.remove(0);

    }
}