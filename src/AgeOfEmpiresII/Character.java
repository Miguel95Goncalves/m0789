package AgeOfEmpiresII;

public class Character {

	public Integer ataque;
	
	public Integer defesa;
	
	public Integer health;
	
	public Character(Integer ataque, Integer defesa, Integer health) {
		this.ataque = ataque;
		this.defesa = defesa;
		this.health = health;
	}

	public Integer getAtaque() {
		return ataque;
	}

	public void setAtaque(Integer ataque) {
		this.ataque = ataque;
	}

	public Integer getDefesa() {
		return defesa;
	}

	public void setDefesa(Integer defesa) {
		this.defesa = defesa;
	}

	public Integer getHealth() {
		return health;
	}

	public void setHealth(Integer health) {
		this.health = health;
	}

}
