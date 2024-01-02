import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)throws IOException{
		Scanner input = new Scanner(System.in);
		int Quantidade = input.nextInt();
		
		for(int i = 0;i<Quantidade;i++){
			int X = input.nextInt(),Y = input.nextInt();
			int Rafael = ((3*X)*(3*X))+(Y*Y);
			int Beto = 2*(X*X)+((5*Y)*(5*Y));
			int Carlos = (-100*X) + (Y*Y*Y);
			
			String Rafael1 = Rafael>Carlos && Rafael>Beto ? "Rafael ganhou":"";
			String Beto1 = Rafael<Beto && Beto>Carlos ? "Beto ganhou":Rafael1;
			String Carlos1 = Carlos>Rafael && Carlos>Beto ? "Carlos ganhou":Beto1;
			
			System.out.println(Carlos1);
		}
		
	}
}