package ex12;

public class HistoricoCompras implements IHistoricoCompras {
	public String data;
	public String[] itens;
	public double valorTotal;
	
	 public HistoricoCompras(String data, String[] itens, double valorTotal) {
	        this.data = data;
	        this.itens = itens;
	        this.valorTotal = valorTotal;
	    }
	@Override
	public void representarHistorico() {
		// TODO Auto-generated method stub
		
	}
}
