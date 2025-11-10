package comandoscondicionais;

import java.util.*;

public class Condicionais4 {
    public static void main(String[] args) {

        int nota;
        String suaNota;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Avalie o filme de 1 a 5 estrelas");
        nota = entrada.nextInt();

        switch (nota) {
            case 5:
                suaNota = "Excelente! Recomendo! ⭐⭐⭐⭐⭐";
                break;
            case 4:
                suaNota = "Muito bom! Assitira de novo!⭐⭐⭐⭐";
                break;
            case 3:
                suaNota = "Legalzinho ⭐⭐⭐";
                break;
            case 2:
                suaNota = "Ruim! Não recomendo ⭐⭐";
                break;
            case 1:
                suaNota = "Péssimo ⭐";
                break;
            default: suaNota = "Nota inválida❌";
        }
        System.out.println("A sua nota foi" + suaNota);
    }
}
