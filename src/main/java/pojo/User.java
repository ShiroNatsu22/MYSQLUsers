package pojo;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by Joshua on 28/01/2017.
 */
public class User {
    private String host;
    private String user;

    public User() {
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public User(String host, String user) {
        this.host = host;
        this.user = user;


    }
}