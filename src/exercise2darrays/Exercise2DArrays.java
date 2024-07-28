/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise2darrays;

import java.util.*;
/**
 *
 * @author Thabo Setsubi ST10445734 thabosetsubi3@gmail.com
 */
public class Exercise2DArrays {

    /**
     * 
     * Exercise to write a program that accepts a 2D array of doubles and returns the sum of all elements in the array
     */
    public static void main(String[] args) {
        double[][] listOfNums = new double[6][6];
        Random r = new Random();
        for(int i=0; i<listOfNums.length; i++)
        {
            for(int j=0; j<listOfNums.length; j++)
            {
                listOfNums[i][j] =  r.nextDouble(1, 100);
            }
        }
        printArray(listOfNums);
        System.out.println(sumOfElements(listOfNums));
    }
    
    // method to print the sum of elements for a 2D array
    static double sumOfElements(double[][] nums) 
    {
        double n = 0;
        
        for(int i = 0;i < nums.length;i++)
        {
            for(int j = 0; j < nums.length; j++)
            {
                n = n + nums[i][j];
            }
            
        }
        
        return n;
    }
    
    // method to array
    static void printArray(double[][] nums) 
    {
        for(int i = 0; i < nums.length; i++)
        {
            
            for(int j = 0; j < nums.length; j++)
            {
                System.out.print(nums[i][j]+ " ");
                
            }
        }
        System.out.println();
    }
    //--------------------------- End Of File --------------------------------//
}
