package C_ORDENACAO_POR_SELECAO_SELECTIONSORT;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoSelecao_SelectionSort18 {

    private static List<String> listNames = new ArrayList<>(List.of("Heitor", "Felipe", "Fred", "Ana", "Luan", "Maicon"));

    public static void main(String[] args) {
        try {

            listNames = selectionSort(listNames);
            System.out.println(listNames);
            System.out.println(binarySort(listNames,"Heitor"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static <T extends Comparable<T>> int menorIndex(List<T> list) throws Exception {
        if (list.isEmpty()) throw new Exception("List is empty");
        int menorIndex = 0;
        T menorObjeto = list.get(menorIndex);
        for (int i = 1; i < list.size(); i++) {
            T objetoAtual = list.get(i);
            if (objetoAtual.compareTo(menorObjeto) < 0) {
                menorObjeto = objetoAtual;
                menorIndex = i;
            }
        }
        return menorIndex;
    }

    private static <T extends Comparable<T>> List<T> selectionSort(List<T> list) throws Exception {
        if (list.isEmpty()) throw new Exception("List is empty");
        List<T> filteredList = new ArrayList<>();
        int sizeList = list.size();

        for (int i = 0; i < sizeList; i++) {
            int menorIndex = menorIndex(list);
            filteredList.add(list.get(menorIndex));
            list.remove(menorIndex);
        }
        return filteredList;
    }

    private static <T extends Comparable<T>> int binarySort(List<T> list, T object) throws Exception {
        int highestIndex = list.size() - 1;
        int lowestIndex = 0;

        while (lowestIndex <= highestIndex) {
            int midIndex = (highestIndex + lowestIndex) / 2;
            T midObject = list.get(midIndex);
            if (midObject.compareTo(object) == 0) return midIndex;
            if(midObject.compareTo(object) >0){
                highestIndex = midIndex - 1;
            }else{
                lowestIndex = midIndex + 1;
            }
        }

        return -1;

    }
}
