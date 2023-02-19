package com.lodin.login;

public class User {
    private String username;
    private String iin;
    private String password;
    private String number;

    public User(String username, String iin, String password, String number){
        this.username = username;
        this.iin = iin;
        this.password = password;
        this.number = number;
    }

    public String getUsername() {return username;}

    public void setUsername(String username) {this.username = username;}

    public String getIin() {return iin;}

    public void setIin(String iin) {this.iin = iin;}

    public String getPassword() {return password;}

    public void setPassword(String password) {this.password = password;}

    public String getNumber() {return number;}

    public void setNumber(String number) {this.number = number;}
}
