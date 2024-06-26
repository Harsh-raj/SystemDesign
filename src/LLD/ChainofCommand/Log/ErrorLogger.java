package LLD.ChainofCommand.Log;

public class ErrorLogger extends Logger{
    public ErrorLogger(Logger nextLog) {
        super(nextLog);
    }

    public void log(int logInfo, String message){
        if(logInfo == ERROR){
            System.out.println("Logging: ERROR "+message);
        }else{
            super.log(logInfo, message);
        }
    }
}
