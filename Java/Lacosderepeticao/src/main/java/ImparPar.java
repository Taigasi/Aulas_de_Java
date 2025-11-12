import java.util.*;

public class ImparPar {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int i;
        System.out.println("Informe um número");
        i = entrada.nextInt();

        if (i % 2 ==0 ){
            System.out.println("Seu número é par");
        }else{
            System.out.println("Seu número é impar");
        }
    }
}
