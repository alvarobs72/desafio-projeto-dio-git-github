import java.util.Scanner;

public class Usuario {
    public static void main (String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Television tv = new Television();
        tv.ligar();
        while (tv.getLigado()== true) {
            System.out.println("1 - Aumentar volume");
            System.out.println("2 - Diminuir volume");
            System.out.println("3 - Aumentar canal");
            System.out.println("4 - Diminuir canal");
            System.out.println("5 - Definir canal");
            System.out.println("6 - Definir volume");
            System.out.println("7 - Abrir aplicativo");
            System.out.println("8 - Fechar aplicativo");
            System.out.println("9 - Status");
            System.out.println("0 - Desligar");
            System.out.println("Digite a opção desejada: ");
            int opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    tv.aumentarVolume();
                    tv.status();
                    break;
                case 2:
                    tv.diminuirVolume();
                    tv.status();
                    break;
                case 3:
                    tv.aumentarCanal();
                    tv.status();
                    break;
                case 4:
                    tv.diminuirCanal();
                    tv.status();
                    break;
                case 5:
                    tv.definirCanal();
                    tv.status();
                    break;
                case 6:
                    tv.definirVolume();
                    tv.status();
                    break;
                case 7:
                    tv.abrirAplicativo();
                    tv.status();
                    break;
                case 8:
                    tv.fecharAplicativo();
                    break;
                case 9:
                    tv.status();;
                    break;
                case 0:
                    tv.desligar();
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }
            
        }
}
}