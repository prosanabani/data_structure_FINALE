/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg3;

import java.util.Scanner;

/**
 *
 * @author Ali Al-Sanabani
 */
public class R_6_4 {
    public static void main(String[] args) {
        Stack<Integer> stack_1 =new Stack<>(5);
        Stack<Integer> stack_2 =new Stack<>(5);
        Scanner input = new Scanner(System.in);
        
        System.out.println("is stack_1 empty" + stack_1.isEmpty());
        System.out.println("the input elements are =");
        
        for (int i = 0; i < stack_1.size() ; i++) {
            stack_1.push(input.nextInt());
            System.out.println("top element is "+stack_1.top());
            System.out.println("stack size is = "+stack_1.size());  
            System.out.println("is the stack_1 empty ? "+stack_1.isEmpty()); 
        }
         for (int i = 0; i < 5 ; i++) {
            
            stack_1.push(stack_2.pop());
         
        }
      
    }
    
}

