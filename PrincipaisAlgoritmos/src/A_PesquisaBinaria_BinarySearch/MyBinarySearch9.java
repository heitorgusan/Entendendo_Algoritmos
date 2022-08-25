package A_PesquisaBinaria_BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class MyBinarySearch9 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 2, 3, 4, 5, -2, 7, 12, -40, 11, 10));
        System.out.println(binarySearch(nums, -40));

    }

    public static <T extends Comparable<T>> int binarySearch(List<T> list, T objetoProcurado) {
        list = selectionSort(list);
        int alto = list.size() - 1;
        int baixo = 0;

        while (baixo <= alto) {
            int meio = (alto + baixo) / 2;
            T chute = list.get(meio);
            if (objetoProcurado.compareTo(chute) == 0) return meio;

            if (chute.compareTo(objetoProcurado) > 0) {
                alto = meio - 1;
            } else {
                baixo = meio + 1;
            }
        }

        return -1;
    }

    private static <T extends Comparable<T>> int menorIndex(List<T> list) {
        T menorObj = list.get(0);
        int menorIndex = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).compareTo(menorObj) < 0) {
                menorObj = list.get(i);
                menorIndex = i;
            }
        }

        return menorIndex;
    }

    private static <T extends Comparable<T>> List<T> selectionSort(List<T> disorderedList) {
        List<T> orderedList = new ArrayList<>();
        int originalListSize = disorderedList.size();
        for (int i = 0; i < originalListSize; i++) {
            int lowest = menorIndex(disorderedList);
            orderedList.add(disorderedList.get(lowest)); //Adicionando o menor a nova lista.
            disorderedList.remove(lowest);//Removendo da lista o menor.
        }

        return orderedList;
    }
}
