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
        public void definirCanal(int novoCanal) {
        canal = novoCanal;
    }
        public void definirVolume(int novoVolume) {
        volume = novoVolume;
    }
        public void status() {
        System.out.println("Televisão ligada? " + ligada);
        System.out.println("Volume: " + volume);
        System.out.println("Canal: " + canal);
        System.out.println("Canal Antecessor: " + canalAntecessor);
        System.out.println("Canal Sucessor: " + canalSucessor);
    }
}
