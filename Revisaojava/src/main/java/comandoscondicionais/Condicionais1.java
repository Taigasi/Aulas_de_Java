package comandoscondicionais;

import java.util.Scanner;

public class Condicionais1 {
    public static void main(String[] args) {

        int numero01 = 35;
        int numero02 = 30;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha o primeiro número");
        numero01 = entrada.nextInt();

        System.out.println("Escolha o segundo número");
        numero02 = entrada.nextInt();

        System.out.println("Hello Word, 1, 2, 3");

        if(numero01 > numero02){
            System.out.println("O número maior é " + numero01);
        }else if(numero02 > numero01){
            System.out.println("O número maior é " + numero02);
        }else{
            System.out.println("Os números são iguais");

        }

    }
}
