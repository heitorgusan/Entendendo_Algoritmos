package C_ORDENACAO_POR_SELECAO_SELECTIONSORT;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoSelecao_SelectionSort4ComBinarySearch {

    public static void main(String[] args) {
        List<Integer> numsList = new ArrayList<>(List.of(1, 24, -26, 7, -8, 10));
        System.out.println(binarySearch(numsList, 24));
    }

    private static <T extends Comparable<T>> int binarySearch(List<T> list, T obj) {
        list = selectionSort(list);
        int alto = list.size() - 1;
        int baixo = 0;

        while (baixo <= alto) {
            int meio = (alto + baixo) / 2;
            T chute = list.get(meio);

            if (chute.compareTo(obj) == 0) return meio;

            if (chute.compareTo(obj) > 0) {
                alto = meio - 1;
            } else {
                baixo = meio + 1;
            }
        }

        return -1;
    }

    private static <T extends Comparable<T>> List<T> selectionSort(List<T> list) {
        List<T> newList = new ArrayList<>();
        int sizeOfList = list.size();

        for (int i = 0; i < sizeOfList; i++) {
            int menorIndex = menorIndex(list);
            newList.add(list.get(menorIndex));
            list.remove(menorIndex);
        }

        return newList;
    }

    private static <T extends Comparable<T>> int menorIndex(List<T> list) {
        int menorIndex = 0;
        T menorObj = list.get(menorIndex);

        for (int i = 0; i < list.size(); i++) {
            if (menorObj.compareTo(list.get(i)) > 0) {
                menorObj = list.get(i);
                menorIndex = i;
            }
        }

        return menorIndex;
    }
}
