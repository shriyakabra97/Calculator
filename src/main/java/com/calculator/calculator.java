package com.calculator;

import java.io.*;
import java.util.Scanner;
public class calculator{
    float a, b, res ;
    char choice, ch ;
    Scanner sc = new Scanner(System.in);

    public float add(float a,float b) throws IOException{
        res = a+b ;
        System.out.println("add");
//        BufferedWriter writer = new BufferedWriter(new FileWriter("/home/shriya/calc_logs.txt"));
//        writer.append("add\n");
//        //writer.write("add \n");
//        writer.close();

        File file = new File("/data/calc_logs.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        FileWriter fw = new FileWriter(file,true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("add \n");
        bw.close();

        return res;
    }

//    public float subtract(){
//        System.out.println("Enter two numbers :");
//        a = sc.nextFloat();
//        b = sc.nextFloat();
//        res = a-b ;
//        return res;
//    }
//
//    public float multiply(){
//        System.out.println("Enter two numbers :");
//        a = sc.nextFloat();
//        b = sc.nextFloat();
//        res = a*b ;
//        return res;
//    }
//
//    public float divide(){
//        System.out.println("Enter two numbers :");
//        a = sc.nextFloat();
//        b = sc.nextFloat();
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
            //System.out.println("2. SUBTRACT TWO Numbers");
            //System.out.println("3. MULTIPLY TWO Numbers");
            //System.out.println("4. DIVIDE TWO Numbers");
            //System.out.println("5. MODULUS OF TWO Numbers ");
            System.out.println("6. EXIT");
            System.out.println("Enter your choice");
            //c.choice = c.sc.next().charAt(0);
            c.choice = '1';
            switch(c.choice){
                case '1' :
                    System.out.println("Enter two numbers :");
                    c.a = 10 ;
                    c.b = 20 ;
//                    c.a = c.sc.nextFloat();
//                    c.b = c.sc.nextFloat();
                    float sol = c.add(c.a,c.b);
                    System.out.println("Result = " + sol);
                    break;

//                case '2' :
//                    c.subtract();
//                    break;
//
//                case '3' :
//                    c.multiply();
//                    break;
//
//                case '4' :
//                    c.divide();
//                    break;

//                case '5' :
//                    c.modulus();
//                    break;
//
                case '6' :
                    System.exit(0);
                    break;

                default :
                    System.out.println("INVALID CHOICE!!");
                    break;

            }
            System.out.println("----------------------------------------");

    }


}