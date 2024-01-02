import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);//--Entrada de Dados

        // variaveis :)
        Double Numero = input.nextDouble();
        input.close();

        // Resolução :)

        if(Numero == 61 ){
            System.out.println("Brasilia");
        }
        else if(Numero == 71 ){
            System.out.println("Salvador");
        }

        else if(Numero == 11 ){
            System.out.println("Sao Paulo");
        }

        else if(Numero == 21 ){
            System.out.println("Rio de Janeiro");
        }

        else if(Numero == 32 ){
            System.out.println("Juiz de Fora");
        }

        else if(Numero == 19 ){
            System.out.println("Campinas");
        }

        else if(Numero == 27 ){
            System.out.println("Vitoria");
        }

        else if(Numero == 31 ){
            System.out.println("Belo Horizonte");
        }
        else{
            System.out.println("DDD nao cadastrado");

        }
    }
}
