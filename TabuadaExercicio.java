import java.util.*;

public class TabuadaExercicio {
    public static void main(String[] args) {

        int tabuada =0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a tabuada desejada: ");
        tabuada = entrada.nextInt();

        for(int n=0; n<=10; n++){
            System.out.println(tabuada + "x" + n + " = " + (n*tabuada));
        }
    }
}
