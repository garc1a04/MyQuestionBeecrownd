import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)throws IOException{
		
		Scanner input = new Scanner(System.in);
		int contador = 1;
		while(input.hasNext()){			
			int i,somador = 1,Numeros = input.nextInt();
			
			//Quantidade de numeros
			for (int p = 1; p <= Numeros; p++) {
    			somador += p;
    		}
			System.out.printf("Caso %d: %d numero"+(Numeros==0 ? "" : "s")+"\n",contador,somador);
			//Adição dos numeros
			for(i = 0;i<=Numeros;i++){
				if(i == 0){
					System.out.print("0"+(Numeros>0 ? " ":""));	
				}
					for(int j=i,K=i;j>0;j--){
							System.out.print(+K+(K==Numeros && j==1 ?"":" "));
						}
					}
			System.out.println("\n");
			contador+=1;
		}

	}
}