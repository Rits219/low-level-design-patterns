package com.shrayansh.behavioural.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logProcessor.log(LogLevel.INFO, "This is an info message");
        logProcessor.log(LogLevel.DEBUG, "This is a debug message");
        logProcessor.log(LogLevel.ERROR, "This is an error message");
    }
}
