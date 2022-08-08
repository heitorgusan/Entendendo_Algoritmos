package PesquisaBinaria_BinarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyBinarySearch {


    public static int PesquisaBinaria(List<Integer>listaNumeros, int numeroBuscado){
        int baixo = 0;
        int alto = listaNumeros.size()-1;

        while(baixo<=alto){
            int meio = (alto + baixo) / 2;
            int chute = listaNumeros.get(meio);

            if(chute == numeroBuscado) return meio; //Retorna a posição que está o número buscado.

            if(chute>numeroBuscado){
                //50     //20
                alto = meio-1;
            }else{
                //chute //numero buscado
                //20   //50
                baixo = meio +1;
            }

        }
        return -1;

    }
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>(List.of(10,9,8,3,4,5,6,0,1,2,34,56,78,999,9238,212,1212,34434,12901));
        Collections.sort(list);
        System.out.println("Acertei?: ->"+list.get(PesquisaBinaria(list,999)));
    }
}
