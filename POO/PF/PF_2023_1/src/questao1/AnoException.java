package questao1;

public class AnoException extends Exception
{
	public AnoException() {
		
	}
	
	public AnoException(String mensagem)
	{
		super(mensagem);
	}
	/*public AnoException(int ano) 
	{
		this.ano = ano;
	}
	
	public String toString()
	{
		return "Ano inserido: " + "Ano deve ser menor que 2025.";
	}*/
}
