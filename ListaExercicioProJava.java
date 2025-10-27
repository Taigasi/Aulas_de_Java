import java.util.*;

public class ListaExercicioProJava {
    public static void main(String[] args) {

        int prato;
        int sobremesa;
        int bebida;
        String Refeicao;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha um prato de 1-4");
        prato = entrada.nextInt();

        switch (prato) {
            case 1:
                Refeicao = "Vegetariano 180 cal";
                break;
            case 2:
                Refeicao = "Peixe 230 cal";
                break;
            case 3:
                Refeicao = "Frango 250 cal";
                break;
            case 4:
                Refeicao = "Carne 350 cal";
                break;
            default:
                Refeicao = "Opção inválida, escolha um prato de 1 - 4";
        }

        System.out.println("Escolha uma sobremesa de 1-4");
        sobremesa = entrada.nextInt();

        switch (sobremesa) {
            case 1:
                Refeicao = "Abacaxi 75 cal";
                break;
            case 2:
                Refeicao = "Sorverte diet 110 cal";
                break;
            case 3:
                Refeicao = "Muse diet 170 cal";
                break;
            case 4:
                Refeicao = "Muse chocolate 200cal";
                break;
            default:
                Refeicao = "Opção inválida, escolha uma sobremesa de 1 - 4";
        }

        System.out.println("Escolha uma bedida de 1-4");
        bebida = entrada.nextInt();

        switch (bebida) {
            case 1:
                Refeicao = "Chá 20 cal";
                break;
            case 2:
                Refeicao = "Suco de laranja 70 cal";
                break;
            case 3:
                Refeicao = "Suco de melão 100 cal";
                break;
            case 4:
                Refeicao = "Refrigerante diet 65 cal";
                break;
            default:
                Refeicao = "Opção inválida, escolha uma bebida de 1 - 4";
        }
        System.out.println("Sua refeição é: " + Refeicao);
    }
}



