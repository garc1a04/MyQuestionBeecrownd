import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int i=0,contador= 0;
		while(i<6) {
			Double A = input.nextDouble();
			if(A>0) {
				contador+=1;
			}
			i+=1;
		}
		System.out.printf("%d valores positivos\n",contador);
	}
}