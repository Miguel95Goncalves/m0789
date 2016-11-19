package JogoCartas;

public class CimaBaixo extends Jogo {
	public CimaBaixo() {
		Carta asespadas = new Carta(3,"As",1);
		asespadas.setPontuacao(1);
		asespadas.setNaipe(3);
		asespadas.setNome("As");
		baralho.add(asespadas);
		
		Carta manilhaOuros = new Carta(2, "7", 7);
		baralho.add(manilhaOuros);
		
		Carta duqueCopas = new Carta(1, "2", 2);
		baralho.add(duqueCopas);
	}
}
