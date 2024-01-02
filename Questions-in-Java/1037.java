import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in); //-- Entrada de Dados

        // variaveis :)

        Double Numero = input.nextDouble();
        input.close();

        // Resultado :)

        if(Numero <= 25 && Numero >= 0){
            System.out.println("Intervalo [0,25]");
        }

        else if(Numero > 25 && Numero <=50){
            System.out.println("Intervalo (25,50]");
        }

        else if(Numero > 50 && Numero <=75 ){
            System.out.println("Intervalo (50,75]");
        }

        else if(Numero > 75 && Numero <=100){
            System.out.println("Intervalo (75,100]");
        }

        else{
            System.out.println("Fora de intervalo");
        }
    }
}
