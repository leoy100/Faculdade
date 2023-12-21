package questao3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Utilidades 
{
	public static Set <String>getPalavroes() 
	{
		Set <String> p = new HashSet <String>();
		p.add("bonita");
		p.add("feia");
		p.add("limpa");
		p.add("suja");	
		return p;
	}

	
	public static void main(String[]args) 
	{
		Scanner teclado = new Scanner(System.in); 
		String texto = teclado.nextLine();
		teclado.close();
		try {
			Utils.verifica(texto);
		}
		catch (TextoCurtoException erro) {
			System.out.println(erro);
		}
		Utils.moderar(texto);
	}
}
