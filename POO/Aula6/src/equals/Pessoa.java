package equals;

public class Pessoa {
	private String nome;
	private String idade;
	
	public Pessoa(String nome, String idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}
	
	public boolean equals(Object o) {
		if (o instanceof Pessoa) {
			Pessoa u = (Pessoa) o;
			return nome.equals(u.nome);
		}
		return false;
	}
}
