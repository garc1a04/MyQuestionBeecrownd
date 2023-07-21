import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);//--Entrada de Dados

        //Variaveis
        int numero1 = entrada.nextInt();
        int numero2 = entrada.nextInt();

        int Produto = numero1*numero2;

        System.out.println("PROD = " + Produto);//--Saida de Dados
    }
}