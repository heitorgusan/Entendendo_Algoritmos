package A_PesquisaBinaria_BinarySearch;

import java.util.List;

public class MyBinarySearch7 {

    public static void main(String[] args) {

    }

    public static<T extends Comparable<T>> int buscaBinaria(List<T> lista, T objetoPesquisado){
        int alto = lista.size()-1;
        int baixo = 0;

        while(baixo <= alto){
            int meio = alto + baixo / 2;
            T chute = lista.get(meio);
            if(chute.compareTo(objetoPesquisado)==0){
                return meio;
            }else if(chute.compareTo(objetoPesquisado)>1){
                alto = meio - 1;
            }else{
                baixo = meio + 1;
            }
        }
        return -1;
    }

}
