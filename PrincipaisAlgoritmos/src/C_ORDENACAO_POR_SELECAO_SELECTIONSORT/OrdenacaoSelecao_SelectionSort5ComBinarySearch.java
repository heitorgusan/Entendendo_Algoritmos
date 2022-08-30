package C_ORDENACAO_POR_SELECAO_SELECTIONSORT;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoSelecao_SelectionSort5ComBinarySearch {

    public static void main(String[] args) {
        List<Integer> numsList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, -10, -255, 100));
        numsList = ordenarBySelecao(numsList);
        numsList.forEach(System.out::println);
        System.out.println("POSICAO DO CINCO "+binarySearch(numsList,5));

    }

    public static <T extends Comparable<T>> int binarySearch(List<T> list, T obj) {
        int alto = list.size() - 1;
        int baixo = 0;

        while (baixo <= alto) {
            int meio = (alto + baixo) / 2;
            T chute = list.get(meio);

            if (chute.compareTo(obj) == 0) return meio;
            if (chute.compareTo(obj) > 0) {
                alto = meio - 1;
            } else {
                baixo = meio + 1;
            }
        }

        return -1;
    }

    public static <T extends Comparable<T>> List<T> ordenarBySelecao(List<T> list) {
        List<T> listaOrdenada = new ArrayList<>();
        int tamanhoLista = list.size();
        for (int i = 0; i < tamanhoLista; i++) {
            int menorIdx = menorIndex(list);
            listaOrdenada.add(list.get(menorIdx));
            list.remove(menorIdx);
        }

        return listaOrdenada;
    }

    public static <T extends Comparable<T>> int menorIndex(List<T> list) {
        int menorIndex = 0;
        T menorObj = list.get(menorIndex);

        for (int i = 1; i < list.size(); i++) {
            if (menorObj.compareTo(list.get(i)) > 0) {
                menorObj = list.get(i);
                menorIndex = i;
            }
        }
        return menorIndex;
    }
}
