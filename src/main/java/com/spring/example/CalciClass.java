package com.spring.example;

import com.spring.example.service.ServiceMathInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CalciClass  {

    @Autowired
    @Qualifier("addService")
    private ServiceMathInterface additionService;

    @Autowired @Qualifier("subtractionService")
    private ServiceMathInterface subtractionService;


    @Autowired @Qualifier("multiplicationService")
    private ServiceMathInterface multiplicationService;

    @Autowired @Qualifier("divisionService")
    private ServiceMathInterface divisionService;


    public int compute(String op, int x, int y) {
        if (op.equals("add")) {
            return this.additionService.operate(x, y);
        } else if (op.equals("sub")) {
            return this.subtractionService.operate(x, y);
        } else if(op.equals("multiply")) {
            return this.multiplicationService.operate(x, y);
        }
        else if(op.equals("divide")) {
            return this.divisionService.operate(x, y);
        }
        else
        {
            throw new RuntimeException(op + " not supported.");
        }
    }
}
