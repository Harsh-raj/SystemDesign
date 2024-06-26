package LLD.ChainofCommand.Log;

public abstract class Logger {

    public static int INFO=1;
    public static int DEBUG=2;
    public static int ERROR=3;

    Logger nextLog;

    public Logger(Logger nextLog) {
        this.nextLog = nextLog;
    }

    public void log(int loglevel, String message){
        if(nextLog!=null){
            nextLog.log(loglevel, message);
        }else{
            System.out.println("Logging: UNKNOWN CASE");
        }
    }
}
