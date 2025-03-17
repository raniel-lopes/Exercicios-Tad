package ex09;

public class Pedido implements IPedido {
	
	public String nomeCliente;
	public String[] itens;
	public int[] quantidades;
	public double valorTotal;
	
	public Pedido () {
		
	}
	
	@Override
	public void criarPedido(String nomeCliente, String[] itens, int[] quantidades, double valorTotal) {
		this.nomeCliente = nomeCliente;
		this.itens = itens;
		
	}
	
}
