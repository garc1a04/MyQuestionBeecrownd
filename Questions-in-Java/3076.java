import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)throws IOException{
		Scanner input = new Scanner(System.in);
		int Seculo = 0;
		while(input.hasNext()){
			int i = 0;
			int N = input.nextInt();
			while(N>=1){
				Seculo = N/100;
				N = N-100;
				i+=1;
			}
			System.out.println(i);;
		}
	}
}