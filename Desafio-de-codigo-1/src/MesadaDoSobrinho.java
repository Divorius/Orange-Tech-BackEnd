import java.util.Scanner; 
    
public class MesadaDoSobrinho {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int entrada = leitor.nextInt();
        int mesada = 50;
        int valorFinal = (mesada*entrada);
        
        System.out.println (valorFinal);

    }
}