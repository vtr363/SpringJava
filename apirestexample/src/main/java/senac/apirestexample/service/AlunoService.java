package senac.apirestexample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import senac.apirestexample.entity.Aluno;
import senac.apirestexample.repository.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired
	AlunoRepository repo;
	public Aluno salvar(Aluno aluno) {
		return repo.save(aluno);
	}
	
			
	@Autowired
	public List<Aluno> buscaTodosAlunos() {
		return repo.findAll();
	}
}
