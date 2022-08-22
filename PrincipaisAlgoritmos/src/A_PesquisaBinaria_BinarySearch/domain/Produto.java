package A_PesquisaBinaria_BinarySearch.domain;

public class Produto implements Comparable<Produto> {
    public String name;

    public Produto(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Produto o) {
        return this.name.compareToIgnoreCase(o.name);
    }


}
