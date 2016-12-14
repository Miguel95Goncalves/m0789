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
		
		System.out.println("N�mero de pares: "+cont);
		
	}
	
	public void exercicio2() {
		// Exerc�cio 2 N�vel 1
		// Pe�a ao utilizador um n�mero de cada vez e v� somando esses n�meros at� o utilizador introduzir o n�mero 0
		// Verifique se � par ou impar
		// Utilize o ciclo Do While
	
		int num,soma=0;
		
		do
		{
			System.out.println("Introduza o n�mero:");
			num = (new Scanner(System.in)).nextInt();
			soma+=num;
		}while(num!=0);
		
		if(soma%2==0) System.out.println("A soma � "+soma+" e � um n�mero par!");
		else System.out.println("A soma � "+soma+" e � um n�mero impar!");
		
	}

	public void exercicio3() {
		//Exerc�cio 3 N�vel 3
		// Utilize uma matriz 3 por 3
		// Pe�a ao utilizador para preencher a matriz
		// No final apresente a soma de todos os valores e apresente graficamente a matriz, apenas com um ciclo for
		
		int[][] matriz = new int[3][3];
		int soma=0;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println("Qual o valor da posi��o "+i+" "+j+"?");
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
				System.out.println("Introduza o n�mero na posicao: " + i + " " + o);
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
