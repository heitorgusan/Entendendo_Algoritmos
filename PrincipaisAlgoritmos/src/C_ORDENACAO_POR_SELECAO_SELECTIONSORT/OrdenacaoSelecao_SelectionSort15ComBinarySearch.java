package C_ORDENACAO_POR_SELECAO_SELECTIONSORT;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoSelecao_SelectionSort15ComBinarySearch {

    public static void main(String[] args) {
        List<Integer> listTest = new ArrayList<>(List.of(-10, 20, 13, -30, 1, 2, -1));

        listTest = selectionSort(listTest);
        System.out.println(listTest);
        System.out.println(binarySearch(listTest, -1));
        System.out.println(binarySearch(listTest, 20));
        System.out.println(binarySearch(listTest, -30));
    }

    public static <T extends Comparable<T>> int binarySearch(List<T> list, T objetoProcurado) {
        List<T> newList = new ArrayList<>();
        int maiorIndex = list.size() - 1;
        int menorIndex = 0;

        while (menorIndex <= maiorIndex) {
            int indexMeio = (maiorIndex + menorIndex) / 2;
            T chuteObjeto = list.get(indexMeio);

            if (chuteObjeto.compareTo(objetoProcurado) == 0) return indexMeio;
            if (chuteObjeto.compareTo(objetoProcurado) > 0) {
                maiorIndex = indexMeio - 1;
            } else {
                menorIndex = indexMeio + 1;
            }
        }
        return -1;
    }

    public static <T extends Comparable<T>> List<T> selectionSort(List<T> list) {
        List<T> filteredList = new ArrayList<>();
        int sizeList = list.size();

        for (int i = 0; i < sizeList; i++) {
            int menorIndex = menorIndex(list);
            filteredList.add(list.get(menorIndex));
            list.remove(menorIndex);
        }
        return filteredList;
    }

    public static <T extends Comparable<T>> int menorIndex(List<T> list) {
        int menorIndex = 0;
        T menorObjeto = list.get(menorIndex);

        for (int i = 1; i < list.size(); i++) {
            if (menorObjeto.compareTo(list.get(i)) > 0) {
                menorIndex = i;
                menorObjeto = list.get(i);
            }
        }
        return menorIndex;
    }
}
