import java.io.IOException;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) throws Exception {

            Scanner input = new Scanner(System.in);//--Entrada de Dados

            // Variaveis
            
            int Codigo = input.nextInt();
            int Quantidade = input.nextInt();

            // Problema

            if ( Codigo == 1){
                Double Valor = 4.00*(double)Quantidade;
                System.out.println("Total: R$ "+ String.format("%.2f", Valor));
            }

            else if ( Codigo == 2){
                Double Valor = 4.50*(double)Quantidade;
                System.out.println("Total: R$ "+ String.format("%.2f", Valor));
            }

            else if ( Codigo == 3){
                Double Valor = 5.00*(double)Quantidade;
                System.out.println("Total: R$ "+ String.format("%.2f", Valor));
            }

            else if ( Codigo == 4){
                Double Valor = 2.00*(double)Quantidade;
                System.out.println("Total: R$ "+ String.format("%.2f", Valor));
            }

            else if ( Codigo == 5){
                Double Valor = 1.50*(double)Quantidade;
                System.out.println("Total: R$ "+ String.format("%.2f", Valor));
            }
    }
}