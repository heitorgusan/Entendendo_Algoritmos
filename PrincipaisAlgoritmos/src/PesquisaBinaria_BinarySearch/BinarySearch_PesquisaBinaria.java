package PesquisaBinaria_BinarySearch;

import java.util.List;
//Baixo, alto e meio é em relação a posição do array ou da lista
public class BinarySearch_PesquisaBinaria {

    public static int pesquisaBinaria(int[]arrayNumeros, int numero){
        int baixo = 0;
        int alto = arrayNumeros.length-1;

        while(baixo <= alto){
            int meio = (baixo+alto)/2;
            int chute = arrayNumeros[meio];//Numero de fato para comparar com o numero buscado

            if(chute == numero) return meio; //Retorna a posição do numero buscado
            if(chute>numero){
                alto = meio -1;
            }else{
                baixo = meio +1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] lista = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
        pesquisaBinaria(lista,1);
    }
}
