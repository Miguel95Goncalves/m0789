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
		
		int num1,num2,cont=0;
		
		do
		{
			System.out.println("Introduza o numero 1:");
			num1 = (new Scanner(System.in)).nextInt();
			
			System.out.println("Introduza o numero 2:");
			num2 = (new Scanner(System.in)).nextInt();
		}while(num1>num2 || num2-num1<4);
		
		for(int i=num1;i<=num2;i++)
		{
			if(i%2==0) cont++;
		}
		
		System.out.println("Número de pares: "+cont);
		
	}
	
	public void exercicio2() {
		// Exercício 2 Nível 1
		// Peça ao utilizador um número de cada vez e vá somando esses números até o utilizador introduzir o número 0
		// Verifique se é par ou impar
		// Utilize o ciclo Do While
	
		int num,soma=0;
		
		do
		{
			System.out.println("Introduza o número:");
			num = (new Scanner(System.in)).nextInt();
			soma+=num;
		}while(num!=0);
		
		if(soma%2==0) System.out.println("A soma é "+soma+" e é um número par!");
		else System.out.println("A soma é "+soma+" e é um número impar!");
		
	}

	public void exercicio3() {
		//Exercício 3 Nível 3
		// Utilize uma matriz 3 por 3
		// Peça ao utilizador para preencher a matriz
		// No final apresente a soma de todos os valores e apresente graficamente a matriz, apenas com um ciclo for
		
		int[][] matriz = new int[3][3];
		int soma=0;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println("Qual o valor da posição "+i+" "+j+"?");
				matriz[i][j] = (new Scanner(System.in)).nextInt();
				soma+=matriz[i][j];
			}
		}
		
		System.out.println("Soma: "+soma);
		
		for(int i=0;i<3;i++)
		{
			System.out.println(matriz[i][i-i]+"|"+matriz[i][i-i+1]+"|"+matriz[i][i-i+2]);
		}
		
		
		
		
		
		/*int[][] matriz = new int[3][3];
		int soma=0, num;
		
		for (int i=0;i<=2;i++) {
			for (int o=0;o<=2;o++) {
				System.out.println("Introduza o número na posicao: " + i + " " + o);
				matriz[i][o] = (new Scanner(System.in)).nextInt();
				
				soma += matriz[i][o];
			}
		}
		
		System.out.println("\nSoma = " + soma + "\n");
		
		System.out.println("--" + "---" + "--");
		for (int i=0;i<=2;i++) {
			System.out.println("|" + matriz[i][i-i] + "|" + matriz[i][i+1-i] + "|" + matriz[i][i+2-i] + "|");
			System.out.println("--" + "---" + "--");
		}*/
		
	}

}
