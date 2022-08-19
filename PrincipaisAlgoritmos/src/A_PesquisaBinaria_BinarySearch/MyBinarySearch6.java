package A_PesquisaBinaria_BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class MyBinarySearch6 {

    public static void main(String[] args) {
        List<Integer>listNumbers = new ArrayList<>(List.of(
                50,-100,32,1,2,3,4,5,67,8,9,0,-1,-3,-7,-99
        ));
        //System.out.println(indexMenor(listNumbers));
        System.out.println(binarySearchPosicaoObj(listNumbers,67));

    }
    public static <T extends Comparable<T>> int binarySearchPosicaoObj(List<T> lista,T objetoDesejado) {
        int baixo = 0;
        lista = ordenarPorSelecao(lista);

        int alto = lista.size() - 1;

        while(baixo <= alto){
            int meio = (alto + baixo) / 2;
            T chute = lista.get(meio);

            if(chute.compareTo(objetoDesejado)==0)return meio;

            if(chute.compareTo(objetoDesejado) > 0){
                alto = meio - 1;
            }else{
                baixo = meio + 1;
            }
        }
        return -1;
    }

    public static <T extends Comparable<T>> List<T> ordenarPorSelecao(List<T>listaDesordenada){
        List<T>listaOrdenada = new ArrayList<>();
        int tamanhoLista = listaDesordenada.size();
        for(int i = 0 ; i < tamanhoLista ; i++){
            int menor = indexMenor(listaDesordenada);
            listaOrdenada.add(listaDesordenada.get(menor));
            listaDesordenada.remove(menor);
        }
        return listaOrdenada;
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