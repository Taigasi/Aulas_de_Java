import java.util.Scanner;

public class QuintoExercicio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       double nota01, nota02, nota03, nota04;

        System.out.println("Digite sua nota 01:");
        nota01 = scan.nextDouble();

        System.out.println("Digite sua nota 02:");
        nota02 = scan.nextDouble();

        System.out.println("Digite sua nota 03:");
        nota03 = scan.nextDouble();

        System.out.println("Digite sua nota 04:");
        nota04 = scan.nextDouble();

       double media = (nota01 + nota02+ nota03 + nota04) / 4;

       System.out.println("A média do aluno é: " + media);

      if (media >= 6){
          System.out.println("Você foi Aprovado");
      } else if(media >=5){
          System.out.println("Você está de recuperação!");
      }else {
          System.out.println("Reprovado");
      }
  }
}
