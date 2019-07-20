/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creationaldesignpatterns;

/**
 *
 * @author armaan
 */
// Java.lang.runtime   uses SingletOn design pattern

// synchonized method causes cost overhead and more over afater few thread calls it is not required 
// hence double checking is used.
public class Singleton {
    
    private static volatile Singleton mSingleton = null;
    private Singleton(){
        
    }
    
    public static Singleton getInstance(){
      
        if(mSingleton == null){
        synchronized(Singleton.class) {
        if(mSingleton==null)
            mSingleton = new Singleton();
                  
        return mSingleton; 
         }
        }
        return mSingleton;
    }
    
}
