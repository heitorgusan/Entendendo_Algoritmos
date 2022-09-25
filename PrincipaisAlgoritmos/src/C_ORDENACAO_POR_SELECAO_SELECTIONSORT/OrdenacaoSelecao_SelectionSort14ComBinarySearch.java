package C_ORDENACAO_POR_SELECAO_SELECTIONSORT;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoSelecao_SelectionSort14ComBinarySearch {

    public static void main(String[] args) {
        List<Integer>numList = new ArrayList<>(List.of(1,3,-4,19,2));
        numList = selectionSort(numList);
        System.out.println(numList);
        System.out.println("Posicao do 3: " + binarySearch(numList,3));
        System.out.println("Posicao do -4: "+binarySearch(numList,-4));
        System.out.println("Posicao do 19: "+binarySearch(numList,19));
    }

    public static <T extends Comparable<T>> int binarySearch(List<T> list, T objetoProcurado) {
        int alto = list.size() - 1;
        int baixo = 0;

        while (baixo <= alto) {
            int indexMeio = (alto + baixo) / 2;
            T chuteMeio = list.get(indexMeio);

            if (chuteMeio.compareTo(objetoProcurado) == 0) return indexMeio;
            if(chuteMeio.compareTo(objetoProcurado)> 0 ){
                alto = indexMeio -1;
            }else{
                baixo = indexMeio +1;
            }
        }

        return -1;
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
}
