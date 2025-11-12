import java.util.*;

public class Exemplo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pares = 0;
        int impares = 0;
        int i = 1;

        while (i <= 10){
            System.out.println("Digite o " + i + "número");
            int numero = sc.nextInt();

            if (numero % 2 == 0){
                pares ++;
            }else{
                impares++;
            }
            i++;
        }
    }
}
