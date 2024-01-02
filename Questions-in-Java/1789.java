import java.io.IOException;
import java.util.Scanner;

class Main{
	public static void main(String[] args) throws IOException  {
		Scanner input = new Scanner(System.in);
		int Level = 0;
		int maior = 0;
		while(input.hasNext()) {
			int Quantidade = input.nextInt();
			
			//Definindo a maior velocidade da Lesma
			for(int i = 0; i<Quantidade; i++){
				int Velocidade = input.nextInt();
				if(Velocidade > maior) {
					maior = Velocidade;
				}
			}
			//Achando o nivel da Lesma
			if(maior < 10) {
				Level = 1;
			}else if(maior>=10 && maior<20) {
				Level = 2;
			}else if(maior>=20){
				Level = 3;
			}
			maior = 0;
			System.out.println(Level);
		}
	}
}