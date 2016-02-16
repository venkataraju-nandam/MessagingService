package org.camunda.msg;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProcessOrderDelegateException implements JavaDelegate {

	 Logger LOGGER = LoggerFactory.getLogger(ProcessOrderDelegateException.class);

	public void execute(DelegateExecution execution) throws Exception {

		LOGGER.info("\n\n\n BPMN Exception Caught  :  ....ALTERNATIVE FLOW FOR ERROR IN PROCESS (Handle Error).........");

	}
}
