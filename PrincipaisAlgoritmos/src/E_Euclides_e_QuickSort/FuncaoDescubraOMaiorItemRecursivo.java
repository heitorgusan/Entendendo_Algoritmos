package E_Euclides_e_QuickSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FuncaoDescubraOMaiorItemRecursivo {


    public static void main(String[] args) {

        int[] listInteger = new int []{1, 10, 300, 2000, 7000, 5};
        System.out.println(max(listInteger));
    }


    //Solucao do book

    private static int max(int[] list) {
        if (list.length == 2) {
            return list[0] > list[1] ? list[0] : list[1];
        }

        int subMax = max(Arrays.copyOfRange(list,1,list.length));
        return list[0] > subMax ? list[0]:subMax;
    }

    //Minha solucao
    public static <T extends Comparable<T>> T maiorItem(List<T> list) {
        if (list.size() == 1) return list.get(0);

        if (list.get(0).compareTo(list.get(1)) < 0) {
            list.remove(list.get(0));

        } else {
            list.remove(list.get(1));
        }

        return maiorItem(list);
    }
}