package Iterator;

import java.util.List;

public class UserIterator implements CustomIterator {

    private final List<User> userList;
    private final int length;
    private int position = 0;
    public UserIterator(List<User> userList) {
        this.userList = userList;
        this.length = userList.size();
    }

    @Override
    public boolean hasnext() {
        return position < length;
    }

    @Override
    public Object next() {
        User user = userList.get(position);
        ++position;
        return user;
    }
}
