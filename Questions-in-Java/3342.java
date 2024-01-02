mport java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)throws IOException{
		Scanner input = new Scanner(System.in);
		int Tamanho = input.nextInt(),Casas = 1;
		int[][] Xadrez = new int[Tamanho][Tamanho];
		for(int i = 0;i<Xadrez.length;i++){
			for(int j = 0;j<Xadrez.length;j++) {
				Xadrez[i][j] = Casas;
				Casas+=1;
			}
		}
		int Brancas = 0,Pretas = 0;
		for(int i =0;i<Xadrez.length;i++){
			for(int j =0;j<Xadrez.length;j++){
				if(Xadrez[i][j]%2==0) {
					Pretas+=1;
				}
				else {
					Brancas+=1;
				}
			}
		}
		System.out.printf("%d casas brancas e %d casas pretas\n",Brancas,Pretas);
	}
}