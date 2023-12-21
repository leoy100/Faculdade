package sobrecargadeconstrutores;

public class ClientePF extends Cliente{
	public ClientePF(String nome, String cpf, String profissao)
	{
		super(nome,cpf);
	}
	
	public ClientePF(String nome, String cpf)
	{
		this(nome,cpf,null);
	}

}
