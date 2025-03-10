package ex04;

import java.util.ArrayList;

public interface IRacional {
	Racional criaRac(int num, int den);
	Racional somaRac(ArrayList<Racional> racV);
	Racional multiplicaRac(ArrayList<Racional> racV);
	boolean comparaRac(Racional rac1, Racional rac2);	
	String imprimeRac(Racional n);
}
