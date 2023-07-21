import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);//--Entrada de Dados

        // Variaveis 

        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int D = input.nextInt();

        // problema :)

        if(((B > C) && (D>A)) && ((C+D)>(A+B)) && ((C > 0) && (D > 0)) && (A%2 == 0)) {
            
            System.out.println("Valores aceitos");
        }
        else {
            System.out.println("Valores nao aceitos");
        }
    }
}