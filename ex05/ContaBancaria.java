package ex05;

public class ContaBancaria implements IContaBancaria {
	
	private double saldo;
	private String titular;
	
	public ContaBancaria(String titular, double saldoInicial) {
		this.titular = titular;
		this.saldo = saldoInicial;
	}
	
	
	
	public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	public String getTitular() {
		return titular;
	}



	public void setTitular(String titular) {
		this.titular = titular;
	}



	@Override
	public double visualizarSaldo() {
		return 0;
	}

	@Override
	public void depositar(double valor) {
		//
	}

	@Override
	public void sacar(double valor) {
		// 		
	}

	@Override
	public void atualizarSaldo(double novoSaldo) {
		// 
	}

	@Override
	public void exibirInformacoes() {
		// 
	}
	
}
