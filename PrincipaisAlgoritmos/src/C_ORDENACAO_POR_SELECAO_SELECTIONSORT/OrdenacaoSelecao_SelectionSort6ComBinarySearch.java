package C_ORDENACAO_POR_SELECAO_SELECTIONSORT;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoSelecao_SelectionSort6ComBinarySearch {
    public static List<Integer> listNums = new ArrayList<>(List.of(1, 2, 3, 4, 5, 10, -50));

    public static void main(String[] args) {
        listNums = selectionSort(listNums);
        System.out.println(listNums);
        System.out.println(binarySearch(listNums,-50));
        System.out.println(binarySearch(listNums,2));
        System.out.println(binarySearch(listNums,10));
    }

    public static <T extends Comparable<T>> int binarySearch(List<T> list, T objDesejado) {
        int alto = list.size() - 1;
        int baixo = 0;

        while (baixo <= alto) {
            int meio = (alto + baixo) / 2;
            T chute = list.get(meio);

            if (chute.compareTo(objDesejado) == 0) return meio;
            if (chute.compareTo(objDesejado) > 0) {
                alto = meio - 1;
            } else {
                baixo = meio + 1;
            }

        }

        return -1;
    }

    public static <T extends Comparable<T>> int menorIndex(List<T> list) {
        int menorIndex = 0;
        T menorObjeto = list.get(menorIndex);
        for (int i = 1; i < list.size(); i++) {
            if (menorObjeto.compareTo(list.get(i)) > 0) {
                menorObjeto = list.get(i);
                menorIndex = i;
            }
        }
        return menorIndex;
    }

    public static <T extends Comparable<T>> List<T> selectionSort(List<T> list) {
        List<T> newList = new ArrayList<>();
        int sizeList = list.size();
        for (int i = 0; i < sizeList; i++) {
            int menorIdx = menorIndex(list);
            newList.add(list.get(menorIdx));
            list.remove(menorIdx);
        }
        return newList;
    }
}
