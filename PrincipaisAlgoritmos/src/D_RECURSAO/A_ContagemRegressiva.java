package D_RECURSAO;

public class A_ContagemRegressiva {
    public static void main(String[] args) {
        contagemRegressiva(3);
    }

    public static void contagemRegressiva(int i) {
        System.out.println(i);
        if(i <= 1){//Caso base
            return; //Caso base
        }else{
            contagemRegressiva(i-1);//Caso Recursivo
        }
    }
}
