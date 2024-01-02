import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)throws IOException{
		Scanner input = new Scanner(System.in);
		//-- Variaveis
		String Letra = input.nextLine();
		String Frase = input.nextLine();		
		double contador = 0;
		String[] Palavras = Frase.split(" ");
		double valores = Palavras.length;
		input.close();
		
		// Loops
		for(int i = 0;i<Palavras.length;i++){//--Loop somenta das palavras
			String[] Quebra = Palavras[i].split("");//--Quebra a palavra
			for(int j = 0;j<Quebra.length;j++){//--Loop somenta das letras quebradas
				if(Quebra[j].equalsIgnoreCase(Letra)) {
					contador+=1;
					break;
				}
			}
		}
		double porcentagem =(contador/valores)*100;
		System.out.printf("%.1f\n",porcentagem);
	}
}