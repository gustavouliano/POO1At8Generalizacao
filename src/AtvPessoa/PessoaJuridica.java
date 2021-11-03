package AtvPessoa;

public class PessoaJuridica extends Pessoa {

	private int cnpj;
	private String tipoEmpresa;
	
	public PessoaJuridica(String nome, String endereco, int cnpj, String tipoEmpresa) {
		super(nome, endereco);
		setCnpj(cnpj);
		setTipoEmpresa(tipoEmpresa);
	}
	
	public PessoaJuridica() {
		
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		if (cnpj > 0)
			this.cnpj = cnpj;
	}

	public String getTipoEmpresa() {
		return tipoEmpresa;
	}

	public void setTipoEmpresa(String tipoEmpresa) {
		if (tipoEmpresa.length() > 0)
			this.tipoEmpresa = tipoEmpresa;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PessoaJuridica [cnpj=");
		builder.append(cnpj);
		builder.append(", tipoEmpresa=");
		builder.append(tipoEmpresa);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
