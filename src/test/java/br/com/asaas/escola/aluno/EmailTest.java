package br.com.asaas.escola.aluno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.asaas.escola.dominio.aluno.Email;

class EmailTest {

	@Test
	void naoDeveriaCriarEmailsComEnderecosInvalidos() {
		assertThrows(IllegalArgumentException.class, () -> new Email(null));
		assertThrows(IllegalArgumentException.class, () -> new Email(""));
		assertThrows(IllegalArgumentException.class, () -> new Email("emailinvalido"));
	}
	
	@Test
    void deveriaPermitirCriarEmailsComEnderecoValido() {
        String endereco = "enderecovalido@gmail.com.br";
        Email email = new Email(endereco);
        assertEquals(endereco, email.getEndereco());
    }
}
