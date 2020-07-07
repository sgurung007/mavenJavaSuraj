package org.example;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyLogger {
    static Logger logger = LogManager.getLogger(MyLogger.class);

    public static void main(String[] args) {
        System.out.println("\nHello word\n");
        logger.info("this is information message");
        logger.error("this is error message");
        logger.warn("this is warning message");
        logger.fatal("this is fatal message");
        System.out.println("\ncompleted");

    }
}
