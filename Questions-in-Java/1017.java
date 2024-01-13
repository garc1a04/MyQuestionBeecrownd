package MainForAplicações;

import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
    	
    	digitalizacao Dados = new digitalizacao();
    	Combustivel comb = new Combustivel(Dados.TipoInt(),Dados.TipoInt());
    	comb.GastoCombustivel();
    }
}

class Combustivel{
	
	private int Horas;
	private int Velocidade;
	private final double GastoKMporL = 12.0;
	
	Combustivel(int Hora, int Velocidade){
		this.Horas = Hora;
		this.Velocidade = Velocidade;
	}
	
	public void GastoCombustivel() {
		int KmH = Horas*Velocidade;
		double GastoTotal = KmH/GastoKMporL;
		new Print("%.3f\n",GastoTotal);
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