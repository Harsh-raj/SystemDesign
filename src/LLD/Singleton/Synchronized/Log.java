package LLD.Singleton.Synchronized;

public class Log {
    private static Log log;

    private Log(){

    }

    synchronized public static Log getInstance(){
        if(log == null){
            log = new Log();
        }
        return log;
    }
}
