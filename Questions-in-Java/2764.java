import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)throws IOException{
		Scanner input = new Scanner(System.in);
		String[] Data = input.nextLine().split("/");
		System.out.printf("%s/%s/%s\n",Data[1],Data[0],Data[2]);
		System.out.printf("%s/%s/%s\n",Data[2],Data[1],Data[0]);
		System.out.printf("%s-%s-%s\n",Data[0],Data[1],Data[2]);
	}
}