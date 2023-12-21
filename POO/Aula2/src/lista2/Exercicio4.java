package lista2;
/*Imprima	a	soma	de	todos	os	números	de	1 a	50.000	menos	os	
números	entre	100	e	137*/
public class Exercicio4 {
	public static void main (String[]args) {
		int n = 0;
		long soma = 0L;
		while (n<=50000) {
			soma =  soma + n;
			n+=1;
		}
		System.out.println("A soma é: "+soma);
	}
}