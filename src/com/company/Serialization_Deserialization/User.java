package com.company.Serialization_Deserialization;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {

    public static final long serialVersionUID = 456798L;

    private String login;
    private String password;
    private int year;
    private boolean isAdmin;


    public User(String login, String password, int year, boolean isAdmin) {
        this.login = login;
        this.password = password;
        this.year = year;
        this.isAdmin = isAdmin;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return year == user.year &&
                isAdmin == user.isAdmin &&
                Objects.equals(login, user.login) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, year, isAdmin);
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", year=" + year +
                ", isAdmin=" + isAdmin +
                '}';
    }
}
