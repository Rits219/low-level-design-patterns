package com.shrayansh.chainOfResponsibility;

public abstract class LogProcessor {
    LogProcessor nextLogProcessor;

    public LogProcessor(LogProcessor nextLogProcessor) {
        this.nextLogProcessor = nextLogProcessor;
    }

    public void log(LogLevel level, String message) {
        if (nextLogProcessor != null) {
            nextLogProcessor.log(level, message);
        }
    }
}
