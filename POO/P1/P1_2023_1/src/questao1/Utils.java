package questao1;

import java.util.ArrayList;

public class Utils {
	public static boolean existe(ArrayList x, Biscoito y) {
		int contador = 1;
		for (int i=0; i<x.size(); i++) {
			if (x.contains(y.getId())) {
				contador ++;
			}
			else {
				continue;
			}
		}
		if (contador>=1){
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[]args) {
		Biscoito ne = new Biscoito("ne");
		Biscoito negresco = new Biscoito("negresco");
		ArrayList<Object> a = new ArrayList<Object>();
		a.add(negresco);
		a.add(negresco);
		System.out.println(existe(a, negresco));
	}
}