package equals;

public class ProgramaPrincipal {
	public static void main(String[]args) {
		Pessoa p1 = new Pessoa("Leonardo", "10");
		Pessoa p2 = new Pessoa("Leonardo", "10");
		
		System.out.println(p1);
		System.out.println(p1.equals(p2));
		System.out.println(p1.getIdade());
		String x = "Minha casa";
		char [] y = x.toCharArray();
		int i = 0;
		System.out.println(y.length);
		while(i < y.length) {
			System.out.println(y[i]);
			i++;
		}
	}

}
