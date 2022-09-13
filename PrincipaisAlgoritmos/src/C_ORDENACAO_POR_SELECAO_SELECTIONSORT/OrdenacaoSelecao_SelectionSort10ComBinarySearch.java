package C_ORDENACAO_POR_SELECAO_SELECTIONSORT;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoSelecao_SelectionSort10ComBinarySearch {
    public static void main(String[] args) {
        List<Integer> listIntegers = new ArrayList<>(List.of(-10, 20, 1, 2, 3, -9, 0));

        listIntegers = selectionSort(listIntegers);
        System.out.println(listIntegers);

        System.out.println(binarySearch(listIntegers, -10));
        System.out.println(binarySearch(listIntegers, -9));
        System.out.println(binarySearch(listIntegers, 0));
        System.out.println(binarySearch(listIntegers, 1));
        System.out.println(binarySearch(listIntegers, 2));
        System.out.println(binarySearch(listIntegers, 20));

        int x = 5;
        test(x);
        System.out.println(x);
    }

    private static void test (int t){
        t = 100;

    }
    public static <T extends Comparable<T>> int binarySearch(List<T> list, T object) {
        int alto = list.size() - 1;
        int baixo = 0;
        while (baixo <= alto) {
            int meio = (baixo + alto) / 2;
            T chute = list.get(meio);

            if (chute.compareTo(object) == 0) return meio;
            if (chute.compareTo(object) > 0) {
                alto = meio - 1;
            } else {
                baixo = meio + 1;
            }
        }
        return -1;
    }

    public static <T extends Comparable<T>> int menorIndex(List<T> list) {
        int menorIndex = 0;
        T t = list.get(menorIndex);
        for (int i = 1; i < list.size(); i++) {
            if (t.compareTo(list.get(i)) > 0) {
                menorIndex = i;
                t = list.get(i);
            }
        }
        return menorIndex;
    }

    public static <T extends Comparable<T>> List<T> selectionSort(List<T> list) {
        List<T> newList = new ArrayList<>();
        int listSize = list.size();
        for (int i = 0; i < listSize; i++) {
            int menorIndex = menorIndex(list);
            newList.add(list.get(menorIndex));
            list.remove(menorIndex);
        }

        return newList;
    }
}