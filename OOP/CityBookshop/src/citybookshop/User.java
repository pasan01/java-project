/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package citybookshop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Asus
 */
public class User {
    
    private String name;
    private String userName;
    private String password;
    private int    age;
    private String address;
    public static ArrayList<User> userList = new ArrayList<>();
    
    public User() {
        if(userList.isEmpty()){
            addDefaultUsers();
        }
    }
    
    private void addDefaultUsers() {
        userList.add(new User("Pasan", "pasan", "123", 20, "ABC"));
        userList.add(new User("ASD", "ASD", "123", 20, "ABC"));
        userList.add(new User("QWE", "QWE", "123", 20, "ABC"));
        userList.add(new User("ZXC", "ZXC", "123", 20, "ABC"));
        userList.add(new User("IOP", "IOP", "123", 20, "ABC"));
    }

    

    public User(String name, String userName, String password, int age, String address) {
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.age = age;
        this.address = address;
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }

    public void addNewUser(User user){
        userList.add(user);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
}
