import java.util.Scanner;

public class ImoveisDisponiveis {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String frase = leitor.next();
        String array[] = new String[3];
        array = frase.split("/");
        System.out.printf("Imovel: %s R$%s %s", array[0], array[1], array[2]);
    }
}