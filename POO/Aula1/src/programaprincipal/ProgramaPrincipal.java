package programaprincipal;

public class ProgramaPrincipal {
	public static void main(String [] args) {
		
		Gato gato1 = new Gato();
		gato1.nome = "Felix";
		Gato gato2 = new Gato();
		gato2.nome = "Tomate";
		System.out.println(gato2.nome);
		gato2.miar();
		}


}
