package split;

public class Exemplo {
	public static void main(String[] args) {
		String x = "Minha&casa";
		String []array = x.split("&");
		System.out.println(array[0]);
	}
}
	
