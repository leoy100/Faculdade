package questao1;

public class LivroDeBiblioteca extends Livro
{
	private boolean alugado;
	
	public LivroDeBiblioteca(int ano, boolean alug)
	{
		super(ano);
		this.alugado = alug;
	}
	
	public void setAlugado(boolean alugado)
	{
		this.alugado = alugado;
	}
	public boolean getAlugado()
	{
		return alugado;
	}
	
	public String toString ()
	{
		if (getAlugado() == true)
		{
			return super.toString() + " | Está alugado]";
		}
		else
		{
			return super.toString() + " | Não está alugado]";
		}
		
	}
	

}
