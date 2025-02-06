package com.shrayansh.behavioural.chainOfResponsibility;

public class InfoLogProcessor extends LogProcessor{
    public InfoLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void log(LogLevel level,String message){
        if(level == LogLevel.INFO){
            System.out.println("Info Log Processor: "+ message);
        }else{
            super.log(level,message);
        }
    }
}
