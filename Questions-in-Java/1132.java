import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)throws IOException{
		Scanner input = new Scanner(System.in);
		int PrimeiroDoI = input.nextInt();
		int SegundoDoI = input.nextInt();
		if(SegundoDoI<PrimeiroDoI) {
			int aux = SegundoDoI;
			SegundoDoI = PrimeiroDoI;
			PrimeiroDoI = aux;
		}
		input.close();
		System.out.println(Multiplo13(PrimeiroDoI,SegundoDoI));
	}
	static int Multiplo13(int X,int Y){
		int somatorio = 0;
		for(int i=X;i<=Y;i++) {
			if(i%13!=0) {
				somatorio+=i;
			}
		}
		return somatorio;
	}
}