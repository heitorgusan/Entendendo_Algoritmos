package C_ORDENACAO_POR_SELECAO_SELECTIONSORT;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoSelecao_SelectionSort17ComBinarySearch {
    public static void main(String[] args) {
        List<Integer> listInteger = new ArrayList<>(List.of(-3, 2, 3, 4, 1, 2, -4000, 40_000));
        listInteger = selectionSort(listInteger);
        System.out.println(listInteger);
        System.out.println(binarySearch(listInteger, 40000));
    }

    public static <T extends Comparable<T>> int menorObjetoIndex(List<T> list) {
        int indexMenor = 0;
        T objetoMenor = list.get(indexMenor);

        for (int i = 1; i < list.size(); i++) {
            if (objetoMenor.compareTo(list.get(i)) > 0) {
                objetoMenor = list.get(i);
                indexMenor = i;
            }
        }
        return indexMenor;

    }

    public static <T extends Comparable<T>> List<T> selectionSort(List<T> list) {
        List<T> filteredList = new ArrayList<>();
        int sizeList = list.size();
        for (int i = 0; i < sizeList; i++) {
            int menorIndex = menorObjetoIndex(list);
            filteredList.add(list.get(menorIndex));
            list.remove(menorIndex);
        }
        return filteredList;
    }

    public static <T extends Comparable<T>> int binarySearch(List<T> list, T objetoProcurado) {
        int menorIndex = 0;
        int maiorIndex = list.size() - 1;

        while (menorIndex <= maiorIndex) {
            int indexMeio = (maiorIndex + menorIndex) / 2;
            T objetoMeio = list.get(indexMeio);

            if (objetoMeio.compareTo(objetoProcurado) == 0) return indexMeio;

            if (objetoMeio.compareTo(objetoProcurado) > 0) {
                maiorIndex = indexMeio - 1;
            } else {
                menorIndex = indexMeio + 1;
            }
        }

        return -1;
    }
}
