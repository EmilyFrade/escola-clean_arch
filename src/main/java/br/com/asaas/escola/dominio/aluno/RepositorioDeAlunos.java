package br.com.asaas.escola.dominio.aluno;

import java.util.List;

public interface RepositorioDeAlunos {
	void matricular(Aluno aluno);
	
	Aluno buscarPorCPF(CPF cpf);
	
	List<Aluno> listaTodosAlunosMatriculados();
}
 