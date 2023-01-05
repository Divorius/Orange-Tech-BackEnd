public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("A tv ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " +smartTv.canal);
        System.out.println("Volume Atual: " +smartTv.volume);

        smartTv.ligar ();
        System.out.println("Novo status: A tv ligada?" + smartTv.ligada);
    }
}
