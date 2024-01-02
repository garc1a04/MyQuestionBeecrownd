import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)throws IOException{
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		input.close();
		Divisores(N);
	}
	static int Divisores(int X){
		for(int i = 1;i<=X;i++) {
			if(X%i==0){
				System.out.println(i);
			}
		}
		return 0;
	}
}