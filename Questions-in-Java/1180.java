import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)throws IOException{
		Scanner input = new Scanner(System.in);
		int quantidade = input.nextInt(),menor = 0,posição = 0;
		int valores[] = new int[quantidade];
		for(int i = 0;i<valores.length;i++){
			int Valor = input.nextInt();
			valores[i] = Valor;
			menor = valores[0];
			for(int j = 0;i == quantidade-1 && j<valores.length;j++) {
				if(menor>valores[j]){
					menor = valores[j];
					posição = j;
				}		
			}
		}
		System.out.printf("Menor valor: %d\nPosicao: %d\n",menor,posição);
	}
}