import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in); //--Entrada de Dados

       // Declaração de variavel 

        Double Lado_A =  input.nextDouble();
        Double Lado_B = input.nextDouble();
        Double Lado_C = input.nextDouble();
        input.close();

       // Atribuições das variaveis

       Double AreaTriagulo = ((Lado_A*Lado_C)/2);
       Double AreaCirculo = (3.14159*(Lado_C*Lado_C));
       Double AreaTrapezio = (((Lado_A+Lado_B)*Lado_C)/2);
       Double AreaQuadrado = (Lado_B*Lado_B);
       Double AreaRetangulo = (Lado_A*Lado_B);

       // Saida de Dados

       System.out.println("TRIANGULO: " + String.format("%.3f", AreaTriagulo));
       System.out.println("CIRCULO: " + String.format("%.3f", AreaCirculo));
       System.out.println("TRAPEZIO: " + String.format("%.3f", AreaTrapezio));
       System.out.println("QUADRADO: " + String.format("%.3f", AreaQuadrado));
       System.out.println("RETANGULO: " + String.format("%.3f", AreaRetangulo));

    }
}