package C_ORDENACAO_POR_SELECAO_SELECTIONSORT;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoSelecao_SelectionSort8ComBinarySearch {

    public static void main(String[] args) {
        List<Integer> arrNum = new ArrayList<>(List.of(20, -30, 1, 7, 3, 10));
        System.out.println(binarySearch(arrNum, -30));

    }

    public static <T extends Comparable<T>> int binarySearch(List<T> lista, T objetoDesejado) {
        lista = selectionSort(lista);
        System.out.println(lista);
        int alto = lista.size() - 1;
        int baixo = 0;

        while (baixo <= alto) {
            int indexMeio = (alto + baixo) / 2;
            T objMeio = lista.get(indexMeio);

            if (objetoDesejado.compareTo(objMeio) == 0) return indexMeio;
            if (objMeio.compareTo(objetoDesejado) > 0) {
                //10  -> 5
                alto = indexMeio - 1;
            } else {
                //10 -> 30
                baixo = indexMeio + 1;
            }
        }

        return -1;
    }

    public static <T extends Comparable<T>> int menorIndex(List<T> list) {
        int menorIndex = 0;
        T menorObj = list.get(menorIndex);

        for (int i = 1; i < list.size(); i++) {
            if (menorObj.compareTo(list.get(i)) > 0) {
                menorIndex = i;
                menorObj = list.get(i);
            }
        }
        return menorIndex;
    }

    public static <T extends Comparable<T>> List<T> selectionSort(List<T> list) {
        List<T> newList = new ArrayList<>();
        int tamanhoLista = list.size();

        for (int i = 0; i < tamanhoLista; i++) {
            int menor = menorIndex(list);
            newList.add(list.get(menor));
            list.remove(menor);
        }
        return newList;
    }
}
