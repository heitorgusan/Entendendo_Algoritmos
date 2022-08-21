package D_RECURSAO;

public class A_ContagemRegressiva2 {

    public static void main(String[] args) {
        contagemRegressiva(10);
    }
    public static void contagemRegressiva(int n){
        System.out.println(n);

        //if(n<=1)return; //SEM ISSO STACKOVERFLOW

        contagemRegressiva(n-1);

    }
}
