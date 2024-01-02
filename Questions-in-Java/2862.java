import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int i = 0,N = input.nextInt();
		while(i<N) {
			int insetos = input.nextInt();
			if(insetos > 8000) {
				System.out.println("Mais de 8000!");
			}
			else {
				System.out.println("Inseto!");
			}
			i+=1;
		}
		
	}
}
