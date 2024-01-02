import java.io.IOException;
import java.util.Scanner;
import java.util.function.BiPredicate;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		String Bits = input.nextLine();
		String[] Bits1 =Bits.split(""); 
		
		int i = 0,contador = 0;
		
		while(i<Bits1.length){
			if(Bits1[i].equals("1")) {
				contador+=1;
			}
			i+=1;
		}
		if(contador%2 == 0) {
			Bits+="0";
		}
		else {
			Bits+=1;
		}	
		System.out.println(Bits);
		
	}
}
