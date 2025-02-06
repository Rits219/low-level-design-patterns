package com.shrayansh.behavioural.chainOfResponsibility;

public class ErrorLogProcessor extends LogProcessor{
    public ErrorLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void log(LogLevel level,String message){
        if(level == LogLevel.ERROR){
            System.out.println("Error Log Processor: "+ message);
        }else{
            super.log(level,message);
        }
    }
}
