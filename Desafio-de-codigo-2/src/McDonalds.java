import java.util.Scanner;
public class McDonalds {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String ingredientes = leitor.next();
        String listaIngredientes[] = new String[3];
        listaIngredientes = ingredientes.split(";");
        for(int i = 0; i < listaIngredientes.length; i++){
            System.out.println(listaIngredientes[i]);
        }
    }
}