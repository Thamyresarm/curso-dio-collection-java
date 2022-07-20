import java.util.*;

public class resumoSet {
    public static void main(String[] args) {

        Set<Integer> numerosSet = new HashSet<>();

        numerosSet.add(3);
        numerosSet.add(88);
        numerosSet.add(20);
        numerosSet.add(44);
        numerosSet.add(3);

        System.out.println(numerosSet);

        numerosSet.remove(3); //remover primeiro objeto não tem indice

        System.out.println(numerosSet);

        numerosSet.add(23);

        System.out.println(numerosSet.isEmpty());

        System.out.println(numerosSet.size());

        System.out.println(numerosSet);

        System.out.println("---------------");

        LinkedHashSet<Integer> numerosSet2 = new LinkedHashSet<>();

        numerosSet2.add(3);
        numerosSet2.add(88);
        numerosSet2.add(20);
        numerosSet2.add(44);
        numerosSet2.add(3);

        System.out.println(numerosSet2);

        numerosSet2.remove(3); //remover primeiro objeto não tem indice

        System.out.println(numerosSet2);

        numerosSet2.add(23);

        System.out.println(numerosSet2.isEmpty());

        System.out.println(numerosSet2.size());

        System.out.println(numerosSet2);

        System.out.println("---------------");
        TreeSet<Integer> numerosSet3 = new TreeSet<>();

        numerosSet3.add(3);
        numerosSet3.add(88);
        numerosSet3.add(20);
        numerosSet3.add(44);
        numerosSet3.add(3);

        System.out.println(numerosSet3);

        //lower and higher para exibir o abaixo do valor indicado e acima do valor indicado

        numerosSet3.pollFirst(); //remover primeiro objeto não tem indice pollLast para o ultimo

        System.out.println(numerosSet3);

        numerosSet3.add(23);

        System.out.println(numerosSet3.isEmpty());

        System.out.println(numerosSet3.size());

        System.out.println(numerosSet3);

    }
}
