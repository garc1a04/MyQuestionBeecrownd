import java.io.IOException;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) throws Exception {

            Scanner input = new Scanner(System.in); //--Entrada de Dados

            // variavel :)

            Float Salario = input.nextFloat();

            // Resultado :)

            if(Salario <= 400 && Salario >= 0){

                System.out.println("Novo salario: " + String.format("%.2f",(Salario*0.15)+Salario));
                System.out.println("Reajuste ganho: " + String.format("%.2f",((Salario*0.15))));
                System.out.println("Em percentual: 15 %");
            }
            
            else if(Salario > 400 && Salario <= 800){
                System.out.println("Novo salario: " + String.format("%.2f",(Salario*0.12)+Salario));
                System.out.println("Reajuste ganho: " + String.format("%.2f",((Salario*0.12))));
                System.out.println("Em percentual: 12 %");
            }

            else if(Salario > 800 && Salario <= 1200){
                System.out.println("Novo salario: " + String.format("%.2f",(Salario*0.1)+Salario));
                System.out.println("Reajuste ganho: " + String.format("%.2f",((Salario*0.1))));
                System.out.println("Em percentual: 10 %");
            }

            else if(Salario <= 2000 && Salario > 1200){
                System.out.println("Novo salario: " + String.format("%.2f",(Salario*0.07)+Salario));
                System.out.println("Reajuste ganho: " + String.format("%.2f",((Salario*0.07))));
                System.out.println("Em percentual: 7 %");
            }
            else if(Salario > 2000){
                System.out.println("Novo salario: " + String.format("%.2f",(Salario*0.04)+Salario));
                System.out.println("Reajuste ganho: " + String.format("%.2f",((Salario*0.04))));
                System.out.println("Em percentual: 4 %");
            }

    }
}