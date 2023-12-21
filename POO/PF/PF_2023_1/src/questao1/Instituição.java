package questao1;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


public class Instituição 
{
	private String nome;
	private ArrayList <Livro> listaDeLivros;
	
	public Instituição ()
	{
		ArrayList <Livro> lista = new ArrayList();
		this.listaDeLivros = lista;
	}
	
	public void setNome(String n)
	{
		this.nome = n;
	}
	public String getNome()
	{
		return nome;
	}
	
	/*public void setListaDeLivros(ArrayList lista)
	{
		this.listaDeLivros = lista;
	}
	public ArrayList getListaDeLivros()
	{
		return listaDeLivros;
	}*/
	
	public void inserirLivro(Livro livro)
	{
		(this.listaDeLivros).add(livro);
		//lista.add(livro);
		//System.out.println(this.listaDeLivros);
		//lista.add(livro);
		//this.listaDeLivros = lista;
	}
	public ArrayList <Livro> getListaDeLivros()
	{
		return listaDeLivros;
	}
	
	
	//5|b
	public void imprimeRelatorioGeral(List <Livro> listaDeLivros)
	{
		Iterator <Livro> it = listaDeLivros.iterator();
		for (int i = 0; it.hasNext(); i++)
		{
			Livro x = it.next();
			if (x instanceof LivroDeBiblioteca)
			{
				System.out.println(x);
			}
			
			if (x instanceof LivroDeLivraria)
			{
				System.out.println(x);
			}
		}
	}
}
