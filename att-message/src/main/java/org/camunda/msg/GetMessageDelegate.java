package org.camunda.msg;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GetMessageDelegate implements JavaDelegate {
	static Logger LOGGER = LoggerFactory.getLogger(GetMessageDelegate.class);
	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info("\n \n Received Message/ Instantiation of Message done by Message Id ");

	}
}

