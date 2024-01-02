import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner OP = new Scanner(System.in);//--Entrada de Dados

        // Declaração de variaveis.

        int codigo1 = OP.nextInt();
        int Qnt_peças1 = OP.nextInt();
        Double Preço1 = OP.nextDouble();

        int codigo2 = OP.nextInt();
        int Qnt_peças2 = OP.nextInt();
        Double Preço2 = OP.nextDouble();

        OP.close();

    // Atribuições dos resultados.

    Double ValorTotal = (Qnt_peças1*Preço1) + (Qnt_peças2*Preço2);

    System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", ValorTotal));//--Saida de Dados
    
    }
}