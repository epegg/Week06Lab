/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author 752814
 */
public class UserService {
    public User login(String username, String password){
        if(username.equals("betty")||username.equals("adam")){
            if(password.equals("password")){
                User user = new User(username, null);
                return user;
            }
        }
        return null;
    }
}
