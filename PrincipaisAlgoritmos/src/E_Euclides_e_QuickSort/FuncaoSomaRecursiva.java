package E_Euclides_e_QuickSort;

import java.util.Arrays;

public class FuncaoSomaRecursiva {

    public static int arrayNum[] = {1, 2, 3, 4, 5};

    public static void main(String[] args) {
        System.out.println(somaLoop(arrayNum));
        System.out.println(somaRecursiva(arrayNum));
        System.out.println(multiplicacaoRecursiva(new int []{2,3,4}));
    }
    public static int somaLoop(int arrayNum[]) {
        int somaTotal = 0;
        for (int i : arrayNum) {
            somaTotal += i;
        }
        return somaTotal;
    }
    public static int somaRecursiva(int arrayNum[]) {
        if (arrayNum.length == 0) return 0;
        return arrayNum[0] + somaRecursiva(Arrays.copyOfRange(arrayNum, 1, arrayNum.length));
    }
    public static int multiplicacaoRecursiva(int arrayNum[]) {
        if (arrayNum.length == 0) return 1;
        return arrayNum[0] * multiplicacaoRecursiva(Arrays.copyOfRange(arrayNum, 1 , arrayNum.length));
    }
}
