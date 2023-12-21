package questao1;

public abstract class Livro {
	private String nome;
	private String autor;
	private int ano;
	private String ISBN;
	
	public Livro(int ano) 
	{
		this.ano = ano;
	}
	
	public void setNome(String Nome)
	{
		this.nome = Nome;
	}
	public String getNome() {
		return nome;
	}
	
	public void setAutor(String Autor)
	{
		this.autor = Autor;
	}
	public String getAutor()
	{
		return autor;
	}
	
	public void setAno(int Ano)
	{
		this.ano = Ano;
	}
	public int getAno()
	{
		return ano;
	}
	
	public void setISBN(String ISBN)
	{
		this.ISBN = ISBN;
	}
	public String getISBN()
	{
		return ISBN;
	}
	
	public boolean equals (Object o)
	{
		if (o instanceof Livro)
		{
			//Livro u = (Livro) o;
			String x1 = this.getISBN();
			System.out.println("Teste equals");
			System.out.println(x1);
			String x2 = ((Livro) o).getISBN();
			System.out.println(x2);
			if (x1 == x2)
				
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		return false;
	}
	
	public String toString ()
	{
		return "[Nome: " + getNome() + " |  Ano: " + getAno();
	}
	
	
}
