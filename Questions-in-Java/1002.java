import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in); //--Entrada de Dados
        
        //Variaveis
        double numero1 = entrada.nextDouble();

        double Area = 3.14159*(numero1*numero1);

        System.out.println("A="+ String.format("%.4f", Area)); //--Saida de Dados
    }
}