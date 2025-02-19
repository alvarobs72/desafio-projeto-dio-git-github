public class TesteDeGenero {

public static void main (String [] args) {
   // Altere somente o valor da variável "sexo" para testar o código
    char genero = ' ';

    if (genero == 'M') {
        System.out.println(genero + " " +"Masculino");
    } if (genero == 'F') {
        System.out.println(genero + " " +"Feminino");
    } if (genero == ' ') {
        System.out.println("Nenhum genero foi informado");
    }else if (genero != 'M' & genero != 'F') {
        System.out.println(genero + " " +"Outros");
    }

}

}
