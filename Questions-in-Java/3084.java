import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)throws IOException{
		Scanner input = new Scanner(System.in);
		while(input.hasNext()) {
			int Horas = input.nextInt();
			int Minutos = input.nextInt();
			if(Horas == 0 && Minutos==0) {
				System.out.println("00:00");
			}
			else{
				int i = Horas/30;
				int j = Minutos/6;
				if(j<10 && i<10) {
					System.out.printf("0%d:0%d\n",i,j);				
				}
				else if(j<10) {
					System.out.printf("%d:0%d\n",i,j);
					
				}	             
				else if(i<10) {
					System.out.printf("0%d:%d\n",i,j);
				}	            
	            else {
	            	System.out.printf("%d:%d\n",i,j);	     
	            }
			}
		}
	
	}
}
