package dia091116;

public class TreinoArrays {

	public TreinoArrays() {
		
		// Numero de golos - Porto-Benfica
		// Tipo de variavel; [] Array; Nome de variavel; Inicializacao
		// Tamanho de variavel
		int[] golos = new int[2];
		
		// Atribuir variaveis ao Array
		golos[0] = 1;
		golos[1] = 1;
		//System.out.println(golos[0]);
		
		// Instanciacao com inicializacao de variaveiss
		int[] portobenfica = {1, 1};
		int[] sportingarouca = {3, 0};
		int[] maritimobraga = {1, 0};
		int[][] jogosgrandes = new int[2][3];
		
		jogosgrandes[0][0] = portobenfica[0];
		jogosgrandes[1][0] = portobenfica[1];
		
		jogosgrandes[0][1] = sportingarouca[0];
		jogosgrandes[1][1] = sportingarouca[1];
		
		jogosgrandes[0][2] = maritimobraga[0];
		jogosgrandes[1][2] = maritimobraga[1];
		
		System.out.println(jogosgrandes[0][0]);
	}

}
