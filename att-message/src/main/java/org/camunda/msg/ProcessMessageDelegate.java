package org.camunda.msg;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProcessMessageDelegate implements JavaDelegate {

	static Logger LOGGER = LoggerFactory.getLogger(ProcessOrderDelegate.class);

	public void execute(DelegateExecution execution) throws Exception {

		LOGGER.info("\n \n Processing Messages/ Instatiating a Message Process  ");
		RuntimeService runtimeService = execution.getProcessEngineServices().getRuntimeService();
	    runtimeService.startProcessInstanceByMessage("myMessage_Instantiation_Msg002");

	}
}

