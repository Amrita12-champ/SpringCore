package com.amrita.Entity;

// This import is required to use the @Autowired annotation
import org.springframework.beans.factory.annotation.Autowired;

public class Car {

    @Autowired
    private Engine engine;

    public void SelfStart(){

        System.out.println("Engine Object Instance: " + engine);

        if(engine != null){
            engine.start();
        } else {
            System.out.println("Issue in start engine: Engine is null");
        }
    }
}