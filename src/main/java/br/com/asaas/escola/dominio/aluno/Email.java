package br.com.asaas.escola.dominio.aluno;

public class Email {
	private String endereco;
	
	public Email(String endereco) {
	    if (endereco == null || !endereco.matches("[a-z0-9.]+@[a-z0-9]+\\.[a-z]+(\\.[a-z]+)?")) {
	        throw new IllegalArgumentException("Email inválido!");
	    }
	    
	    this.endereco = endereco;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
