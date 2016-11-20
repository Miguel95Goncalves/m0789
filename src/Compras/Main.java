package Compras;
import java.util.Scanner;

public class Main {
	
	public Main() {
		Double precoArtigo;
		
		Integer newAttr;
		
		System.out.println("Insira o preco do artigo1: ");
		precoArtigo = (new Scanner(System.in)).nextDouble();
		System.out.println("Insira o numero do artigo1: ");
		newAttr = (new Scanner(System.in)).nextInt();
		
		Artigo artigo1 = new Artigo(precoArtigo, newAttr);
		
		System.out.println("Insira o preco do artigo2: ");
		precoArtigo = (new Scanner(System.in)).nextDouble();
		System.out.println("Insira o numero do artigo2: ");
		newAttr = (new Scanner(System.in)).nextInt();
		
		Artigo artigo2 = new Artigo(precoArtigo, newAttr);
		
		System.out.println("Insira o preco do artigo3: ");
		precoArtigo = (new Scanner(System.in)).nextDouble();
		System.out.println("Insira o numero do artigo3: ");
		newAttr = (new Scanner(System.in)).nextInt();
		
		Artigo artigo3 = new Artigo(precoArtigo, newAttr);
		
		calcularDespesas(artigo1.preco,artigo2.preco,artigo3.preco);
		
	}
	
	private void alterarArtigo(Double preco1, Integer newAttr1,Double preco2, Integer newAttr2,Double preco3, Integer newAttr3) {
		Artigo artigo1 = new Artigo(preco1, newAttr1);
		Artigo artigo2 = new Artigo(preco2, newAttr2);
		Artigo artigo3 = new Artigo(preco3, newAttr3);
	}
	
	private void calcularDespesas(Double preco1, Double preco2, Double preco3) {
		Double soma=preco1+preco2+preco3;
		System.out.println("Valor total dos artigos: "+soma);
	}
	
}
