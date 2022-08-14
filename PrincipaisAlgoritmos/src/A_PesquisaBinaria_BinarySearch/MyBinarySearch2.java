package PesquisaBinaria_BinarySearch;

import java.util.List;

public class MyBinarySearch2 {
    public static void main(String[] args) {

    }
    public static int myBinary(List<Integer>list, int numBuscado){
        int baixo = 0;
        int alto = list.size()-1;

        while(baixo<=alto){
            int meio = (alto+baixo)/2;
            int chute =  list.get(meio);
            //10        //50
            if(chute == numBuscado){
                return meio;
            }
            else if(chute > numBuscado){
                alto = meio -1;

            }else{
                baixo = meio+1;
            }
        }


        return -1;
    }
}
