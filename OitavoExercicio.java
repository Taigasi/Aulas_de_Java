import java.util.Scanner;

public class OitavoExercicio {

    public static void main(String[] args) {


        double base;
        double altura;

        System.out.println("Digite o valor da base");
        Scanner entrada = new Scanner(System.in);
        base = entrada.nextDouble();

        System.out.println("Digite o valor da altura");
        Scanner entrada2 = new Scanner(System.in);
        altura = entrada2.nextDouble();

        double area = base * altura /2;

        System.out.println("O seu valor de área é: " + area);
    }

}
