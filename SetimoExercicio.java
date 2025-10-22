import java.util.Scanner;

public class SetimoExercicio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Favor, inserir o valor do raio:");
        double raio = scan.nextDouble();

        double area = Math.PI * (raio*raio);

        double perimetro = 2 * Math.PI * raio;

        System.out.println("O valor da " + area);
        System.out.println("O valor do perimetro é: " + perimetro);
    }
}
