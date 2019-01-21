package treinamento_camunda.treinamento_camunda;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component("registroAprovacao")
public class RegistraAprovacaoDelegate implements JavaDelegate {
	
	private final Logger LOGGER = Logger.getLogger(RegistraAprovacaoDelegate.class.getName());

	@Override
	public void execute(DelegateExecution execution) throws Exception {		
		LOGGER.info("O valor de " + execution.getVariable("controle") + " foi automaticamente aprovado.");
	}
	
}
