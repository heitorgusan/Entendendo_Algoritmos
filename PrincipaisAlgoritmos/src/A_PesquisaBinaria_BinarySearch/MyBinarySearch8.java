package A_PesquisaBinaria_BinarySearch;

import A_PesquisaBinaria_BinarySearch.domain.Produto;

import java.util.ArrayList;
import java.util.List;

public class MyBinarySearch8 {
    static List<Produto> produtos = new ArrayList<>(
            List.of(
                    new Produto("Carro"),
                    new Produto("Moto"),
                    new Produto("Water"),
                    new Produto("Blue"),
                    new Produto("Aatrox")
            )
    );

    public static void main(String[] args) {
        System.out.println(binarySearch(produtos, new Produto("Moto")));
    }


    public static <T extends Comparable<T>> int binarySearch(List<T> lista, T objetoProcurado) {
        lista = selectionSort(lista);
        int alto = lista.size() - 1;
        int baixo = 0;
        while (baixo <= alto) {
            int meio = (alto + baixo) / 2;
            T chute = lista.get(meio);

            if (chute.compareTo(objetoProcurado) == 0) return meio;

            if (chute.compareTo(objetoProcurado) > 0) {
                alto = meio - 1;
            } else {
                baixo = meio + 1;
            }
        }
        return -1;
    }


    public static <T extends Comparable<T>> int posicaoMenor(List<T> lista) {
        T menor = lista.get(0);
        int indexMenor = 0;

        for (int i = 1; i < lista.size(); i++) {
            if (menor.compareTo(lista.get(i)) > 0) {
                menor = lista.get(i);
                indexMenor = i;
            }
        }

        return indexMenor;
    }

    public static <T extends Comparable<T>> List<T> selectionSort(List<T> lista) {
        List<T>ordenedList = new ArrayList<>();
        int listSize=  lista.size();
        for(int i = 0 ;  i < listSize ; i++){
            int pos = posicaoMenor(lista);
            ordenedList.add(lista.get(pos));
            lista.remove(pos);
        }

        return ordenedList;
    }
}