package ChainofCommand.Login;

import java.sql.SQLOutput;

public class TeacherLogin extends Login{

    public TeacherLogin(Login login) {
        super(login);
    }

    @Override
    public void log(int logLevel, String passkey) {
        if(logLevel==TEACHER)
            System.out.println("Request for Teacher successful");
        else{
            System.out.println("Request denied for Teacher");
            super.log(logLevel, passkey);
        }
    }
}
