package C_ORDENACAO_POR_SELECAO_SELECTIONSORT;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoSelecao_SelectionSort9ComBinarySearch {

    public static void main(String[] args) {
        List<Integer> listNum = new ArrayList<>(List.of(-2, 1, 4, -10, 7, 8, 9, 10));
        System.out.println(binarySearch(listNum,10));
    }

    public static <T extends Comparable> int binarySearch(List<T> list, T objetoProcurado) {
        list = selectionSort(list); //Ordenando a lista
        System.out.println(list);
        int alto = list.size();
        int baixo = 0;

        while (baixo <= alto) {
            int meio = (baixo + alto) / 2;
            T chute = list.get(meio);

            if (chute.compareTo(objetoProcurado) == 0) return meio;

            /*
               Exemplo:
               Chute = 10
               NumeroProcurado = 5
               Como o chute sempre é o meio este caso significa que o meio está muito alto em relação
               ao número buscado.

             */
            if (chute.compareTo(objetoProcurado) > 0) {
                alto = meio - 1;
            } else {
                /*
                    Exemplo:
                    Chute: 10
                    NumeroProcurado: 12
                    Como o chute é o meio e está abaixo do objeto procurado
                    significa que o meio está baixo em relação ao objeto procurado.

                 */
                baixo = meio + 1;
            }

        }


        return -1;
    }

    public static <T extends Comparable<T>> List<T> selectionSort(List<T> list) {
        List<T> listOrdenada = new ArrayList<>();
        int tamLista = list.size();
        for (int i = 0; i < tamLista; i++) {
            int menorIdx = menorIndex(list);
            listOrdenada.add(list.get(menorIdx));
            list.remove(menorIdx);
        }

        return listOrdenada;

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
}
