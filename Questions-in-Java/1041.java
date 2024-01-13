package MainForAplicações;

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
    	digitalizacao dados = new digitalizacao();
    	quadrantes q = new quadrantes(dados.TipoDouble(),dados.TipoDouble());
    	
    	q.TipoQuadrante();
    	
    }
}
class quadrantes{
	private double X;
	private double Y;
	
	quadrantes(double X, double Y){
		this.X  = X;
		this.Y = Y;
	}
	
	public void TipoQuadrante() {
		if(X>0 && Y>0) new Print("Q1");
		else if(X<0 && Y>0) new Print("Q2"); 
		else if(X<0 && Y<0) new Print("Q3"); 
		else if(X>0 && Y<0) new Print("Q4");
		else if(X==0 && Y==0) new Print("Origem"); 
		else if(X==0) new Print("Eixo Y"); 
		else if(Y==0) new Print("Eixo X"); 
	}
}
class Print{
	Print(String a,Object valor){
		System.out.printf(a,valor);
	}
	Print(Object valor){
		System.out.println(valor);
	}
}
class digitalizacao{
	Scanner input = new Scanner(System.in);
	digitalizacao(){
	}
	public int TipoInt() {
		return input.nextInt();
	}
	public double TipoDouble() {
		return input.nextDouble();
	}
	public String TipoString() {
		return input.nextLine();
	}
}