public class ControleDeFluxo {

    public static void main(String[] args) {
        ControleDeFluxo CF = new ControleDeFluxo();
        CF.ifFerias();
        CF.switchSemana("quarta");
        CF.switchNumero(5);
    }
    public void ifFerias() {
        String janeiro = "1";
        String fevereiro = "2";
        String março = "3";
        String abril = "4";
        String maio = "5";
        String junho = "6";
        String julho = "7";
        String agosto = "8";
        String setembro = "9";
        String outubro = "10";
        String novembro = "11";
        String dezembro = "12";
        String mes = "n/a";

        System.out.println("primeira tentativa:");
            mes = janeiro;
        if (mes.equals(janeiro) || mes.equals(fevereiro)) {
            System.out.println("Férias de verão");
        } else if (mes.equals(julho)) {
            System.out.println("Férias de inverno");
        } else {
            System.out.println("Não é férias");
        }
        System.out.println("\nsegunda tentativa:");
            mes = julho;

        if (mes.equals(janeiro) || mes.equals(fevereiro)) {
            System.out.println("Férias de verão");
        } else if (mes.equals(julho)) {
            System.out.println("Férias de inverno");
        } else {
            System.out.println("Não é férias");
        }
        System.out.println("\nterceira tentativa:");
            mes = outubro;

        if (mes.equals(janeiro) || mes.equals(fevereiro)) {
            System.out.println("Férias de verão");
        } else if (mes.equals(julho)) {
            System.out.println("Férias de inverno");
        } else {
            System.out.println("Não é férias");
        }
        System.out.println("---------------------------------------------");


    }

    public void switchSemana(String diaSemana) {
        switch (diaSemana) {
            case "domingo":
                System.out.println("1º");
                break;
            case "segunda":
                System.out.println("2º");
                break;
            case "terça":
                System.out.println("3º");
                break;
            case "quarta":
                System.out.println("4º");
                break;
            case "quinta":
                System.out.println("5º");
                break;
            case "sexta":
                System.out.println("6º");
                break;
            case "sábado":
                System.out.println("7º");
                break;
            default:
                System.out.println("Dia inválido");
    }
    System.out.println("---------------------------------------------");
  }
    public void switchNumero(int numero){
        switch (numero){
            case 1:
                System.out.println("correto");
                break;
            case 2:
                System.out.println("correto");
                break;
            case 3:
                System.out.println("correto");
                break;
            case 4:
                System.out.println("errado");
                break;
            case 5:
                System.out.println("talvez");
                break;
            default:
                System.out.println("não definido");
        }
        System.out.println("---------------------------------------------\nFIM.");
    }
        
}