package dao;

import dbc.ConnectionFactory;
import pojo.User;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Joshua on 28/01/2017.
 */
public interface UserDao {
    public List<User> getAllUser() throws SQLException;

}
