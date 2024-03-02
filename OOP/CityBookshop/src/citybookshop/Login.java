/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package citybookshop;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class Login {

    ArrayList<User> userList= null;
    
    public String userLogin(String userName, String password){
        User user = new User();
        userList = user.getUserList();
        String response = "Fail";
        
        for(User usr: userList){
            
            if(usr.getUserName().equalsIgnoreCase(userName)){
                System.out.println(usr.getUserName());
                System.out.println(usr.getPassword());
                System.out.println();
                if(usr.getPassword().equalsIgnoreCase(password)){
                    response = "Success";
                    break;
                }
            }
        }
        return response;
        
    }                                        
}
