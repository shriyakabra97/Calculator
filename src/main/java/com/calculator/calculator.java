package com.calculator;

import java.io.*;
import java.util.Random;
import java.util.Scanner;
public class calculator{
    float a, b, res ;
    char ch ;
    int choice;
    Scanner sc = new Scanner(System.in);

    public float add(float a,float b) throws IOException{
        res = a+b ;
        System.out.println("Add");
        return res;
    }

    public float subtract(float a, float b) throws  IOException{
        res = a-b ;
        System.out.println("Subtract");
        return res;
    }

    public float multiply (float a, float b) throws IOException{

        res = a*b ;
        System.out.println("Multiply");
        return res;
    }

    public float divide(float a, float b) throws IOException{
        if(b!=0) {
            res = a / b;
        }else{
            res = -1;
        }
        System.out.println("Divide");
        return res;
    }

    public float modulus(float a, float b) throws IOException{
        res = a%b ;
        System.out.println("Modulus");
        return res;
    }

    public static void main(String args[]) throws  Exception{
        calculator c = new calculator();

            System.out.println("----------------------------MY CALC---------------------------------");
            System.out.println("1. ADD TWO Numbers");
            System.out.println("2. SUBTRACT TWO Numbers");
            System.out.println("3. MULTIPLY TWO Numbers");
            System.out.println("4. DIVIDE TWO Numbers");
            System.out.println("5. MODULUS OF TWO Numbers ");
            System.out.println("6. EXIT");
            System.out.println("Enter your choice");

            Random r = new Random();
            int low = 1;
            int high = 6;
            int result = r.nextInt(high-low) + low;
            System.out.println("choice = " + result);
            c.choice = result;
            System.out.println(c.choice);
            switch(c.choice){
                case 1 :
                    System.out.println("Enter two numbers :");
                    c.a = 10 ;
                    c.b = 20 ;
                    float add_sol = c.add(c.a,c.b);
                    System.out.println(" Addition Result = " + add_sol);
                    break;

                case 2 :
                    System.out.println("Enter two numbers :");
                    c.a = 20 ;
                    c.b = 10 ;
                    float sub_sol = c.subtract(c.a,c.b);
                    System.out.println(" Subtraction Result = " + sub_sol);
                    break;

                case 3 :
                    System.out.println("Enter two numbers :");
                    c.a = 32 ;
                    c.b = 10 ;
                    float mul_sol = c.multiply(c.a,c.b);
                    System.out.println("Multiplication Result = " + mul_sol);
                    break;

                case 4 :
                    //c.divide();
                    System.out.println("Enter two numbers :");
                    c.a = 110;
                    c.b = 11 ;
                    float div_sol = c.divide(c.a,c.b);
                    System.out.println("Division Result = " + div_sol);
                    break;


                case 5 :
                    System.out.println("Enter two numbers :");
                    c.a = 14 ;
                    c.b = 5 ;
                    float mod_sol = c.modulus(c.a,c.b);
                    System.out.println("Modulus Result = " + mod_sol);
                    break;


                case 6 :
                    System.exit(0);
                    break;

                default :
                    System.out.println("INVALID CHOICE!!");
                    break;

            }
            System.out.println("----------------------------------------");

    }


}