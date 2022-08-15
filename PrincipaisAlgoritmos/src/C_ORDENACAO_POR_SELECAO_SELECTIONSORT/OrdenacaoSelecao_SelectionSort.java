package C_ORDENACAO_POR_SELECAO_SELECTIONSORT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Ordena do menor para maior.
public class OrdenacaoSelecao_SelectionSort {
    public static void main(String[] args) {
        int[] array = ordenarArray(new Integer[]{3,4,5,6,7,8,10,23,1,-9,2,99});
        for (int n : array) {
            System.out.println(n);
        }
    }

    public static int[] ordenarArray(Integer[] array) {
        int tamanhoArray = array.length;
        int novoArray[] = new int[tamanhoArray];

        List<Integer> listOfArray = new ArrayList<>(Arrays.asList(array)); //Converte de array para list com cópia

        for(int i = 0 ; i < tamanhoArray ; i++){
            int indexMenor = buscarMenorIndex(array);
            novoArray[i] = array[indexMenor];
            listOfArray.remove(indexMenor);
            array = listOfArray.toArray(new Integer[0]); //Converte de list para array
        }

        return novoArray;
    }
    public static int buscarMenorIndex(Integer[] arrayNum) {
        int menor = arrayNum[0];
        int menor_indice = 0;

        for (int i = 1; i < arrayNum.length; i++) {
            if (arrayNum[i] < menor) {
                menor = arrayNum[i];
                menor_indice = i;
            }
        }

        return menor_indice;
    }


}
