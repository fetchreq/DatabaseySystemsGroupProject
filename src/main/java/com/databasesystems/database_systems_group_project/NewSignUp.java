package com.databasesystems.database_systems_group_project;


public class NewSignUp {

    private String firstName;
    private String lastName;
    private String username;
    private String passWord;
    private String conWord;
    private UserRepo userRepo;

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassWord() {
        return passWord;
    }

    public String getConWord() {
        return conWord;
    }

    public String getAddress() {
        return address;
    }

    private String address;

    public void setFirstName(String firstName) {
        System.out.println(firstName);
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setConWord(String conWord) {
        this.conWord = conWord;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean findUserNum(){
        String userNum = " ";
        userNum = userRepo.findUserName(this.username);
        if(userNum.equals(" ")){
            return false;
        }
        else{
            return true;
        }

    }
}
