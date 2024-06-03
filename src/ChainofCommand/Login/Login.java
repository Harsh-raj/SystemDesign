package ChainofCommand.Login;

public abstract class Login {

    public static int STUDENT=1;
    public static int TEACHER=2;
    public static int ADMIN=3;

    Login nextLogin;

    public Login(Login login){
        this.nextLogin = login;
    }

    public void log(int logLevel, String passkey){
        if(nextLogin != null)
            nextLogin.log(logLevel, passkey);
        else
            System.out.println("ACCESS DENIED!");

    }
}
