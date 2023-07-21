import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);//--Entrada de Dados

        //Variaveis
        double Nota1 = entrada.nextDouble();
        double Nota2 = entrada.nextDouble();

        double Soma = (((Nota1*3.5)+(Nota2*7.5))/11);

        System.out.println("MEDIA = " + String.format("%.5f",Soma));//--Saida de Dados
    }
}