package questao1;

public class LivroDeLivraria extends Livro
{
	private boolean vendido;
	
	public LivroDeLivraria(int ano, boolean vend)
	{
		super(ano);
		this.vendido = vend;
	}
	
	public void setVendido(boolean vendido)
	{
		this.vendido = vendido;
	}
	public boolean getVendido()
	{
		return vendido;
	}
	
	
	public String toString ()
	{
		if (getVendido() == true)
		{
			return super.toString() + " | Está vendido]";
		}
		else
		{
			return super.toString() + " | Não está vendido]";
		}
	}
}
