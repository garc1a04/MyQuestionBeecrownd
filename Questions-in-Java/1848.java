import java.io.IOException;
import java.util.Scanner;

class Main{
	public static void main(String[] args) throws IOException  {
		Scanner input = new Scanner(System.in);
		
		String BinarioeGrito;
		int quantidadeDeRepeticoes = 3;
		
		//Repeticao para quantidade de piscadas
		for(int i = 0; i<quantidadeDeRepeticoes;i++) {
			int somatorio = 0;
			// Repeticao para Somar os numeros binarios
			while(true){
				BinarioeGrito = input.nextLine();
				String ResultadoBinario = "";
				
				if(BinarioeGrito.equalsIgnoreCase("caw caw")){
					break;
				}else {
					
					String [] Lista = BinarioeGrito.split("");	
					//Repeticao para achar os binarios
					for(int j = 0;j<Lista.length;j++) {
						if(Lista[j].equals("*")){
							ResultadoBinario+="1";
						}else {
							ResultadoBinario+="0";
						}
						
					}
					//Fazendo a conversão para decimal e a somatoria
					somatorio+= Integer.parseInt(ResultadoBinario,2);
				}
				
			}
			System.out.println(somatorio);
		}
	}
}