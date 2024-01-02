import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)throws IOException{
		Scanner input = new Scanner(System.in);
		//Inputs
		
		int Linha = input.nextInt();
		input.nextLine();
		String Operacao = input.nextLine();
		
		//Criação da matriz e adição dos valores
		double[][] Matriz = new double[12][12];
		
		for(int i = 0;i<Matriz.length;i++) {
			for(int j = 0;j<Matriz.length;j++){
				double Valores = input.nextDouble();
				Matriz[i][j] = Valores;
			}
		}
		double Total = 0;
		for(int i = 0;i<Matriz.length;i++) {
			Total+=Matriz[Linha][i];
		}
		
		if("S".equals(Operacao)) {
			System.out.println(Total);
		}
		else {
			double Media = Total/Matriz.length;
			System.out.println(Media);
		}
	}
}