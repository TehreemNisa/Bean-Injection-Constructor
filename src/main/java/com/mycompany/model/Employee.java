/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

/**
 *
 * @author tehreem.nisa
 */
public class Employee {
    
private long salary;  
private String type;
  
public Employee() {}  
  
public Employee(long salary) {this.salary = salary;}  

public Employee(long salary, String type) {  
    this.salary = salary;  
    this.type = type;  
}  
  
public void show(){  
    System.out.println("Salary:"+salary+"\n"+"Type:"+type);  
}
}
