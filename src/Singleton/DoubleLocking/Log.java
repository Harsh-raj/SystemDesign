package Singleton.DoubleLocking;

public class Log {
    private static Log log;

    private Log(){

    }

    public static Log getInstance(){
        if(log == null){
            synchronized (Log.class){
                if(log==null) {
                    log = new Log();
                }
            }
        }
        return log;
    }
}
