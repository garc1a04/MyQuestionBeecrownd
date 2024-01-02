import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)throws IOException{
		Scanner input = new Scanner(System.in);
		while(input.hasNext()) {
			//-- Variaveis/Variable
			int tamanho = input.nextInt();
			int[][] Matriz = new int[tamanho][tamanho];
			
			//-- Laços / Loops
			
			for(int i = 0;i< Matriz.length;i++) {//--Linha
				for(int j = 0;j< Matriz.length;j++){// -- Coluna
					//-- Atribuição dos valores 2 para Diag.Secundaria
					if(i+j == tamanho-1) {
						Matriz[i][j] = 2;
					}
					//--Atribuição dos valores 1 para a Diag.Principal
					else if(i==j) { 
						Matriz[i][j] = 1;
					}
					//-- Atribuição do resto
					else {
						Matriz[i][j] = 3;
					}
				}
			}
			
			//Print :)
				for(int i1 = 0;i1<Matriz.length;i1++) {//--Linha
					for(int j = 0;j<Matriz.length;j++){// -- Coluna
						System.out.print(Matriz[i1][j]);
					}
					System.out.println("");
				}
				
			}
		}
	}