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

/*
Creational Design pattern
Need : Client has to take care of different types objects of classes .
If we add a new Class then client has to update its code for that particular class
object creation.

So in Factory design pattern, we provide an interface to the client and a FcatoryClass 
method using which objects of different types of Classes can be generated without altering any code
in Client side.

*/

interface Mobile{
    
    void screenSize();
    void ramSize();
    
}
class Samsung implements Mobile{

    @Override
    public void screenSize() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ramSize() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

class OPPO implements Mobile{

    @Override
    public void screenSize() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ramSize() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

public class FactoryDesignPattern {
    
    static Mobile mobileInstanceFactoryMethod(String str){
        
        switch(str){
            case "Samsung" :
                return new Samsung();
            case "OPPO" :
                return new OPPO();
        
            default :
                return null;
        }
        
    }
    
}
 enum MobileStrings{
     SAMSUNG("Samsung"),
     OPPO("OPPO");
    private final String mobileType;
    private MobileStrings(String mobiletype) {
        this.mobileType = mobiletype;
    }
    
    @Override  
    public String toString(){
        return mobileType;
    }
     
}
