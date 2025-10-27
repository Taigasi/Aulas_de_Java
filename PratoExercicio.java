import java.util.*;

public class PratoExercicio {

    public static void main(String[] args) {

        int numero_prato;
        String prato;
        int calorias_prato;

        int numero_sobremesa;
        String sobremesa;
        int calorias_sobremesa;

        int numero_bebida;
        String bebida;
        int calorias_bebida;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha um prato: ");
        numero_prato = entrada.nextInt();

        switch (numero_prato) {
            case 1:
                prato = "Prato Vegeratiano";
                calorias_prato = 180;
                break;
            case 2:
                prato = "Prato Frutos do Mar";
                calorias_prato = 230;
                break;
            case 3:
                prato = "Prato de Frango";
                calorias_prato = 250;
                break;
            case 4:
                prato = "Prato de Carne";
                calorias_prato = 350;
                break;
            default:
                prato = "Opção inválida";
                calorias_prato = 0;
                break;
        }
        System.out.println("Escolha uma sobremesa: ");
        numero_sobremesa = entrada.nextInt();

        switch (numero_sobremesa) {
            case 1:
                sobremesa = "Abacaxi";
                calorias_sobremesa = 75;
                break;
            case 2:
                sobremesa = "Sorvete Diet";
                calorias_sobremesa = 110;
                break;
            case 3:
                sobremesa = "Muse Diet";
                calorias_sobremesa = 170;
                break;
            case 4:
                sobremesa = "Muse de chocolate";
                calorias_sobremesa = 200;
                break;
            default:
                sobremesa = "Opção inválida";
                calorias_sobremesa = 0;
                break;
        }
        System.out.println("Escolha uma sobremesa: ");
        numero_bebida = entrada.nextInt();

        switch (numero_bebida) {
            case 1:
                bebida = "Chá";
                calorias_bebida = 20;
                break;
            case 2:
                bebida = "Suco de Laranja";
                calorias_bebida = 70;
                break;
            case 3:
                bebida = "Suco de Melão";
                calorias_bebida = 100;
                break;
            case 4:
                bebida = "Refrigerante diet";
                calorias_bebida = 65;
                break;
            default:
                bebida = "Opção inválida";
                calorias_bebida = 0;
                break;
        }

        int soma_calorias = calorias_prato + calorias_sobremesa + calorias_bebida;

        System.out.println("O prato escolhido foi: " + prato + " A sobremesa escolhida foi: " + sobremesa + " Sua bebia é: "+ bebida);
        System.out.println("O total de calorias do prato é: " + soma_calorias);
    }
}
