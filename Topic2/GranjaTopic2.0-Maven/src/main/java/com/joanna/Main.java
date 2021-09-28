package com.joanna;

import com.joanna.Objects.*;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Main {
    private final static Logger log = Logger.getLogger(Main.class);
    public static void main(String[] args) {
        BasicConfigurator.configure();
        log.warn("un warning");
        log.error("un error");

        Farm farm = Farm.getInstance();
    }

}
