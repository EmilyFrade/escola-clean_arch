package br.com.asaas.escola.dominio.aluno;

public class CPF {
	private String cpf;
	
	public CPF(String cpf) {
		if (cpf == null || !cpf.matches("([0-9]{2}[\\.]?[0-9]{3}[\\.]?[0-9]{3}[\\/]?[0-9]{4}[-]?[0-9]{2})|([0-9]{3}[\\.]?[0-9]{3}[\\.]?[0-9]{3}[-]?[0-9]{2})")) {
			throw new IllegalArgumentException("CPF inválido!");
		}
		
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
