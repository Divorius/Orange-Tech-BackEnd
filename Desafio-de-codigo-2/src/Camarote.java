import java.util.Scanner;

public class Camarote {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int tamanhoDaFila = scan.nextInt();
        int pNoCamarote = 0;
        double divisao = (double)tamanhoDaFila / 2;
        double arredonda = Math.ceil(divisao);
        int result = (int) arredonda;
        System.out.printf( result+" pessoas no camarote");
    }
}