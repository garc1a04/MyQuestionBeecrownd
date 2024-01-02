import java.io.IOException;
import java.util.Scanner;

class Main{
	public static void main(String[] args) throws IOException  {
		Scanner input = new Scanner(System.in);
		
		String Formulario = input.nextLine();
		input.close();
		String []ArrayCaractere = Formulario.split("");
		
		if(ArrayCaractere.length<=140) {
			System.out.println("TWEET");
		}else {
			System.out.println("MUTE");
		}
	}
}