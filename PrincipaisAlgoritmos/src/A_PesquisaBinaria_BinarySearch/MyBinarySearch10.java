package A_PesquisaBinaria_BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class MyBinarySearch10 {
    private static List<Integer> listInteger = new ArrayList<>(List.of(1, 2, -7, 3, -4));

    public static void main(String[] args) {
        System.out.println(binarySearh(listInteger, 1));
    }

    private static <T extends Comparable<T>> int binarySearh(List<T> list, T objetoProcurado) {
        list = selectionSort(list);//Ordenação

        int alto = list.size() - 1;
        int baixo = 0;

        while (baixo <= alto) {
            int meio = (alto + baixo) / 2;
            T chute = list.get(meio);

            if (chute.compareTo(objetoProcurado) == 0) return meio;

            if (chute.compareTo(objetoProcurado) > 0) {
                alto = meio - 1;
            } else {
                baixo = meio + 1;
            }
        }
        return -1;
    }

    private static <T extends Comparable<T>> List<T> selectionSort(List<T> list) {
        List<T> listaOrdenada = new ArrayList<>();
        int sizeList = list.size();

        for (int i = 0; i < sizeList; i++) {
            int menorIndex = menorIndex(list);
            listaOrdenada.add(list.get(menorIndex));
            list.remove(menorIndex);
        }

        return listaOrdenada;

    }

    private static <T extends Comparable<T>> int menorIndex(List<T> list) {
        T menor = list.get(0);
        int menorIndex = 0;

        for (int i = 0; i < list.size(); i++) {
            if (menor.compareTo(list.get(i)) > 0) {
                menor = list.get(i);
                menorIndex = i;
            }
        }

        return menorIndex;
    }

}
