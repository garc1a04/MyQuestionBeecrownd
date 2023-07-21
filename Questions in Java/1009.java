import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner OP = new Scanner(System.in);//--Entrada de Dados

    // Declaração de variaveis.
        String Nome = OP.nextLine();
        Double Salario = OP.nextDouble();
        Double Ganho = OP.nextDouble();

        OP.close();
        
    // Atribuições dos resultados.
        Double Bonus = Ganho*0.15;
        Double SalarioF = (Bonus + Salario);

        System.out.println("TOTAL = R$ " + String.format("%.2f", SalarioF));//--Saida de dados
    }
}