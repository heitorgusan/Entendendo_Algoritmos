package PesquisaBinaria_BinarySearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Produto implements Comparable<Produto> {
    private String name;
    private double price;

    public Produto(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Produto o) {
        return this.name.compareTo(o.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(name, produto.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
public class MyBinarySearch3 {
    private static List<Produto>list = new ArrayList<>(List.of(
            new Produto("Spray Rexonna", 5),
            new Produto("Perfume", 50),
            new Produto("Astolfinho", 7),
            new Produto("VR Samsung", 300),
            new Produto("FusioPower", 2),
            new Produto("Zebrinha XL", 7)
    ));
    public static void main(String[] args) {
        list.sort(null);
        System.out.println(list);
        System.out.println(PesquisaBinaria(list,new Produto("Perfume",50)));

    }

    public static <T extends Comparable<T>> int PesquisaBinaria(List<T> list, T objetoBuscado) {
        int alto = list.size() - 1;
        int baixo = 0;

        while (baixo <= alto) {
            int meio = (alto + baixo) / 2;
            T chute = list.get(meio);

            if(chute.compareTo(objetoBuscado)==0) {
                return meio;
                //50   10
            }else if(chute.compareTo(objetoBuscado)>0){
                alto = meio-1;
            }else{
                //10   50
                baixo = meio +1;
            }
        }


        return -1;
    }
}
