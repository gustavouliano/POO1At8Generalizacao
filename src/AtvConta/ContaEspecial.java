package AtvConta;

public class ContaEspecial extends Conta {
	
	private int diasSemJuros;
	private double limite;
	
	public ContaEspecial(String banco, int agencia, int numeroconta, double saldo, int diasSemJuros, double limite) {
		super(banco, agencia, numeroconta, saldo);
		setDiasSemJuros(diasSemJuros);
		setLimite(limite);
	}
	
	public ContaEspecial() {
		
	}

	public int getDiasSemJuros() {
		return diasSemJuros;
	}

	public void setDiasSemJuros(int diasSemJuros) {
		this.diasSemJuros = diasSemJuros;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public boolean saque(double valor) {
		if ((valor > 0) && (valor <= (getSaldo() + getLimite()))) {
			setSaldo(getSaldo() - valor);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaEspecial [diasSemJuros=");
		builder.append(diasSemJuros);
		builder.append(", limite=");
		builder.append(limite);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
