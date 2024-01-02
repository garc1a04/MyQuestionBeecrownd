import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);//--Entrada de Dados

       // Declaração de variavel 

        int Segundos =  input.nextInt();
        input.close();

       // Atribuições das variaveis

       int Minutos = (Segundos/60);
        int Horas = (Minutos/60);
        int Minutos2 = (Minutos%60);

        int Resto = (Segundos%60);

       //Saida de Dados
       System.out.println(Horas+":"+Minutos2+":"+ Resto);
    }
}