package TPC161116;
import java.util.Scanner;
public class CalculadoraDeGastos {
	
	public CalculadoraDeGastos() {
		calcular();
	}
	
	public void calcular() {
		int agua,luz,gas,telecomunicacoes;
		float media=0;
		
		System.out.println("Introduza o valor da despesa mensal em agua: ");
		agua = (new Scanner(System.in)).nextInt();
	
		System.out.println("Introduza o valor da despesa mensal em luz: ");
		luz = (new Scanner(System.in)).nextInt();
		
		System.out.println("Introduza o valor da despesa mensal em gas: ");
		gas = (new Scanner(System.in)).nextInt();
		
		System.out.println("Introduza o valor da despesa mensal em telecomunicacoes: ");
		telecomunicacoes = (new Scanner(System.in)).nextInt();
		
		media = ((agua + luz + gas + telecomunicacoes)/4)*12;
		
		System.out.println("Media de despesa anual: " + media);
	}
}


