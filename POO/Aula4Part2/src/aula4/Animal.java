package aula4;

public class Animal {
	private String nome;
	private int idade;
	private String cor;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void emitirSom()
	{
		System.out.println("Som genérico");
	}
	
	public String toString() {
		return getNome();
	}

}
