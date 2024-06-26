package LLD.ChainofCommand.Log;

public class DebugLogger extends Logger{
    public DebugLogger(Logger nextLog) {
        super(nextLog);
    }

    public void log(int logInfo, String message){
        if(logInfo==DEBUG){
            System.out.println("Logging: DEBUG "+message);
        }else{
            super.log(logInfo, message);
        }
    }
}
