
import java.util.*;

public class NonoExercicio {
    public static void main(String[] args) {

        int numero_dia;
        String NomeDia;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número 1-7");
        numero_dia = entrada.nextInt();

        switch (numero_dia){
            case 1: NomeDia="Domingo"; break;
            case 2: NomeDia="Segunda"; break;
            case 3: NomeDia="Terça"; break;
            case 4: NomeDia="Quarta"; break;
            case 5: NomeDia="Quinta"; break;
            case 6: NomeDia="Sexta"; break;
            case 7: NomeDia="Sabádo"; break;
            default:NomeDia="Dia Inválido";
        }
        System.out.println("O dia da semana é: " + NomeDia);
    }
}
