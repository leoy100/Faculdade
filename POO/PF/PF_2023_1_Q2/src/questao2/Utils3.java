package questao2;

import java.util.HashSet;
import java.util.Set;

public class Utils3 
{
	public static Set <Filme> processa(String [] filmes)
	{
		//retornar um conjunto com objetos do tipo Filme
		//cada objeto Filme representa um elemento do array 
		//PS: observe que podem existir filmes com nome e ano iguais, porém, o id é 
		//diferente. Atribua o id, titulo e ano dos filmes
		Set <Filme> conjunto = new HashSet();
		for (int i = 0; i < filmes.length; i++)
		{
			if (filmes[i] != null)
			{
				String l = filmes[i];
				//System.out.println(l);
				String [] aux = l.split("#");
				int idx = Integer.parseInt(aux[0]);
				Filme f = new Filme(idx);
				f.setTitulo(aux[1]);
				int anox = Integer.parseInt(aux[2]);
				f.setAno(anox);
				conjunto.add(f);
			}
		}
		return conjunto;
		
	}
}
