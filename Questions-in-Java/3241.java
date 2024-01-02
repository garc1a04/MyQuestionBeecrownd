import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)throws IOException{
		Scanner input = new Scanner(System.in);
		int repeticoes = input.nextInt(),i = 0;
		input.nextLine();
		while(i<repeticoes){
			String Valores = input.nextLine().replace("+"," ");
			String[] Lista = Valores.split(" ");
			String[] Ver = Valores.split("");
			if(Ver[0].equalsIgnoreCase("P")){
				System.out.println("skipped");
			}
			else{
				int Soma = Integer.parseInt(Lista[0]) + Integer.parseInt(Lista[Lista.length-1]);
				System.out.println(Soma);
			}
			i++;
		}
	input.close();
	}
}