package JogoCartas;

public class Carta {
	public Integer Naipe;
	
	public String Nome;
	
	public Integer Pontuacao;
	
	public Carta(Integer Naipe, String Nome, Integer Pontuacao) {
		this.Naipe = Naipe;
		this.Nome = Nome;
		this.Pontuacao = Pontuacao;
	}
	
	public String getNome() {
		return null;
	}
	
	public Integer getPontuacao() {
		return null;
	}
	
	public Integer getNaipe() {
		return null;
	}
	
	public void setNaipe(Integer Naipe) {
		this.Naipe = Naipe;
	}
	
	public void setNome(String Nome) {
		this.Nome = Nome;
	}
	
	public void setPontuacao(Integer Pontuacao) {
		this.Pontuacao = Pontuacao;
	}
}
