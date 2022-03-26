/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Ali Al-Sanabani
 */
public class r_6_5 {

    
   public static void remove (Stack obj)
   {
       
       if (obj.t == -1)
            System.out.println("empty");
        
       for (int i = 0; i < obj.data.length ; i++) {
            
           obj.data[i] = null ;
        }
   }
    
    
    public static void main(String[] args) {
        
        Stack<Integer> s = new Stack<>(5); 
        
        Scanner in = new Scanner(System.in);
        System.out.println("is the stack S empty ? " + s.isEmpty());
        System.out.println("input elements");
       
        
        for (int i = 0 ; i < 5 ; i++) 
        {
            s.push(in.nextInt());   
            System.out.println("top = "+s.top());  
            System.out.println("stack size = "+s.size());  
            System.out.println("stack empty ? "+s.isEmpty()); 
        }
        
        System.out.println("Before delete the stack elements : "+Arrays.toString(s.data));
        remove(s);
        System.out.println("After delete the stack elements : "+Arrays.toString(s.data));
        
        
        
    }
}


