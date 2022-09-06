package C_ORDENACAO_POR_SELECAO_SELECTIONSORT;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Vou fazer com Array agora
public class OrdenacaoSelecao_SelectionSort7ComBinarySearch {

    public static void main(String[] args) {

        int[] listaOrdenada = selectionSort(new int[]{1, 2, 3, -4, 6, -10, 22});
        Arrays.stream(listaOrdenada).forEach(s -> System.out.print(s + " "));
        System.out.println();
        System.out.println("O número está localizado no INDEX: " + binarySearch(listaOrdenada, 22, true));

    }

    public static int binarySearch(int[] array, int numeroBuscado, boolean isOrdenado) {
        if (!isOrdenado) array = selectionSort(array);
        int lowIndex = 0;
        int maxIndex = array.length - 1;
        int midIndex;
        while (lowIndex <= maxIndex) {
            midIndex = (lowIndex + maxIndex) / 2;
            if (numeroBuscado == array[midIndex]) return midIndex;

            if (numeroBuscado > array[midIndex]) {
                lowIndex = midIndex + 1;

            } else {
                maxIndex = midIndex - 1;
            }


        }
        return -1;
    }

    public static int menorIndex(int[] arrayInteiros) {
        int menorIdx = 0;
        int menorNum = arrayInteiros[menorIdx];

        for (int i = 1; i < arrayInteiros.length; i++) {
            if (menorNum > arrayInteiros[i]) {
                menorNum = arrayInteiros[i];
                menorIdx = i;
            }
        }
        return menorIdx;
    }

    public static int[] selectionSort(int[] disorderedArray) {
        int lengthArray = disorderedArray.length;
        int[] newArray = new int[lengthArray];
        List<Integer> listArr = IntStream.of(disorderedArray).boxed().collect(Collectors.toList());
        for (int i = 0; i < lengthArray; i++) {
            int menorIdx = menorIndex(disorderedArray);
            newArray[i] = listArr.remove(menorIdx);
            disorderedArray = listArr.stream().mapToInt(Integer::intValue).toArray();
        }
        return newArray;
    }
}
