import java.util.Scanner;

public class Television {
boolean ligada = false;
int volume = 15;
int canal = 0;
final String marca = "Samsung";
String aplicativo = "N/A";
        
        public void ligar() {
        ligada = true;
    }
        public void desligar() {
        ligada = false;
    }
        public void aumentarVolume() {
        if (ligada == true) {
        volume++  ;
        }else {
        System.out.println("");
        }
    }
        public void diminuirVolume() {
        if (ligada == true) {
            volume--;
    }else {
            System.out.println("");
        }
    }
        public void aumentarCanal() {
        if (ligada == true) {
            canal++;
    }else {
            System.out.println("");
        }
    }
        public void diminuirCanal() {
        if (ligada == true) {
            canal--;
        }else {
        System.out.println("");
        }
    }
        public void definirCanal(int novoCanal) {
        if (ligada == true) {
            canal = novoCanal;
    }else {
            System.out.println("");
        }
    }
        public void definirVolume(int novoVolume) {
        if (ligada == true) {
            volume = novoVolume;
    }else {
            System.out.println("");
        }
    }
        public void abrirAplicativo(String novoAplicativo) {
        if (ligada == true) {
            aplicativo = novoAplicativo;
            
        }else {
            System.out.println("");
        }
    }
        public void fecharAplicativo() {
        aplicativo = "N/A";
        }
        public void status() {
        if (ligada == true) {
            System.out.println("Status: " + ligada);
            System.out.println("Marca: " + marca);
            System.out.println("Aplicativo aberto: " + aplicativo);
            System.out.println("Volume: " + volume);
        } if (aplicativo != "N/A") {
            System.out.println("canal: " + canal);

        } if (ligada == false) {
            System.out.println("A tv está desligada.");
            System.out.println("Marca: " + marca);
        }
    }
}