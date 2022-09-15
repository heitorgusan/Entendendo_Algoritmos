package C_ORDENACAO_POR_SELECAO_SELECTIONSORT;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoSelecao_SelectionSort3 {
    public static void main(String[] args) {
        List<Integer>listNum = new ArrayList<>(List.of(1,2,-10));

        listNum = selectionSort(listNum);

        System.out.println(listNum);

    }

    public static <T extends Comparable<T>> List<T> selectionSort(List<T> list) {
        List<T> newlist = new ArrayList<>();
        int sizeList = list.size();
        for (int i = 0; i < sizeList; i++) {
            int menorIndex = menorIndex(list);
            newlist.add(list.get(menorIndex));
            list.remove(menorIndex);
        }
        return newlist;
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
