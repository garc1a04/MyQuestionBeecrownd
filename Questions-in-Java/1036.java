import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);//--Entrada de Dados

        // Variaveis

        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();

        // Resolução :)

        if (A == 0){
            System.out.println("Impossivel calcular");

        }
        else if( (Math.pow(B,2))-(4*(A)*(C)) < 0 ) {

            System.out.println("Impossivel calcular");

        }

        else{

            double Delta = ((Math.pow(B,2)-(4*(A)*(C))));

            double Raiz1 = ((((-B+(Math.sqrt(Delta)))/(2*A)))) ;

            double Raiz2 = ((((-B-(Math.sqrt(Delta)))/(2*A))));
            
            //Saida de Dados
            System.out.println("R1 = " + String.format("%.5f",Raiz1));
            System.out.println("R2 = " + String.format("%.5f",Raiz2));

        }
    }
 
}