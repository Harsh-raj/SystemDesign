package ChainofCommand.Log;

public class InfoLogger extends Logger{
    public InfoLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void log(int logLevel, String message) {
        if(logLevel==INFO){
            System.out.println("Logging: INFO "+message);
        }else{
            super.log(logLevel, message);
        }
    }
}
