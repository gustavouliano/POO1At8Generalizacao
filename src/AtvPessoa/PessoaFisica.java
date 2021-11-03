package AtvPessoa;

public class PessoaFisica extends Pessoa {
	
	private int cpf;
	private String estadoCivil;
	
	public PessoaFisica(String nome, String endereco, int cpf, String estadoCivil) {
		super(nome, endereco);
		setCpf(cpf);
		setEstadoCivil(estadoCivil);
	}
	
	public PessoaFisica() {
		
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		if (cpf > 0)
			this.cpf = cpf;
	}
	
	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		if (estadoCivil.length() > 0)
			this.estadoCivil = estadoCivil;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PessoaFisica [cpf=");
		builder.append(cpf);
		builder.append(", estadoCivil=");
		builder.append(estadoCivil);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}