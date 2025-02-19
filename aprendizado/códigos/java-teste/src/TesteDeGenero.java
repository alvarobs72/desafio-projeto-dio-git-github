public class TesteDeGenero {

public static void main (String [] args) {
   // Altere somente o valor da variável "sexo" para testar o código
    char genero = 'M';

    if (genero == 'M') {
        System.out.println(genero + " " +"Masculino");
    } if (genero == 'F') {
        System.out.println(genero + " " +"Feminino");
    } if (genero != 'M' & genero != 'F') {
        System.out.println(genero + " " + "Sexo inválido");
    }

}

}
