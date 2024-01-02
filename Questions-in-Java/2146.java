import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)throws IOException {
		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
			int N = input.nextInt();
			System.out.println(N-1);
		}
	}
}