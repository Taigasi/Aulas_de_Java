import java.util.Scanner; // Classe de funções da biblioteca Java

public class QuartoExercicio {

    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in); // Classe para chamar a função scanner

        float peso;
        float altura;

        System.out.println("Informe seu peso:");
        peso = entrada.nextFloat();

        System.out.println("Informe sua altura:");
        altura = entrada.nextFloat();

        float imc = peso/ (altura*altura) ;

        System.out.println("Seu IMC é:" + imc);

        if (imc <= 18.5){
            System.out.println("Você está abaixo do peso ideial");
        } else if (imc >= 18.6 && imc >= 24.0) {
            System.out.println("Você está no peso ideial, parabéns!");
        }else if (imc >= 25 && imc >= 29.9){
            System.out.println("Levemente acima do peso");
        } else if (imc >= 30 && imc >=34.9) {
            System.out.println("Obesidade grau I");
        } else if (imc >= 35 && imc >= 39) {
            System.out.println("Obesidade grai II (severa)");
        }else if (imc >= 40){
            System.out.println("Obesidade III (mórbida)");
        }
//        float altura = 1.69f;
//        double peso = 51.2;
//
//        double imc = peso / (altura * altura);
//        System.out.println("Seu IMC é: "+ imc);
    }


}
