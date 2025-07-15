/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test1;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author SFXW11
 */
public class Test1 {

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.useAddOrder();
        Receipt receipt = new Receipt();
        receipt.setVisible(true);
        
        System.out.println("Hello World!");
        
        
    }
    
    public void useAddOrder(){
        AddOrder addOrder = new AddOrder();
        addOrder.setOrder("Order to Table");
        addOrder.setOrderNo("1313131566");
        addOrder.setTable("5");
        addOrder.setOrderTime("15 : 26");
        addOrder.setMenu("Late Coffee");
        addOrder.setSize("Large");
        addOrder.setMilk("Oat Milk");
        addOrder.setCoffeeType("Harf Decaf");
        addOrder.setCoffeePrice(15);
        addOrder.setMilkPrice(15);
        addOrder.setFName("nut");
        addOrder.setLName("safds");
        
        GlobalVar.order.addFirst(addOrder);
        
        AddOrder addOrder1 = new AddOrder();
        addOrder1.setOrder("Order to Table");
        addOrder1.setOrderNo("1313131566");
        addOrder1.setTable("50");
        addOrder1.setOrderTime("15 : 26");
        addOrder1.setMenu("Late Coffee");
        addOrder1.setSize("Large");
        addOrder1.setMilk("Oat Milk");
        addOrder1.setCoffeeType("Harf Decaf");
        addOrder1.setCoffeePrice(15);
        addOrder1.setMilkPrice(15);
        addOrder1.setFName("nutfk");
        addOrder1.setLName("safds65");
        GlobalVar.order.addFirst(addOrder1);
    }
    
    public void showReceipt(int index){
        AddOrder addOrder = new AddOrder();
    }
}
