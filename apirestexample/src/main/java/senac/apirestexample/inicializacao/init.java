package senac.apirestexample.inicializacao;

import org.hibernate.bytecode.internal.bytebuddy.PrivateAccessorException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import senac.apirestexample.entity.Aluno;
import senac.apirestexample.service.AlunoService;

public class init implements ApplicationListener<ContextRefreshedEvent>{

	
	@Autowired
	private AlunoService alunoService;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		
		Aluno aluno1 = new Aluno();
		aluno1.setEmail("lucas@gmail.com");
		aluno1.setNome("Lucas");
		aluno1.setSobreNome("Silva");
		alunoService.salvar(aluno1);
		
		
	}

}
