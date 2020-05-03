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

//    public float divide(){
//        if(b!=0) {
//            res = a / b;
//        }else{
//            return -1;
//        }
//        return res;
//    }

//    public float modulus(){
//        System.out.println("Enter two numbers :");
//        a = sc.nextFloat();
//        b = sc.nextFloat();
//        res = a%b ;
//        return res;
//    }

    public static void main(String args[]) throws  Exception{
        calculator c = new calculator();

            System.out.println("----------------------------MY CALC---------------------------------");
            System.out.println("1. ADD TWO Numbers");
            System.out.println("2. SUBTRACT TWO Numbers");
            System.out.println("3. MULTIPLY TWO Numbers");
//            System.out.println("4. DIVIDE TWO Numbers");
//            System.out.println("5. MODULUS OF TWO Numbers ");
            System.out.println("6. EXIT");
            System.out.println("Enter your choice");
            //c.choice = c.sc.next().charAt(0);
            Random r = new Random();
            int low = 1;
            int high = 6;
            int result = r.nextInt(high-low) + low;
            System.out.println(result);
            c.choice = result;
            System.out.println(c.choice);
            switch(c.choice){
                case 1 :
                    System.out.println("Enter two numbers :");
                    c.a = 10 ;
                    c.b = 20 ;
//                    c.a = c.sc.nextFloat();
//                    c.b = c.sc.nextFloat();
                    float add_sol = c.add(c.a,c.b);
                    System.out.println(" Addition Result = " + add_sol);
                    break;

                case 2 :
                    System.out.println("Enter two numbers :");
                    c.a = 20 ;
                    c.b = 10 ;
//                    c.a = c.sc.nextFloat();
//                    c.b = c.sc.nextFloat();
                    float sub_sol = c.subtract(c.a,c.b);
                    System.out.println(" Subtraction Result = " + sub_sol);
                    break;
//
                case 3 :
                    System.out.println("Enter two numbers :");
                    c.a = 3 ;
                    c.b = 10 ;
                    float mul_sol = c.multiply(c.a,c.b);
                    System.out.println("Multiplication Result = " + mul_sol);
                    break;
//
//                case '4' :
//                    c.divide();
//                    break;

//                case '5' :
//                    c.modulus();
//                    break;
//
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