package questao3;

public class TextoCurtoException extends Exception
{
	public TextoCurtoException()
	{
	}
	
	public TextoCurtoException(int c)
	{
		super("Texto inserido com " + c + " caracteres.");
	}
}
