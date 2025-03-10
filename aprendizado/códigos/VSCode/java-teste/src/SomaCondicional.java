public class SomaCondicional {
    public static void main(String[] args) {
     // Altere somente os valores inteiros "valor1" e "valor2" para testar o código 
     // PS: o valor deve ser igual a 28.
        int valor1 = 0;
        int valor2 = 0;
        double valorFinal = resultado (valor1, valor2);
        
    if (valorFinal > 28) {
        System.out.println("seu valor é: " + valorFinal + " o valor é maior que 28. ERRADO.");
    }if (valorFinal < 28) {
        System.out.println("seu valor é: " + valorFinal + " o valor é menor que 28. ERRADO.");
    }if (valorFinal == 28) {
        System.out.println("seu valor é: " + valorFinal + " o valor é igual a 28. parabéns.");
    }
    }
    public static double resultado(int valor1, int valor2) {
        int resultado = valor1 + valor2;
        return resultado;
    }
}
