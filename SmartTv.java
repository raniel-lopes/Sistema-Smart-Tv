package executavel;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 50;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarCanal() {
        if (ligada && canal < 100) {
            canal++;
            System.out.println("Canal aumentado para: " + canal);
        }
    }

    public void diminuirCanal() {
        if (ligada && canal > 1) {
            canal--;
            System.out.println("Canal diminuído para: " + canal);
        }
    }

    public void aumentarVolume() {
        if (ligada && volume < 100) {
            volume++;
            System.out.println("Volume aumentado para: " + volume);
        }
    }

    public void diminuirVolume() {
        if (ligada && volume > 0) {
            volume--;
            System.out.println("Volume diminuído para: " + volume);
        }
    }
}
