package PesquisaBinaria_BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class MyBinarySearch4 {

    private static List<Integer> nInteiros = new ArrayList<>(List.of(13, 0, 9, 28, 3, 4, 5, 6, 7, 8, 10, 233, 244, 256, 654, 32));

    public static void main(String[] args) {
        System.out.println("Tamanho do Array: "+nInteiros.size());
        System.out.println(pesquisaBinaria(nInteiros, 654));
    }

    //Retorna a posição que o número buscado está na lista.
    public static int pesquisaBinaria(List<Integer> listaNum, int numeroBuscado) {
        listaNum.sort(null);
        System.out.println(listaNum);
        int alto = listaNum.size() - 1;
        int baixo = 0;

        while (baixo <= alto) {
            int meio = (alto + baixo) / 2;
            int chute = listaNum.get(meio);
            if (chute == numeroBuscado) return meio;
            if (chute > numeroBuscado) {
                alto = meio - 1;
            } else {
                baixo = meio + 1;
            }
        }
        return -1;
    }
}