/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rizqu;

/**
 *
 * @author Acer
 * 
 * 
 */

public class Rizqu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        tes myCar = new tes();
        
        myCar.start();
        myCar.setSpeed(20);
        myCar.setDirection(180);
        myCar.setHealth(50);
        
        System.out.println("Speed :" + myCar.getSpeed());
        System.out.println("Direction :  " + myCar.getDirection());
        System.out.println("Health :  " + myCar.getHealth());
        
        
        myCar.useNitrous();
        
        System.out.println("Speed after using nitrous:" + myCar.getSpeed());
        System.out.println("Direction after using nitrous:  " + myCar.getDirection());
        System.out.println("Health after using nitrous:  " + myCar.getHealth());
        
        myCar.crash();
        System.out.println("Speed after crash:" + myCar.getSpeed());
        System.out.println("Direction after crash:  " + myCar.getDirection());
        System.out.println("Health after crash:  " + myCar.getHealth());
        
        
        
         

    }
    
}
