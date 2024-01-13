package MainForAplicações;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
    	Scanner input = new Scanner(System.in);
    	int Repeticao = input.nextInt();
    	for(int i=0;i<Repeticao;i++) {
    		int Numeros = input.nextInt();
    		int contador = 0;
    		for(int j=1;true;j++) {
    			if(Numeros%j==0) {
    				contador++;
    			}
    			if(contador>2) {
    				System.out.printf("%d nao eh primo\n", Numeros);
    				break;
    			}
    			if(Numeros == j) {
    				break;
    			}
    		}
    		if(contador <= 2) {
    			System.out.printf("%d eh primo\n", Numeros);
    		}
    		
    	}
    }
}