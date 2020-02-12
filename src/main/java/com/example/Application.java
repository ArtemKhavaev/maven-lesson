package com.example;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Application {

    private static final Logger LOGGER = LogManager.getLogger();
    public static void main(String[] args){
        Data data = new Data("ss", "aaa");
        System.out.println(data);
        LOGGER.error("Error");
        LOGGER.error("Error");
    }

}
