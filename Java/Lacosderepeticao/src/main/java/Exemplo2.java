import java.util.*;
public class Exemplo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pares = 0; // Contador de numeros pares
        int impares = 0; // Contador de numeros impares

        // Laço for para ler 10 números;
        for (int i = 1; i <= 10; i++){
            System.out.println("Digite o " + i + "numero");
            int numero = sc.nextInt();

            // Verifica se o número é par ou impar
            if (numero % 2 == 0){
                pares++;
            } else {
                impares++;
            }
        }
        // Exiba o resultado final
        System.out.println("Quantidade de números pares" + pares);
        System.out.println("Quantidade de números impares " + impares);
    }
}
