/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package citybookshop;

/**
 *
 * @author Asus
 */
public class UserRegister {
    
    private String name;
    private String userName;
    private String password;
    private int age;
    private String address;

    public String register(String name, String userName, String password, int age, String address){
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.age = age;
        this.address = address;
        
        User user = new User();
        user.setName(this.name);
        user.setUserName(this.userName);
        user.setPassword(this.password);
        user.setAge(this.age);
        user.setAddress(this.address);
        
        user.addNewUser(user);
        
        return "Successfully Registered";
    }
    
}
