import java.util.Scanner;
import java.math.*;
public class Main {

    public static void main(String[] args) throws Exception {

            Scanner OP = new Scanner(System.in);//--Entrada de Dados

            // Declaração de variaveis.
            
            Double X1= OP.nextDouble();
            Double Y1 = OP.nextDouble();
            Double X2= OP.nextDouble();
            Double Y2 = OP.nextDouble();

            OP.close();

            // Atribuições dos resultados.

            Double Distancia = ((( (X1-X2) * (X1-X2)) + ((Y1-Y2) * (Y1-Y2) )));

            Double Final = Math.sqrt(Distancia);

            System.out.println(String.format("%.4f", Final));//--Saida de Dados
    }
}