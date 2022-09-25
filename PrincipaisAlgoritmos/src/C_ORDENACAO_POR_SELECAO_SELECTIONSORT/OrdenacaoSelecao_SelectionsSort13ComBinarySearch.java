package C_ORDENACAO_POR_SELECAO_SELECTIONSORT;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoSelecao_SelectionsSort13ComBinarySearch {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>(List.of(-2, -10, 1, 2, 40, 3));
        lista = selectionSort(lista);
        System.out.println(lista);
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

    public static <T extends Comparable<T>> List<T> selectionSort(List<T> list) {
        List<T> listaFiltrada = new ArrayList<>();
        int tamanhoDaLista = list.size();

        for (int i = 0; i < tamanhoDaLista; i++) {
            int menorIndex = menorIndex(list);
            listaFiltrada.add(list.get(menorIndex));
            list.remove(menorIndex);
        }
        return listaFiltrada;
    }

    public static <T extends Comparable<T>> int menorIndex(List<T> list) {
        int menorIndex = 0;
        T menorObjeto = list.get(menorIndex);
        for (int i = 1; i < list.size(); i++) {
            if (menorObjeto.compareTo(list.get(i)) > 0) {
                menorObjeto = list.get(i);
                menorIndex = i;
            }
        }
        return menorIndex;
    }
}
