/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg3;

/**
 *
 * @author Ali Al-Sanabani
 */
public class Stack <E>{
    
    E data[];
    int t = -1;
    final static int CAPACITY=100;
       
    public Stack() {
         this(CAPACITY);
        }
     public Stack(int capacity){
            data = (E[]) new Object[capacity] ;
        }
     
      
        
    
       

      
        public boolean isEmpty() {
            return t == -1 ; 
        }
        public int size() {
            return t + 1 ;
        }
        
        
        public void push(E element) {
        
        if ( size() == data.length)
                System.out.println("Stack is full") ; 
               
        data[++t]= element ; 
    }
        public E pop() {
       
        if(isEmpty())
            return null ;
        
        E delete = data[t];
        data[t] = null ; 
        t-- ; 
        return delete ; 
    
    }
        public E top() {

        if(isEmpty()) return null ;

        return data[t] ;

    }
        
}
