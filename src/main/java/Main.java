import dao.UserDaoImplements;
import pojo.User;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Joshua on 28/01/2017.
 */
public class Main {

    public static void main(String[] args) throws SQLException {
        UserDaoImplements udi = new UserDaoImplements();
        List<User> userList = udi.getAllUser();

        for (User user : udi.getAllUser()) {
            System.out.println("User: " + user.getUser() + " Host: " + user.getHost());
        }
    }
}
