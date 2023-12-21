package questao1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Principal {

	//1 | D2
	public static Map transformaListEmMap(List k)
	{
		Map <String, Produto> m = new HashMap();
		Iterator it = k.iterator();
		for(int i = 0; it.hasNext(); i++)
		{
			
			if(it.next() instanceof Produto)
			{
				Produto px = (Produto)k.get(i);
				m.put(px.getId(), px);
			}
			else
			{
				continue;
			}
		}
		return m;
	}
	
	//1 | D3
	public static Produto[] transformaMap(Map<String, Produto> m)
	{
		System.out.println("Começa transformaMap");
		Iterator it = m.keySet().iterator();
		int n = m.size();
		Produto [] array_produto = new Produto[n];
		//ArrayList <Produto> a = new ArrayList();
		for(int i = 0; it.hasNext(); i++) 
		{
			String chave = (String)it.next();
			Produto p = (Produto)m.get(chave);
			//a.add(p);
			array_produto[i]= p;
		}
		//Produto [n] array_produto;
		return array_produto; 
	}
		
	
	
	
	public static void main(String[] args) 
	{
		List p = new ArrayList();
		p.add("Mercurial");
		p.add(8.5);
		Produto produto1 = new Produto("0002");
		p.add(produto1);
		p.add(9);
		//Produto produto2 = new Produto("0001");
		//System.out.println(((Produto)p.get(2)).getId());
		//System.out.println(existe(p, produto2));
		
		
		System.out.print("Insira o ID do produto: ");
		Scanner teclado = new Scanner(System.in);
		String id = teclado.nextLine();
		teclado.close();
		Produto p1 = new Produto(id);
		
		//1 | D
		Produto produto2 = new Produto("0001");
		p.add(produto2);
		p.add(p1);
		/*if(Utils.existe(p, produto2))
		{
			for(int i = 0; i < p.size(); i++) {
				if (p.get(i).equals(produto2))
				{
					 System.out.println(p.get(i));
				}
				else
				{
					continue;
				}
			}
		}*/
		
		
		
		//System.out.println(produto2);
		System.out.println(transformaListEmMap(p));
		Map mx = transformaListEmMap(p);
		Produto[] array = transformaMap(mx);
		System.out.println(array[1]);
	}

}