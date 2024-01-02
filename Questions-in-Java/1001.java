import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);//-- Entrada de dados

        //Variaveis
        int numero1 = entrada.nextInt();
        int numero2 = entrada.nextInt();

        int Soma = numero1+numero2;//---Resultado

        System.out.println("X = " + Soma);//-- Impressão
    }
}