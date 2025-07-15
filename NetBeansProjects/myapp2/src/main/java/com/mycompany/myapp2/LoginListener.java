/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.myapp2;

/**
 *
 * @author Administrator
 */
public interface LoginListener {
    //interface
    void userClickedLogin(LoginForm form, String username, String Password);
    void userClickedCancel(LoginForm form);
    
}
