import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)throws IOException{
		Scanner input = new Scanner(System.in);
		int Potencia = input.nextInt();
		double Fibo = (Math.pow(((1+Math.sqrt(5))/2),Potencia) - Math.pow(((1-Math.sqrt(5))/2),Potencia))/Math.sqrt(5);
		System.out.printf("%.1f\n",Fibo);
	}
}