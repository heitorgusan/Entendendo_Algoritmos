package D_RECURSAO;

public class TesteCallStack_PilhaChamada {
    public static void main(String[] args) {
        saudar("Chocolate");

        System.out.println("Teste Main, últim tarefas");
    }

    public static void saudar(String nome) {
        System.out.println("Hello " + nome);
        howAreYou(nome);
        byebye(nome);
    }

    public static void howAreYou(String nome) {
        System.out.println("How are you? " + nome);
    }

    public static void byebye(String nome) {
        System.out.println("Bye Bye "+nome);
    }


}
