package MainForAplicações;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
    	Scanner input = new Scanner(System.in);
    	int Dinheiro = input.nextInt(),Resto;
    	
    	input.close();
    	System.out.println(Dinheiro);
    	Resto = Dinheiro%100;
    	System.out.println(Dinheiro/100+" nota(s) de R$ 100,00");
    	Dinheiro = Resto;
    	Resto = Dinheiro%50;
    	System.out.println(Dinheiro/50+" nota(s) de R$ 50,00");
    	Dinheiro = Resto;
    	Resto = Dinheiro%20;
    	System.out.println(Dinheiro/20+" nota(s) de R$ 20,00");
    	Dinheiro = Resto;
    	Resto = Dinheiro%10;
    	System.out.println(Dinheiro/10+" nota(s) de R$ 10,00");
    	Dinheiro = Resto;
    	Resto = Dinheiro%5;
    	System.out.println(Dinheiro/5+" nota(s) de R$ 5,00");
    	Dinheiro = Resto;
    	Resto = Dinheiro%2;
    	System.out.println(Dinheiro/2+" nota(s) de R$ 2,00");
    	Dinheiro = Resto;
    	Resto = Dinheiro%1;
    	System.out.println(Dinheiro/1+" nota(s) de R$ 1,00");
    }
 
}