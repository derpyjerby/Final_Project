/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classgradingsystem;
/**
 *
 * @author user
 */

public abstract class User {
    private int user_id;
    private String username;
    private String password;
    private String firstname;
    private String lastname;

    public int getUser_id() {
        return user_id;
    }

    public User(int user_id, String username, String password, String firstname, String lastname) {
        this.user_id = user_id;
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    public boolean login(String username, String password){
        return 0 == this.username.compareTo(username) && 0 == this.password.compareTo(password);
    }
    
    public abstract String getName();
    
    @Override
    public abstract String toString();   
}
