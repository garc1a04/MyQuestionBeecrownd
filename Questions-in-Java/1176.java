import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)throws IOException{
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int i= 0;
		while(i<N){
			int Numeros = input.nextInt();
			System.out.println(FiB(Numeros));
			i++;
		}
	}
	static String FiB(int X){
		long fibo[] = new long[X+1];
		if(X == 0) {
			return "Fib("+X+") = "+0;
		}
		fibo[0] = 0;
		fibo[1] = 1;
		for(int i = 2;i<=X;i++){
			fibo[i] = fibo[i-1]+fibo[i-2];
		}
		return "Fib("+X+") = "+fibo[X];
	}
}
