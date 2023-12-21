package questao1;

public abstract class Acessorio {
	private String marca;
	private double preco;

	public Acessorio(String marca, double preco)
	{
		this.marca = marca;
		this.preco = preco;
		this.preco += calcularImposto();
	}
	
	public abstract double calcularImposto();
	
	public String getMarca()
	{
		return marca;
	}
	public void setMarca(String marca)
	{
		this.marca = marca;
	}
	public double getPreco() 
	{
		return preco;
	}
	public void setPreco(double preco) 
	{
		this.preco = preco;
	}
}
