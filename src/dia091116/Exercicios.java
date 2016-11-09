package dia091116;

import java.util.Scanner;

public class Exercicios {

	public Exercicios() {
		exercicio3();
		
		
	}
	
	public void exercicio1() {
		// Exerc�cio 1 N�vel 2
		// Declare duas variaveis do tipo inteiro
		// Pe�a ao utilizador para introduzir dois n�meros (o primeiro mais pequeno que o segundo e com uma diferen�a de pelo menos 4 n�meros)
		// Verifique quantos n�meros pares existe entre eles
		// Valide a introdu��o do utilizador
		
		int num1, num2, contadorPares=0;
		
		System.out.println("Introduza o primeiro n�mero:");
		num1 = (new Scanner(System.in)).nextInt();
		
		System.out.println("Introduza o segundo n�mero:");
		num2 = (new Scanner(System.in)).nextInt();
		
		while (num2 - num1 >= 4 && num1 < num2) {
			
			for (int i=num1;i<=num2;i++) {
				if (i%2==0) {
					contadorPares += 1;
				}
			}
			
			System.out.println("N�mero de pares = " + contadorPares);
			num1 = 0;
			num2 = 0;
		}
		
	}
	
	public void exercicio2() {
			// Exerc�cio 2 N�vel 1
			// Pe�a ao utilizador um n�mero de cada vez e v� somando esses n�meros at� o utilizador introduzir o n�mero 0
			// Verifique se � par ou impar
			// Utilize o ciclo Do While
		
			int num, soma=0;
			
			do {
				System.out.println("Introduza um n�mero:");
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
		//Exerc�cio 3 N�vel 3
		// Utilize uma matriz 3 por 3
		// Pe�a ao utilizador para preencher a matriz
		// No final apresente a soma de todos os valores e apresente graficamente a matriz
		
		int[][] matriz = new int[3][3];
		int soma=0, num;
		
		for (int i=0;i<=2;i++) {
			for (int o=0;o<=2;o++) {
				System.out.println("Introduza o n�mero na posicao: " + i + " " + o);
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
