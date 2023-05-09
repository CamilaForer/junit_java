package org.example.models;

import java.util.Date;

public class User {
    private final int id;
    private  String nick;
    private String password;
    public Date lastChange;

    public User(int id, String password){
        this.id = id;
        this.password=password;
    }

    public int getId() {
        return id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }
    public String setPassword(String oldPassword, String newPassword) {
        if (oldPassword.equals(this.password)) {
            this.password = newPassword;
            return "Ok";
        } else {
            return "Wrong";
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nick='" + nick + '\'' +
                ", password='*****"  + '\'' +
                ", lastChange=" + lastChange +
                '}';
    }

}
