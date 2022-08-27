package C_ORDENACAO_POR_SELECAO_SELECTIONSORT;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoSelecao_SelectionSort3ComBinarySearch {

    public static void main(String[] args) {
        List<Integer> listInteiros = new ArrayList<>(List.of(1, -28, 3, -4));
        List<String> listProductNames = new ArrayList<>(List.of("Heitor", "Ana", "Gabriela", "Felipe", "Fabio", "Fernando", "Bacalhau"));
        //listProductNames = selectionSort(listProductNames);
        //listProductNames.forEach(System.out::println);
        System.out.println(binarySearch(listInteiros,3,false));
        //listInteiros = selectionSort(listInteiros);
        //listInteiros.forEach(System.out::println);
    }
    private static <T extends Comparable<T>> int binarySearch(List<T> list, T desireObj, boolean isOrdered) {
        //Ordenar Lista
        if(!isOrdered) list = selectionSort(list);
        int higherIndex = list.size() - 1;
        int lowestIndex = 0;

        while (lowestIndex <= higherIndex) {
            int midIndex = (higherIndex + lowestIndex) / 2;
            T midObj = list.get(midIndex);
            if (midObj.compareTo(desireObj) == 0) return midIndex;

            if (midObj.compareTo(desireObj) > 0) {
                //Significa que o obj do meio está muito alto em relação ao obj procurado.
                higherIndex = midIndex - 1;
            } else {
                //Significa que o obj do meio está muito abaixo do procurado na lista
                lowestIndex = midIndex + 1;
            }
        }

        return -1; //Caso o objeto procurado não exista retorna -1
    }

    private static <T extends Comparable<T>> List<T> selectionSort(List<T> list) {
        List<T> newList = new ArrayList<>();
        int sizeOfList = list.size();
        for (int i = 0; i < sizeOfList; i++) {
            int lowestIndex = lowestIndex(list);
            newList.add(list.remove(lowestIndex));
        }
        return newList;
    }

    private static <T extends Comparable<T>> int lowestIndex(List<T> list) {
        int lowestIndex = 0;
        T smallObj = list.get(lowestIndex);

        for (int i = 1; i < list.size(); i++) {
            if (smallObj.compareTo(list.get(i)) > 0) {
                smallObj = list.get(i);
                lowestIndex = i;
            }
        }
        return lowestIndex;
    }
}
