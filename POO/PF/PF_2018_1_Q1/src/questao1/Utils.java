package questao1;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;

public class Utils 
{
	public static boolean existe(List x, Produto y)
	{
		if(x.contains(y))
		{
			return true;
		}
		return false;
	}
		/*Iterator it = x.iterator();
		for(int i = 0; it.hasNext(); i++)
		{
			//System.out.println(it.next());
			if (it.next() instanceof Produto)
			{
				if (x.get(i).equals(y))
				{
					return true;
				}
				else
				{
					System.out.println(it.next());
					return false;
				}
			}
			else
			{
				return false;
			}
		}
		return false;
	}*/
	
	/*public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List p = new ArrayList();
		p.add("Mercurial");
		p.add(8.5);
		Produto produto1 = new Produto("0001");
		p.add(produto1);
		p.add(9);
		
		
	
		Produto produto2 = new Produto("0001");
		//System.out.println(((Produto)p.get(2)).getId());
		//System.out.println(existe(p, produto2));
		

		
	}*/

}
