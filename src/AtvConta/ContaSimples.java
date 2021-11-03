package AtvConta;

public class ContaSimples extends Conta {
	
	private double saldoPoupanca;
	
	
	public ContaSimples(String banco, int agencia, int numeroconta, double saldo) {
		super(banco, agencia, numeroconta, saldo);
	}
	
	public ContaSimples() {
		
	}

	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}

	public void setSaldoPoupanca(double saldoPoupanca) {
		this.saldoPoupanca = saldoPoupanca;
	}
	
	public boolean depositoPoupanca(double valor) {
		if (valor > 0) {
			setSaldoPoupanca(getSaldoPoupanca() + valor);
			return true;
		}
		return false;
	}
	
	public boolean saquePoupanca(double valor) {
		if (valor <= getSaldoPoupanca()) {
			setSaldoPoupanca(getSaldoPoupanca() - valor);
			return true;
		}
		return false;
	}
	
	public double total() {
		return getSaldo() + getSaldoPoupanca();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaSimples [saldoPoupanca=");
		builder.append(saldoPoupanca);
		builder.append(", total()=");
		builder.append(total());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}