import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)throws IOException{
		Scanner input = new Scanner(System.in);
		while(input.hasNext()) {
			String a = input.nextLine();
			String[] Senha = a.split("");
			String alfabeto = "abcdefghijklmnopqrstuvwxyz";
			String[] alfabeto2 = alfabeto.split("");
			String[] alfabeto3 = alfabeto.toUpperCase().split("");
			String Numeros ="0123456789";
			String[] Numeros2 = Numeros.split("");

			int maiusculo=0,minusculo=0,numero=0,caracte=0,teste1=0,teste2=0,teste3=0;
			if(Senha.length>=6 && Senha.length<=32){
				
				for(int i=0;i<Senha.length;i++){
					for(int j=0;j<alfabeto2.length;j++) {
						if(alfabeto2[j].equals(Senha[i])){
							minusculo+=1;
							teste1+=1;
						}
					}
					for(int j=0;j<alfabeto3.length;j++) {
						if(alfabeto3[j].equals(Senha[i])){
							maiusculo+=1;
							teste2+=1;
						}
					}
					for(int j=0;j<Numeros2.length;j++) {
						if(Numeros2[j].equals(Senha[i])){
							numero+=1;
							teste3+=1;
						}
					}
					if(teste1 == 0 && teste2==0 && teste3==0){
						caracte +=1;
						break;
					}
					teste1=0;
					teste2=0;
					teste3=0;
				}
				if(caracte==0){
					if(numero == 0 || maiusculo==0 || minusculo==0){
						System.out.println("Senha invalida.");
					}
					else {
						System.out.println("Senha valida.");
					}
				}
				else {
					System.out.println("Senha invalida.");
				}
			}
			else {
				System.out.println("Senha invalida.");
			}
			
		}
	
	}
}