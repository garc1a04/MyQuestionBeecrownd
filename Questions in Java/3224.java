import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in); //--Entrada de Dados

        // variaveis

        String primeiro = input.nextLine();
        String segundo = input.nextLine();

        if(primeiro.length() < segundo.length()){
            System.out.println("no");
        }


        else if(primeiro.length() >= segundo.length()){
            System.out.println("go");
        }
    }
 
}