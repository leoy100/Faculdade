package sobrecargadeconstrutores;

public class TesteBanco {
	public static void main(String[]args) {
		Cliente c1 = new Cliente("12312312312");
		Cliente c2 = new Cliente();
		System.out.println(c1.getCpf());
		System.out.println(c2.getCpf());
		
		Cliente c3 = new Cliente("Mendonça","12312312312");
		Cliente c4 = new Cliente("Manuela", "12312312312", "Professora");
		System.out.println(c3.getCpf());
		System.out.println(c4.getCpf());
		
		ClientePF c5 = new ClientePF("Mendonça","3759254199-34","Jogador");
		System.out.println(c5);
	}
}
