package questao2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.lang.Comparable;

public class Filme implements Comparable <Filme> 
{
	private int id;
	private String titulo;
	private int ano;
//	private ArrayList lista = new ArrayList();
//
	public Filme(int id)
 	{
		this.id = id;
//		ArrayList<Filme> lista = new ArrayList();
//		this.lista = lista;
	}
//
//	public void setLista(Filme f) {
//		(this.lista).add(f.getTitulo());
//		Collections.sort(this.lista);
//	}
//
//	public ArrayList getLista() {
//		return lista;
//	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	// toString
	public String toString() {
		return getTitulo();
	}

	// Compare to
	@Override
	public int compareTo(Filme f) 
	{
		return (this.titulo).compareTo(f.getTitulo());
	}
	
	//2 | a
	public boolean equals(Object o)
	{
		if (o instanceof Filme f)
		{
			return this.titulo.equals(f.titulo);
		}
		return false;
	}
	public Set<Filme> Utils3processa(String[] filmes) {
		// retornar um conjunto com objetos do tipo Filme
		// cada objeto Filme representa um elemento do array
		// PS: observe que podem existir filmes com nome e ano iguais, porém, o id é
		// diferente. Atribua o id, titulo e ano dos filmes
		Set<Filme> Conjunto = new HashSet();
		for (int i = 0; i < filmes.length; i++) {
			String l = filmes[i];
			// System.out.println(l);
			String[] aux = l.split("#");
			Filme f = new Filme(0001);
			int idx = Integer.parseInt(aux[0]);
			f.setId(idx);
			f.setTitulo(aux[1]);
			int anox = Integer.parseInt(aux[2]);
			f.setAno(anox);
			Conjunto.add(f);
		}

		return Conjunto;

	}

}
