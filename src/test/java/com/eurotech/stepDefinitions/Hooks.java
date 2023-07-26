package com.eurotech.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before(order = 0)
    public void setup(){
        System.out.println("This is coming from BEFORE method");
    }
    @After(order = 0)
    public void tearDown(){
        System.out.println("This is coming from AFTER method");
    }

    @Before(value = "@dataBase",order = 1)
    public void openDateBase(){
        System.out.println("DataBase is opening");
    }

    @After(value = "@dataBase",order = 1)
    public void closeDateBase(){
        System.out.println("DataBase is closing");
    }
}
