import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)throws IOException{
		Scanner input = new Scanner(System.in);
		int i,aumentoA,aumentoB,N = input.nextInt();
		for(i=0;i<N;i++){
			int Anos = 0;
			int PA = input.nextInt();
			int PB = input.nextInt();
			Double C1 = input.nextDouble();
			Double C2= input.nextDouble();
			aumentoA = PA;
			aumentoB = PB;
			while(true){
				aumentoA+=(aumentoA*(C1/100));
				aumentoB+=(aumentoB*(C2/100));
				Anos+=1;
				if(Anos > 100) {
					break;				
				}
				if(aumentoA>aumentoB){
					break;
				}
			}
			if(Anos <= 100) {
				System.out.println(Anos+" anos.");
			}
			else {
				System.out.println("Mais de 1 seculo.");
			}
		}
	}
}
