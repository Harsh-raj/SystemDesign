package LLD.Singleton.Eager;

public class Log {

    private static Log log = new Log();

    private Log(){

    }

    public static Log getInstance(){
        return log;
    }
}
