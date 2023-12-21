package questao2;

public class Media {
	public static double calcula (String numeros) {
		String [] numeros1;
		numeros1 = numeros.split("#");
		double soma = 0; 
		double numeroInt;
		for(int i = 0; i < numeros1.length; i++) {
			numeroInt = Double.parseDouble(numeros1[i]);
			soma += numeroInt;
		}
		double media = soma/numeros1.length;
		System.out.println(media);
		return media;
	}
	
	public static void main(String[]args) {
		calcula("12#15#11#3");
	}
}
