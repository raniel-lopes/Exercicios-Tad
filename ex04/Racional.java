package ex04;

import java.util.ArrayList;

public class Racional implements IRacional{
	
	private int numerador;
	private int denominador;
	
	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		if (denominador > 0) {
		this.denominador = denominador;
	} else {
		throw new IllegalArgumentException("O denominador dever ser maior que 0.");
	}
}
	public Racional(int num, int den) {
		if(num >= 0 && den >= 1) {
			this.numerador = num;
			this.denominador = den;
		} else {
			throw new IllegalArgumentException("Numerador ou denominador inválido.");
		}
	}
	
	@Override
	public Racional criaRac(int num, int den) {
		return new Racional(num, den);
	}

	@Override
	public Racional somaRac(ArrayList<Racional> racV) {
		//Lógica de Soma
		return null;
	}

	@Override
	public Racional multiplicaRac(ArrayList<Racional> racV) {
		//Lógica de multiplicação
		return null;
	}

	@Override
	public boolean comparaRac(Racional rac1, Racional rac2) {
		// Lógica de comparação
		return false;
	}

	@Override
	public String imprimeRac(Racional n) {
		// Lógica de impressão
		return null;
	}
	
}
