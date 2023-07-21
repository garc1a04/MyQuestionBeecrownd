import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);//--Entrada de Dados

       // Declaração de variavel 

        int Dias = input.nextInt();
        input.close();
       // Atribuições das variaveis

        int Ano = Dias/365;
        int mes = ((Dias%365)/30);
        int Dia = ((Dias%365)%30);

       // Saida de Dados
       
       System.out.println(Ano +" ano(s)");
       System.out.println(mes +" mes(es)");
       System.out.println(Dia +" dia(s)");
    }
}