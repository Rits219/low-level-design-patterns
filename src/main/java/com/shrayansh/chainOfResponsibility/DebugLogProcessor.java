package com.shrayansh.chainOfResponsibility;

public class DebugLogProcessor extends LogProcessor {
    public DebugLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void log(LogLevel level, String message) {
        if (level == LogLevel.DEBUG) {
            System.out.println("Debug Log Processor: " + message);
        } else {
            super.log(level, message);
        }
    }
}
