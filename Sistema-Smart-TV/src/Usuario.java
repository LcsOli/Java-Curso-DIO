public class Usuario {

    public static void main(String[] args) throws Exception {

        SmartTV smartTV = new SmartTV();

        smartTV.abaixarVolume();
        smartTV.abaixarVolume();
        smartTV.aumentaVolume();

        System.out.println("TV ligada: " + smartTV.ligada);
        System.out.println("Canal: " + smartTV.canal);
        System.out.println("Volume: " + smartTV.volume);
        smartTV.mudarCanal(13);
        System.out.println("Canal: " +smartTV.canal);
    }
}
