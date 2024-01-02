import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)throws IOException{
		Scanner input = new Scanner(System.in);
		while(input.hasNext()) {
			int i = 0, N = input.nextInt();
			int A = N;
			while(A>1){
				A = N/2;
				N = A;
				i+=1;
			}
			System.out.println(i);
		}
		
		
	}
}
