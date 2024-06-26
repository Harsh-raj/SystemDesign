package LLD.ChainofCommand.Login;

public class AdminLogin extends Login{

    public AdminLogin(Login login) {
        super(login);
    }

    @Override
    public void log(int logLevel, String passkey) {
        if (logLevel == ADMIN)
            System.out.println("Request successful for Admin");
        else {
            System.out.println("Request denied for Admin");
            super.log(logLevel, passkey);
        }
    }
}
