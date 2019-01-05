package classes;

import java.util.Random;

import informações.Modificador;

public class Feiticeiro {

	private int vida;
	private String nome = "Feiticeiro";
	
	public Feiticeiro() {
		Random aleatorio = new Random();
		int hp;
		hp = aleatorio.nextInt(7);
		
		while(hp < 1) 
			hp = aleatorio.nextInt(7);

		this.vida = hp;
	}

	public int getVida() {
		return vida;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return "Classe: "
				+ getNome()
				+ "%nHP: 1D6%n";
	}
	
}
