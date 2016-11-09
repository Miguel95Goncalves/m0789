package dia091116;

import java.util.Scanner;

public class Exercicios {

	public Exercicios() {
		exercicio3();
		
		
	}
	
	public void exercicio1() {
		// Exercício 1 Nível 2
		// Declare duas variaveis do tipo inteiro
		// Peça ao utilizador para introduzir dois números (o primeiro mais pequeno que o segundo e com uma diferença de pelo menos 4 números)
		// Verifique quantos números pares existe entre eles
		// Valide a introdução do utilizador
		
		int num1, num2, contadorPares=0;
		
		System.out.println("Introduza o primeiro número:");
		num1 = (new Scanner(System.in)).nextInt();
		
		System.out.println("Introduza o segundo número:");
		num2 = (new Scanner(System.in)).nextInt();
		
		while (num2 - num1 >= 4 && num1 < num2) {
			
			for (int i=num1;i<=num2;i++) {
				if (i%2==0) {
					contadorPares += 1;
				}
			}
			
			System.out.println("Número de pares = " + contadorPares);
			num1 = 0;
			num2 = 0;
		}
		
	}
	
	public void exercicio2() {
			// Exercício 2 Nível 1
			// Peça ao utilizador um número de cada vez e vá somando esses números até o utilizador introduzir o número 0
			// Verifique se é par ou impar
			// Utilize o ciclo Do While
		
			int num, soma=0;
			
			do {
				System.out.println("Introduza um número:");
				num = (new Scanner(System.in)).nextInt();
				
				soma += num;
				System.out.println("Soma = " + soma + "\n");
			} while (num!=0);
			
			if (soma%2==0) {
				System.out.println("Par");
			} else {
				System.out.println("Impar");
			}
		}

	public void exercicio3() {
		//Exercício 3 Nível 3
		// Utilize uma matriz 3 por 3
		// Peça ao utilizador para preencher a matriz
		// No final apresente a soma de todos os valores e apresente graficamente a matriz
		
		int[][] matriz = new int[3][3];
		int soma=0, num;
		
		for (int i=0;i<=2;i++) {
			for (int o=0;o<=2;o++) {
				System.out.println("Introduza o número na posicao: " + i + " " + o);
				matriz[i][o] = (new Scanner(System.in)).nextInt();
				
				soma += matriz[i][o];
			}
		}
		
		System.out.println("\nSoma = " + soma + "\n");
		//for (int i=0;i<=2;i++) {
			//for (int o=0;o<=2;o++) {
				System.out.println(matriz[0][0] + " " + matriz[0][1] + " " + matriz[0][2]);
				
				System.out.println(matriz[1][0] + " " + matriz[1][1]  + " " + matriz[1][2]);
				
				System.out.println(matriz[2][0] + " " +  matriz[2][1] + " " + matriz[2][2]);
			//}
			//System.out.println("\n");
		//}
		
	}

}
