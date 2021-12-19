package com.example.workflow.delegate;

import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

/**
 * @author davidjmartin
 */
@Component
@Slf4j
public class HelloWorldDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        log.info("--- Hello World! An item shipped to a customer ---");
    }

}
