import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);//--Entrada de Dados

        //Variaveis
        double Nota1 = entrada.nextDouble();
        double Nota2 = entrada.nextDouble();
        double Nota3 = entrada.nextDouble();

        double Media = (((Nota1*2)+(Nota2*3)+(Nota3*5))/10);

        System.out.println("MEDIA = " + String.format("%.1f",Media));//--Saida de Dados
    }
}