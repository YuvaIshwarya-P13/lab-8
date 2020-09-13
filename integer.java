/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;


import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class integer {
    public static void main(String[] args){
      Scanner obj=new Scanner(System.in);
      int sum=0;
      System.out.println("Enter the line of integer:");
      String a=obj.nextLine();
      System.out.println("The line of integers are:"+a);
      char c[]=a.toCharArray();
      for(int i=0;i<a.length();i++)
      {
      sum=sum+Integer.parseInt(String.valueOf(c[i])); 
      }
      System.out.println("The sum of the integer is:"+sum);
      }     
        
    }

    
    
        

