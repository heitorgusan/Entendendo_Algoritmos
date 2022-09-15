package C_ORDENACAO_POR_SELECAO_SELECTIONSORT;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoSelecao_SelectionSort11ComBinarySearch {

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(List.of("Heitor", "Vinicius", "Aninha", "Bacon"));
        System.out.println(menorIndex(nomes));
        nomes = selectionSort(nomes);

        System.out.println(nomes);

        System.out.println(binarySearch(nomes,"Aninha"));
        System.out.println(binarySearch(nomes,"Bacon"));
        System.out.println(binarySearch(nomes,"Heitor"));
        System.out.println(binarySearch(nomes,"Vinicius"));


    }

    public static <T extends Comparable<T>> int binarySearch(List<T> list, T objetoProcurado) {
        int idxAlto = list.size() - 1;
        int idxBaixo = 0;

        while (idxBaixo <= idxAlto) {
            int idxMeio = (idxAlto + idxBaixo) / 2;
            T objetoMeio = list.get(idxMeio);

            if (objetoMeio.compareTo(objetoProcurado) == 0) return idxMeio;
            if (objetoMeio.compareTo(objetoProcurado) > 0) {
                //Objeto meio = 10
                //Objeto procurado 2
                //Meu meio está alto em relacao ao objeto procurado
                // Entao meu novo alto será o meio -1
                idxAlto = idxMeio - 1;
            } else {
                idxBaixo = idxMeio + 1;
            }
        }

        return -1;

    }

    public static <T extends Comparable<T>> int menorIndex(List<T> list) {

        T menorObjeto = list.get(0);
        int menorIndex = 0;

        for (int i = 1; i < list.size(); i++) {
            if (menorObjeto.compareTo(list.get(i)) > 0) {
                menorObjeto = list.get(i);
                menorIndex = i;
            }
        }
        return menorIndex;
    }

    public static <T extends Comparable<T>> List<T> selectionSort(List<T> list) {
        List<T> newArray = new ArrayList<>();
        int sizeList = list.size();

        for (int i = 0; i < sizeList; i++) {
            int menorIndex = menorIndex(list);
            newArray.add(list.get(menorIndex));
            list.remove(menorIndex);
        }

        return newArray;
    }
}
