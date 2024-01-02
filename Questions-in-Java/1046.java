import java.io.IOException;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) throws Exception {

            Scanner input = new Scanner(System.in); //--Entrada de Dados

            // variaveis :)

            int Horas_Iniciais = (input.nextInt());
            int Horas_Finais = (input.nextInt());

            // Resolução :)

            if(Horas_Iniciais>Horas_Finais){
                
                Horas_Finais += 24;
                int diferença = Horas_Finais - Horas_Iniciais;
                System.out.println("O JOGO DUROU "+diferença+" HORA(S)");
            }

            else if(Horas_Iniciais<Horas_Finais){

                int diferença = Horas_Finais - Horas_Iniciais;
                System.out.println("O JOGO DUROU "+diferença+" HORA(S)");

            }
            else if(Horas_Iniciais == Horas_Finais){

                System.out.println("O JOGO DUROU 24 HORA(S)");
            }
    }
}