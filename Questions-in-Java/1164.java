import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)throws IOException{
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int i= 0;
		while(i<N){
			int Numeros = input.nextInt();
			System.out.println(Perfeito(Numeros));
			i++;
		}
	}
	static String Perfeito(int X){
		int Sum = 0;
		for(int i = 1;i<X;i++){
			Sum+=i;
			if(Sum == X) {
				return X+" eh perfeito";
			}
			if(Sum > X) {
				break;
			}
		}
		return X+" nao eh perfeito";
	}

}