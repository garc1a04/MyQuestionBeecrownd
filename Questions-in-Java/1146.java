import java.io.IOException;
import java.util.Scanner;

class Main{
	public static void main(String[] args) throws IOException  {
		Scanner input = new Scanner(System.in);
		
		
		while(true) {
			int Numeros = input.nextInt();
			//Loop para as contagens
			int i = 1;
			String PrimeirosNumeros = "";
			while(i<=Numeros) {
				String UltimoNumero = i == Numeros? PrimeirosNumeros+i+"\n": "";
				PrimeirosNumeros = i< Numeros ? PrimeirosNumeros+i+" ":UltimoNumero;
				i++;
			}
			System.out.print(PrimeirosNumeros);
			
			//fim dos testes
			if(Numeros == 0) {
				break;
			}
		}
	}
}