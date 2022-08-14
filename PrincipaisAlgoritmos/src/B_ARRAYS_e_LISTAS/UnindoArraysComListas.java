package B_ARRAYS_e_LISTAS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UnindoArraysComListas {
    //Palavras que começar com vogais


    public static void main(String[] args) {
        List[] arrayDeLista = new List[5];
        arrayDeLista[0] = new ArrayList<String>(List.of("Astolfo"));
        arrayDeLista[1] = new ArrayList<String>(List.of("Elaine"));
        arrayDeLista[2] = new ArrayList<String>(List.of("Ilaine"));
        arrayDeLista[3] = new ArrayList<String>(List.of("Olaine"));
        arrayDeLista[4] = new ArrayList<String>(List.of("Ulaine"));

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um nome que comece com uma vogal");
        String nome = sc.nextLine();
        Character firstLetter = nome.toLowerCase().charAt(0);
        switch (firstLetter) {
            case 'a':
                arrayDeLista[0].add(nome);
                break;
            case 'e':
                arrayDeLista[1].add(nome);
                break;
            case 'i':
                arrayDeLista[2].add(nome);
                break;
            case 'o':
                arrayDeLista[3].add(nome);
                break;
            case 'u':
                arrayDeLista[4].add(nome);
                break;
            default:
                System.out.println("Nome inválido");
        }

        System.out.println("Nomes com A: ");
        arrayDeLista[0].forEach(System.out::println);
        System.out.println("Nomes com E");
        arrayDeLista[1].forEach(System.out::println);
        System.out.println("Nomes com I");
        arrayDeLista[2].forEach(System.out::println);
        System.out.println("Nomes com O");
        arrayDeLista[3].forEach(System.out::println);
        System.out.println("Nomes com U");
        arrayDeLista[4].forEach(System.out::println);


    }
}
