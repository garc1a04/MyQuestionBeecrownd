import java.io.IOException;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) throws Exception {

            Scanner input = new Scanner(System.in);//--Entrada de Dados

            // Variaveis

            double A = input.nextDouble();
            double B = input.nextDouble();
            double C = input.nextDouble();

            // Ordenação

            if(true){
                double aux = 0;
                if(A<B){
                    aux = A;
                    A = B;
                    B = aux;
                }

                if(A<C){
                    aux = A;
                    A = C;
                    C = aux;

                }
            }

            // Resulução
            if (A >= B + C){

                System.out.println("NAO FORMA TRIANGULO");
            }

            else{

                if( (A * A) == (B * B) + (C * C) ){
                    
                    System.out.println("TRIANGULO RETANGULO");
                    
                }
                if((A * A) > (B * B) + (C * C)){
    
                    System.out.println("TRIANGULO OBTUSANGULO");
    
                }
                if ((A * A) < (B * B) + (C * C)){
    
                    System.out.println("TRIANGULO ACUTANGULO");
                    
                }
                
                if (A == B && C == A && B == C){
                    
                    System.out.println("TRIANGULO EQUILATERO");
                    
                }
                else if (A == B || C == A || B == C){
                    
                    System.out.println("TRIANGULO ISOSCELES");
                    
                }
            }
    }
}
