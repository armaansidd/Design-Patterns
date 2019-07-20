/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creationaldesignpatterns;

/**
 *
 * @author reyaa
 */
public class CreationalDesignPatterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Singleton s1 =  Singleton.getInstance();
        System.out.println(s1);
        Singleton s2 = Singleton.getInstance();
        System.out.println(s2);
        
        Mobile refSamsung = FactoryDesignPattern.mobileInstanceFactoryMethod(MobileStrings.SAMSUNG.toString());
        System.out.println("Hello samsung "+refSamsung);
        
        Mobile refOPPO = FactoryDesignPattern.mobileInstanceFactoryMethod(MobileStrings.OPPO.toString());
               System.out.println("Hello Oppo "+refOPPO);
    }
    
}
