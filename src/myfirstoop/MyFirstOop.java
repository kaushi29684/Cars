/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstoop;

/**
 *
 * @author Temp
 */
public class MyFirstOop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car c1=new Car();
        c1.colour="Red";
        c1.number="KF 4174";
        int engineCapacity1 = 1500;
            
        Car c2=new Car ();
        c2.colour="blue";
        c2.number="KI 1706";
        int engineCapacity2 =2000;
        
        Car c3=new Car();
        c3.colour="green";
        c3.number="CAO 3456";
        int engineCapacity3 =2000;
        
     Driver d1= new Driver();
     d1.name= "Buddhika";
     d1.age=42;
     d1.license="2345";
     
   Driver d2= new Driver();
   d2.name="Rajitha";
   d2.age= 45;
   d2.license="5678";
   
   Driver d3= new Driver ();
   d3.name="Suraji";
   d3.age=40;
   d3.license="5643";

        
        c1.driver=d1;
        c2.driver= d2;
        c3.driver=d3;
        
        System.out.println("The colour of "+c1.number + "is "+c1.colour);
        System.out.println("the Car numbered "+c1.number+" is a "+ c1.colour+" car driven by "+c1.driver.name);
        System.out.println(c3.number+ " is a "+c3.colour+ "ed car driven by"+ c3.driver.name);
        System.out.println(c2.driver.name+" is a"+ c2.driver.age+ " year old gentleman bearing the licence plate");
        
        
        
        
    }
    
}
