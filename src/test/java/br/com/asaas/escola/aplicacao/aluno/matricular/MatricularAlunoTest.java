package br.com.asaas.escola.aplicacao.aluno.matricular;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.asaas.escola.dominio.aluno.Aluno;
import br.com.asaas.escola.dominio.aluno.CPF;
import br.com.asaas.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

class MatricularAlunoTest {

	@Test
    void alunoDeveriaSerPersistido() {
		RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();
	    MatricularAluno useCase = new MatricularAluno(repositorio);

	    MatricularAlunoDto dados  = new MatricularAlunoDto("Fulano", "12345678900", "fulano@email.com");
	    useCase.matricular(dados);

	    Aluno encontrado = repositorio.buscarPorCPF(new CPF("12345678900"));

	    assertEquals("Fulano", encontrado.getNome());
	    assertEquals("12345678900", encontrado.getCpf());
	    assertEquals("fulano@email.com", encontrado.getEmail());
    }

}
