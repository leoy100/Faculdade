package questao4;

public class NumeroNegativoException extends Exception{
	public NumeroNegativoException()
	{
		
	}
	public NumeroNegativoException(int numero)
	{
		super("Número [" +  numero + "] é negativo, insira apenas números positivos.");
	}
}
