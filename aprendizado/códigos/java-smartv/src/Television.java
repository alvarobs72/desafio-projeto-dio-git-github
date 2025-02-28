public class Television {
    boolean ligada = false;
    int volume = 15;
    int canal = 0;
    int canalAntecessor = canal - 1;
    int canalSucessor = canal + 1;

        public void ligar() {
        ligada = true;
    }
        public void desligar() {
        ligada = false;
    }
        public void aumentarVolume() {
        volume++;
    }
        public void diminuirVolume() {
        volume--;
    }
        public void aumentarCanal() {
        canal++;
    }
        public void diminuirCanal() {
        canal--;
    }
        public void trocarCanal(int novoCanal) {
        canal = novoCanal;
    }
}
