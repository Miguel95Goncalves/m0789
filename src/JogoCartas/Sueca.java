package JogoCartas;

public class Sueca extends Jogo {
	public Sueca() {
		Carta asespadas = new Carta(4,"As",11);
		baralho.add(asespadas);
		
		Carta asouros = new Carta(3,"As",11);
		baralho.add(asouros);
		
		Carta aspaus = new Carta(2,"As",11);
		baralho.add(aspaus);
		
		Carta ascopas = new Carta(1,"As",11);
		baralho.add(ascopas);
	}
}
