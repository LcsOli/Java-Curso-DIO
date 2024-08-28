public class SmartTV {
    boolean ligada = true;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentaVolume() {
        volume++;
        System.out.println(volume);
    }

    public void abaixarVolume() {
        volume--;
        System.out.println(volume);
    }

    public void proximoCanal() {
        canal++;
    }

    public void anteriorCanal() {
        canal--;
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }
}
