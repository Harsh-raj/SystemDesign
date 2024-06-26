package LLD.ChainofCommand.Login;

public class StudentLogin extends Login{
    public StudentLogin(Login login) {
        super(login);
    }

    @Override
    public void log(int logLevel, String passkey) {
        if(logLevel == STUDENT){
            System.out.println("Request for student successful");
        }else{
            System.out.println("Request denied for Student");
            super.log(logLevel, passkey);
        }

    }
}
