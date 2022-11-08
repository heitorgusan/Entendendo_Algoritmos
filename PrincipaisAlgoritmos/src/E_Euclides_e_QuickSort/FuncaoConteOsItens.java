package E_Euclides_e_QuickSort;

import java.util.ArrayList;
import java.util.List;

public class FuncaoConteOsItens {

    public static void main(String[] args) {
        List<Integer> testList = new ArrayList<>(List.of(1, 2, 3, 4, 10, 20, 21, 22, 23, 49,-1));

        System.out.println(contarItens2(testList,2));
        System.out.println(contarItens(testList));
    }

    public static <T> int contarItens(List<T> list) {
        int contador = 0;
        if (list.isEmpty()) return contador;
        list.remove(0);
        contador++;
        return contador + contarItens(list);
    }

    public static <T> int contarItens2(List<T> list, int i) {
        int contador = 0;

        if (i == list.size()) return contador;
        contador++;
        i++;
        return contador + contarItens2(list, i);

    }

}
