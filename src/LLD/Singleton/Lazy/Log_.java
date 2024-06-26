package LLD.Singleton.Lazy;

public class Log_ {
    private static Log_ log;
    private Log_(){

    }

    public static Log_ getInstance(){
        if(log==null) {
            log = new Log_();
        }
        return log;
    }
}
