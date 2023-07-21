import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);//--Entrada de Dados.

        // Declaração de variaveis.

        Double Raio = input.nextDouble();
        input.close();
        
        // Atribuições dos resultados.
        Double Volume = (((4.0/3)*3.14159)*(Raio*Raio*Raio));//Use (4.0/3) ou (4/3.0),pois (4/3),ele te retorna um numero inteiro.

        System.out.println("VOLUME = " + String.format("%.3f", Volume));//--Saida de Dados.
        
    }
}