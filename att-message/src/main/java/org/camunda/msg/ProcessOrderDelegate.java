package org.camunda.msg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class ProcessOrderDelegate implements JavaDelegate {

	 static Logger LOGGER = LoggerFactory.getLogger(ProcessOrderDelegate.class);

	public void execute(DelegateExecution execution) throws Exception {

		LOGGER.info("\n\n\n ...Throwing/ RAISING Custom BPMN EXCEPTION ........................");
		throw new BpmnError("My BPMN Error");
//	    LOGGER.debug("Delegate: Validate Address Call Processing ...."+execution.getVariable("response"));
//	    LOGGER.debug("Delegate: Validate Address Call Processing ...."+execution.getVariableNames());
//	    LOGGER.debug("Delegate: Validate Address Call Processing ...."+execution.getBpmnModelElementInstance());
//	    LOGGER.debug("Delegate: Validate Address Call Processing ...."+execution.getBpmnModelInstance());
//	    LOGGER.debug("Delegate: Validate Address Call Processing ...."+execution.getProcessEngineServices().getTaskService());
//	    LOGGER.debug("Delegate: Validate Address Call Processing ...."+execution.getProcessEngineServices());

	}
}
