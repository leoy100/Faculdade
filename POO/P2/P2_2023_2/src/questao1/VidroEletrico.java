package questao1;

public class VidroEletrico extends Acessorio
{
	public VidroEletrico(String marca, double preco)
	{
		super(marca, preco);
		
	}
	
	public double calcularImposto()
	{
		double imposto = getPreco()*0.2;
		//setPreco(imposto + getPreco());
		return imposto;
	}
}
