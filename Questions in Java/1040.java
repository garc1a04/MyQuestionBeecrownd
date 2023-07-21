import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in); //--Entrada de Dados

        // Variavel :)

        Float Notas1 = input.nextFloat();
        Float Notas2 = input.nextFloat();
        Float Notas3 = input.nextFloat();
        Float Notas4 = input.nextFloat();

        // Problema :)

        float Media =  (Notas1*2 + Notas2*3 + Notas3*4 + Notas4*1)/10;

        System.out.println("Media: "+ String.format("%.1f",Media));

        if(Media < 5){
            System.out.println("Aluno reprovado.");
        }

        else if(Media >= 7){
            System.out.println("Aluno aprovado.");
        }

        else{

            System.out.println("Aluno em exame.");

            //variaveis finais

            Float Notas5 = input.nextFloat();
            input.close();

            // Problema finais

            System.out.println("Nota do exame: " + String.format("%.1f",Notas5));

            Float media2 = (Media+Notas5)/2;

            if(media2 > 5 ){
                System.out.println("Aluno aprovado.");
            }
            if(media2 < 5 ){
                System.out.println("Aluno reprovado.");
            }

            System.out.println("Media final: " + String.format("%.1f",media2));

        }
    }
 
}