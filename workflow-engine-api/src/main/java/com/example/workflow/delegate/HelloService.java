package com.example.workflow.delegate;

import org.camunda.bpm.engine.ProcessEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author davidjmartin
 */
@Component
public class HelloService {

    @Autowired
    private ProcessEngine processEngine;

    public void sayHelloWorld() {
        processEngine.getRuntimeService().startProcessInstanceByKey("hello-world");
    }

}

