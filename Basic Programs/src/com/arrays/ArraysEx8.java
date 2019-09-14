package com.arrays;

import java.util.Arrays;

public class ArraysEx8
{
    public static void main (String[] args) 
    {
        int arr1[] = {1, 2, 3};
        int arr2[] = {1, 2, 3};
      
         if (arr1.equals( arr2))//== compare reference 
            System.out.println("Same");
        else
            System.out.println("Not same");
        
       if (Arrays.equals(arr1, arr2))//compare values
            System.out.println("Same");
        else
            System.out.println("Not same");
        
    }
}