package dao;

import com.mysql.jdbc.PreparedStatement;
import dbc.ConnectionFactory;
import pojo.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Joshua on 28/01/2017.
 */
public class UserDaoImplements implements UserDao {
    private ConnectionFactory dbc;
    private ArrayList<User> userList = new ArrayList<User>();

    public void setDbc(ConnectionFactory dbc) {
        this.dbc = dbc;
    }

    public List<User> getAllUser() throws SQLException {
        String sql = "SELECT user.Host,user.User FROM mysql.user";
        PreparedStatement ps = (PreparedStatement) dbc.getConnection().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {

            String uname = rs.getString("user.User");
            String host = rs.getString("user.Host");

            User user = new User(host, uname);
            userList.add(user);


        }
        return userList;
    }
}
