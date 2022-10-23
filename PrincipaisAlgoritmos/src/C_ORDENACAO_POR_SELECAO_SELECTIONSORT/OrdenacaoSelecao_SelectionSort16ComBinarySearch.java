package C_ORDENACAO_POR_SELECAO_SELECTIONSORT;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoSelecao_SelectionSort16ComBinarySearch {

    public static void main(String[] args) {
        List<Integer> listNumbers = new ArrayList<>(List.of(10, 9, 8, 7, 6, 5, 22, -40));
        listNumbers = selectionSort(listNumbers);
        System.out.println(listNumbers);
        System.out.println(listNumbers.size());
        System.out.println(binarySearch(listNumbers,-40));
        System.out.println(binarySearch(listNumbers,22));
        System.out.println(binarySearch(listNumbers,7));
    }

    public static <T extends Comparable<T>> int binarySearch(List<T> list, T objetoProcurado) {
        int menorIndex = 0;
        int maiorIndex = list.size();

        while (menorIndex <= maiorIndex) {
            int meioIndex = (maiorIndex + menorIndex) / 2;
            T meioObjeto = list.get(meioIndex);

            if (objetoProcurado.compareTo(meioObjeto) == 0) return meioIndex;

            if (objetoProcurado.compareTo(meioObjeto) > 0) {
                menorIndex = menorIndex + 1;
            } else {
                maiorIndex = meioIndex - 1;
            }
        }
        return -1;
    }

    public static <T extends Comparable<T>> List<T> selectionSort(List<T> list) {
        List<T> ordenedList = new ArrayList<>();
        int listSize = list.size();
        for (int i = 0; i < listSize; i++) {
            int menorIndex = menorIndex(list);
            ordenedList.add(list.get(menorIndex));
            list.remove(menorIndex);
        }
        return ordenedList;
    }

    public static <T extends Comparable<T>> int menorIndex(List<T> list) {
        T menorObjeto = list.get(0);
        int menorIndex = 0;

        for (int i = 1; i < list.size(); i++) {
            if (menorObjeto.compareTo(list.get(i)) > 0) {
                menorIndex = i;
                menorObjeto = list.get(i);
            }
        }

        return menorIndex;
    }

}