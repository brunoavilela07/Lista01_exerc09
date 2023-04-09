import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Declaração de variáveis + entrada de dados
        Scanner teclado = new Scanner(System.in);
        double temp1;
        System.out.println("Quanto é a temperatura em graus Fahrenheit hoje? ");
        temp1 = teclado.nextDouble();
        teclado.close();
        double temp2;
        // Transformando em Celsius
        temp2 = 5 * ((temp1 - 32) / 9);
        // Resultado
        System.out.println("Sendo assim, a temperatura em graus Celsius é de: " + temp2 + "ºC");
    }
}
