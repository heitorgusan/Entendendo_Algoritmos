package C_ORDENACAO_POR_SELECAO_SELECTIONSORT;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoSelecao_SelectionSort2 {

    public static void main(String[] args) {
        List<Integer>listNumbers = new ArrayList<>(List.of(
                50,-100,32,1,2,3,4,5,67,8,9,0,-1,-3,-7,-99
        ));
        ordenarPorSelecao(listNumbers);
    }

    public static <T extends Comparable<T>> List<T> ordenarPorSelecao(List<T>listaDesordenada){
        List<T>listaOrdenada = new ArrayList<>();
        int tamanhoLista = listaDesordenada.size();
        for(int i = 0 ; i < tamanhoLista ; i++){
            int menor = indexMenor(listaDesordenada);
            listaOrdenada.add(listaDesordenada.get(menor));
            listaDesordenada.remove(menor);
        }
        for (T t : listaOrdenada) {
            System.out.println(t);
        }
        return listaDesordenada;
    }

    public static <T extends Comparable<T>> int indexMenor(List<T>lista){

        T menor = lista.get(0);
        int indexMenor = 0;

        for(int i = 1 ; i < lista.size() ; i++){
            if(menor.compareTo(lista.get(i))>0){
                menor = lista.get(i);
                indexMenor = i;
            }
        }

        return indexMenor;
    }
}