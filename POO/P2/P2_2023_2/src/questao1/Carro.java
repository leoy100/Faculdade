package questao1;

import java.util.ArrayList;
import java.util.List;

public class Carro 
{
	private String nome;
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	private String placa;
	private String cor;
	private int ano;
	private String renavan;
	
	//1.3
	private List <Acessorio> listaAcessorios = new ArrayList <Acessorio>();

	public List <Acessorio> getListaAcessorios() {
		return listaAcessorios;
	}

	public void setListaAcessorios(Acessorio a) {
		this.listaAcessorios.add(a);
	}
	
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getRenavan() {
		return renavan;
	}

	public void setRenavan(String renavan) {
		this.renavan = renavan;
	}
	
	public String toString(){
		return nome;
	}
	
}
