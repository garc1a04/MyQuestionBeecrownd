import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
    	Scanner input = new Scanner(System.in);
    	
    	int Distancia = input.nextInt();
    	double Combustivel = input.nextDouble();
    	input.close();
    	
    	double Calculo = Distancia/Combustivel;
    	System.out.printf("%.3f km/l\n",Calculo);
    }
 
}