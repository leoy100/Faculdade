package questao1;

public class Produto {
	private String id;
	private String cor;
	private double preco;
	
	public Produto ()
	{
	}
	
	public Produto (String id)
	{
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	//1 | b
	public boolean equals (Object o)
	{
		if (o instanceof Produto)
		{
			String id1 = this.id;
			System.out.println(id1);
			String ido = ((Produto)o).getId();
			System.out.println(ido);
			if (id1 == ido)
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
	
	//1 | B2
	public String toString()
	{
		return "ID: " + this.getId() + " | Cor: " + this.getCor() + " | Preço: " + this.getPreco();
	}
	

}
