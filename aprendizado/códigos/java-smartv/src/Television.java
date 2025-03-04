import java.util.Scanner;

public class Television {
        Scanner sc = new Scanner(System.in);
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
        public void definirCanal() {
        if (ligada == true) {
            System.out.println("Digite o canal desejado: ");
            canal = sc.nextInt();
    }else {
            System.out.println("");
        }
    }
        public void definirVolume() {
        if (ligada == true) {
            System.out.println("Digite o volume desejado: ");
            volume = sc.nextInt();
    }else {
            System.out.println("");
        }
    }
        public void abrirAplicativo() {
        if (ligada == true) {
            System.out.println("Digite o aplicativo desejado: ");
            aplicativo = sc.next();
            
        }else {
            System.out.println("");
        }
    }
        public void fecharAplicativo() {
        aplicativo = "N/A";
        }
        public void status() {
        if (ligada == true) {
            
            System.out.println("--------------\n\nStatus: " + ligada);
            System.out.println("Marca: " + marca);
            System.out.println("Aplicativo aberto: " + aplicativo);
            System.out.println("Volume: " + volume);
            System.out.println("Canal: " + canal + "\n\n" + "--------------");
        } 

         if (ligada == false) {
            System.out.println("A tv está desligada.");
            System.out.println("Marca: " + marca);
        }
    }
}
