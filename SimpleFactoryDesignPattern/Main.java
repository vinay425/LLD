package SimpleFactoryDesignPattern;

import java.util.*;

import SimpleFactoryDesignPattern.logger.LogLevel;
import SimpleFactoryDesignPattern.logger.Logger;
import SimpleFactoryDesignPattern.logger.LoggerFactory;

public class Main {
    public static void main(String[] args) {

        Logger infoLogger = LoggerFactory.createLogger(LogLevel.INFO);
        Logger errorLogger = LoggerFactory.createLogger(LogLevel.ERROR);
        Logger debugLogger = LoggerFactory.createLogger(LogLevel.DEBUG);

        infoLogger.displayLog("Displayed log is for info");
        errorLogger.displayLog("Displayed log is for error");
        debugLogger.displayLog("Displayed log is for debug");

    }

}
