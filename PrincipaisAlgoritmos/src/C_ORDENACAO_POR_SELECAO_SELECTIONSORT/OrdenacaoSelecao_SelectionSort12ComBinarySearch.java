package C_ORDENACAO_POR_SELECAO_SELECTIONSORT;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoSelecao_SelectionSort12ComBinarySearch {

    public static void main(String[] args) {
        List<Integer> idades = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,99,100,87,54,32,22,13,14,15));
        idades = selectionSort(idades);
        System.out.println(idades);
        System.out.println(binarySearch(idades,13));
        System.out.println(binarySearch(idades,14));
        System.out.println(binarySearch(idades,1));
    }

    public static <T extends Comparable<T>> int binarySearch(List<T> list, T objetoProcurado) {
        int alto = list.size() - 1;
        int baixo = 0;

        while (baixo <= alto) {
            int meio = (alto + baixo) / 2;
            T objetoMeio = list.get(meio);

            if (objetoMeio.compareTo(objetoProcurado) == 0) return meio;

            if (objetoMeio.compareTo(objetoProcurado) > 0) {
                alto = meio - 1;
            } else {
                baixo = meio + 1;
            }
        }
        return -1;
    }

    public static <T extends Comparable<T>> int menorindex(List<T> list) {
        int menorindex = 0;
        T menorobjeto = list.get(menorindex);

        for (int i = 1; i < list.size(); i++) {
            if (menorobjeto.compareTo(list.get(i)) > 0) {
                menorindex = i;
                menorobjeto = list.get(i);
            }

        }
        return menorindex;
    }

    public static <T extends Comparable<T>> List<T> selectionSort(List<T> list) {
        List<T> listaOrdenada = new ArrayList<>();
        int sizeNum = list.size();

        for (int i = 0; i < sizeNum; i++) {
            int menorIndex = menorindex(list);
            listaOrdenada.add(list.get(menorIndex));
            list.remove(menorIndex);
        }

        return listaOrdenada;
    }

}