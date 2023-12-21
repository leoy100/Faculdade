package aula4parte3;

public abstract class TesteBanco {
		/*Cliente c1 = new Cliente("12312312312");
		Cliente c2 = new Cliente();
		System.out.println(c1.getCpf());
		System.out.println(c2.getCpf()+"\n\n\n");
		
		Cliente c3 = new Cliente("Irineu","12312312312");
		Conta c = new Conta(444, c3);
		System.out.println(c.getNumero());
		System.out.println(c.getSaldo());
		System.out.println(c.getTitular());
		System.out.println(c.getTitular().getCpf());
		System.out.println(c.getTitular().getNome());*/
	public TesteBanco() {	
	}
	private abstract int multiplica (double n1, int n2);
	private abstract int multiplica (double n1, int n2)
	private static final double VALOR=10;
	private double multiplica(double n1, double n2) {
		return n1*n2;
	}
	protected abstract double soma(double n1, double n2);
}
