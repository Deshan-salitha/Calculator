/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculator;

import java.util.*;

/**
 *
 * @author Harry Bob
 */
public class Calculator {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the 1st Number : ");
        float num1 = sc.nextFloat();
        System.out.println("Enter the 2nd Number : ");
        float num2 = sc.nextFloat();
        System.out.println("\nHere are your options:");
        System.out.println("\n1. Addition(+)");
        System.out.println("2. Subtraction(-)");
        System.out.println("3. Division(/)");
        System.out.println("4. Multiplication(*)");

        System.out.print("\nWhat would you like to do?: ");        
        String operator = sc.next();
        
        float  result = 0 ;
        try {
            switch (operator) {
                case "+":
                    result = add(num1, num2);
                    System.out.println("Addition of "+num1 +" and " +num2+" is "+result);
                    break;
                case "-":
                    result = Subtraction(num1, num2);
                    System.out.println("Subtraction of "+num1 +" and " +num2+" is "+result);
                    break;
                case "*":
                    result = Multiplication(num1, num2);
                    System.out.println("Multiplication of "+num1 +" and " +num2+" is "+result);
                    break;
                case "/":
                    result = Division(num1, num2);
                    System.out.println("Division of "+num1 +" and " +num2+" is "+result);
                    break;
    //            ertionError();
            }
//            System.out.println(result);
        } catch (Exception e) {
        }
        
        
    }
    
    public  static float add(float num1, float num2)
    {
        float number1 = num1;
        float number2 = num2;
        float output;
        output = number1 + number2;
        return output;

    }
    
    public  static float Subtraction(float num1, float num2)
    {
        float number1 = num1;
        float number2 = num2;
        float output;
        output = number1 - number2;
        return output;

    }
    
    public  static float Division(float num1, float num2)
    {
        float number1 = num1;
        float number2 = num2;
        float output;
        output = number1 / number2;
        return output;

    }
    
    public  static float Multiplication(float num1, float num2)
    {
        float number1 = num1;
        float number2 = num2;
        float output;
        output = number1 * number2;
        return output;

    }
}
