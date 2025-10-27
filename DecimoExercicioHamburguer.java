import java.util.*;

public class DecimoExercicioHamburguer {
    public static void main(String[] args) {

        int lanches;
        String EscolhaLanche;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha seu lanche de 1-5");
        lanches = entrada.nextInt();

        switch (lanches){
            case 1: EscolhaLanche="Combo Whopper"; break;
            case 2: EscolhaLanche="Combo Veg Burguer"; break;
            case 3: EscolhaLanche="Combo Bacon King"; break;
            case 4: EscolhaLanche="Combo Chicken Fries"; break;
            case 5: EscolhaLanche="Combo Big Fish"; break;
            default:EscolhaLanche="Número de Lanche inválido, favor selecionar um número de 1-5";}
        System.out.println("O seu lanche é: " + EscolhaLanche);
    }
}
