import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)throws IOException{
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		System.out.println(fatorial(a));
	}
	//-- Function 
	static int fatorial(int a) {
		int fatorial = a;
		for(;a>1;a--){
			fatorial *= (a-1);
		}
		return fatorial;
	}
}