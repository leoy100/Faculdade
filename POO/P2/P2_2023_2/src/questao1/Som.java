package questao1;

public class Som extends Acessorio
{
	public Som(String marca, double preco)
	{
		super(marca, preco);
		
	}
	
	public double calcularImposto()
	{
		double imposto = getPreco()*0.3;
		//setPreco(imposto + getPreco());
		//System.out.println(getPreco());
		return imposto;
	}
}