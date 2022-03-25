/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2;

import java.util.Random;

/**
 *
 * @author Ali Al-Sanabani
 */
public class Lab2 {
    
    //////////////////////////////////////////////
    //Write a Java method that Reverse an array using another array
     public static int[] reverse(int [] array )
     {
       int temp= array.length-1;
        for(int i=0 ; i< array.length/2; i++)
        {
            int a=array[i];
            array[i]=array[temp];
            array[temp]=a;
            temp--;
        }
        return array;      
    }
    
     //Write a Java method that Clone an array to a backup array.
     public static void clone(int[] c){
      
         int[] x=new int [c.length];
         for (int i = 0; i <= c.length; i++) {
            x[i]=c[i];
             
         }
    
    }
   //  Write a Java method that repeatedly selects and removes a random entry from an array until the array holds no more entries.
     public static void random_remove(int[] pie) {
        Random r = new Random();
       
        while (pie.length > 0) {
        int index = r.nextInt();
        System.out.println("INDEX = " + index + ", ELEMENT = " + pie[index]);
        int[] x = new int[pie.length - 1];
      
        for (int i = 0; i < index; i++)
        x[i] = pie[i];
        
        for (int i = index; i < pie.length - 1; i++)
        x[i] = pie[i + 1];
        pie = x;
      
        }
     }
     
   
     //printing array 
    public static void print(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"    ");
        }
            System.out.println("");
    }
   //////////////////////////////////////////////////////// 

          //testing zone
    public static void main(String[] args) {
        // TODO code application logic here
         int x[]={1,2,3,4,5,6,7,8,9,10};
//         print(x);
//           print(reverse(x));
//             clone(x);
//          random_remove(x);
      
        
    }
    
}
