package ex05;

public interface IContaBancaria {
	
	double visualizarSaldo();
	
	void depositar(double valor);
	
	void sacar(double valor);
	
	void atualizarSaldo(double novoSaldo);
	
	void exibirInformacoes();
}
