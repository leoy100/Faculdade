package lista2;

public class Impares1_10000{
	public static void main(String [] args) {
		long soma = 0L;		
		for (int i=0; i < 10000;) {
			soma += i;
			i += 2;
		}
		System.out.println(soma);
	}	
}
