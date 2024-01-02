import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);//--Entrada de Dados

        // Declaração de variavel 

         double Dinheiro = input.nextDouble();
         input.close();

        // Atribuições das variaveis

         int Dinheiro2 = (int)Dinheiro; // parte inteira das notas

         int Dinheiro3 = (int) ((Dinheiro - Dinheiro2)*100); // parte decimal das notas(Moedas)


         //Redução das Notas
         /*
          Foi utilizado um metodo mais "Complexo", pois para simplificar,
          peguei o resto do resultado de cima e dividia pela nota.

          Ex:

            int Nota100 = dindin2/100;
            int Nota50 = ((dindin2%100)/50);
            
          */

         int Nota100 = Dinehiro2/100;

         int Nota50 = ((Dinehiro2%100)/50);

         int Nota20 = (((Dinehiro2%100)%50)/20);

         int Nota10 = ((((Dinehiro2%100)%50)%20)/10);

         int Nota5 = ((((((Dinehiro2%100)%50))%20)%10)/5);

         int Nota2 = (((((((Dinehiro2%100)%50))%20)%10)%5)/2);

         int Nota1 = (((((((Dinehiro2%100)%50))%20)%10)%5)%2/1);


         int moeda50 = ((Dinheiro3%100)/50);
         int moeda25 = (((Dinheiro3%100)%50)/25);
         int moeda10 = ((((Dinheiro3%100)%50)%25)/10);
         int moeda05 = ((((((Dinheiro3%100)%50))%25)%10)/5);
         int moeda01 = ((((((Dinheiro3%100)%5)%25)%10)%5)/1);

        //Saida de Dados
        
        System.out.println("NOTAS:");

         System.out.println(Nota100 + " nota(s) de R$ 100.00" );
         System.out.println(Nota50 + " nota(s) de R$ 50.00");
         System.out.println(Nota20 + " nota(s) de R$ 20.00");
         System.out.println(Nota10 + " nota(s) de R$ 10.00");
         System.out.println(Nota5 + " nota(s) de R$ 5.00");
         System.out.println(Nota2 + " nota(s) de R$ 2.00");

         System.out.println("MOEDAS:");

         System.out.println(Nota1 + " moeda(s) de R$ 1.00");
         System.out.println(moeda50 + " moeda(s) de R$ 0.50");
         System.out.println(moeda25 + " moeda(s) de R$ 0.25");
         System.out.println(moeda10 + " moeda(s) de R$ 0.10");
         System.out.println(moeda05 + " moeda(s) de R$ 0.05");
         System.out.println(moeda01 + " moeda(s) de R$ 0.01");

    }
}