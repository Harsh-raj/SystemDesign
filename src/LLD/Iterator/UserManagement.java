package LLD.Iterator;

import java.util.ArrayList;

public class UserManagement {
    private ArrayList<User> userArrayList = new ArrayList<User>();

    public void addUser(User user){
        userArrayList.add(user);
    }

    public User getUser(int index){
        return userArrayList.get(index);
    }

    public CustomIterator getIterator(){
        return new UserIterator(userArrayList);
    }

}
