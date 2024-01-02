import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)throws IOException{
		Scanner input = new Scanner(System.in);
			int[] lista = new int[4];
			//-- Loops/Laços
			for(int i = 0;i<lista.length;i++){
				int Numeros = input.nextInt();
				lista[i] = Numeros;//-- Atribuição dos valores a lista
			}
			
			//-- Ordenação por seleção
			int aux = 0;
			for(int j = 0;j<lista.length;j++){//--Repetições para todas as variaveis dentro da lista
				for(int i = 0;i<lista.length-1;i++){//-- Loop para troca de valores.
					if(lista[i] < lista[i+1]){ //-- Se o primeiro valor for menor que o próx haverá uma troca
						aux = lista[i+1];
						lista[i+1] = lista[i];
						lista[i] = aux;
					}
				}
			}
			//Condições para um triangulo
			Boolean verificação = false;
			for(int i = 0;i<lista.length-2;i++) {
				if(lista[i] < lista[i+1]+lista[i+2]){
					if(lista[i]>lista[i+1]-lista[i+2]) {
						System.out.println("S");
						verificação = true;
						break;
					}
				}
			}
			if(verificação == false) {
				System.out.println("N");
			}
	}
}