import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)throws IOException{
		Scanner input = new Scanner(System.in);
		while(input.hasNext()) {
			int degraus = input.nextInt();
			int H = input.nextInt(),C = input.nextInt(),L = input.nextInt();
			
			double Hipotenusa = Math.sqrt((Math.pow(degraus*C,2)+ Math.pow(degraus*H,2)));
			double Area = (Hipotenusa*L)/10000.0;
			System.out.printf("%.4f\n",Area);
		}
	}
}