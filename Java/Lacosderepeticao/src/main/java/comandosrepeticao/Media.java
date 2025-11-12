package comandosrepeticao;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {

        float numero;
        float soma = 0;

        Scanner entrada = new Scanner(System.in);

        for(int i=1; i <= 5; i++){
            System.out.println("Digite o número: ");
            numero = entrada.nextInt();
            soma += numero;
        }
        System.out.println("A soma dos 5 números é:" + soma);
        System.out.println("A média dos 5 números é " +(soma/5));
    }
}
