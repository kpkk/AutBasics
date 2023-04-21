package org.example;

import org.testng.annotations.Test;

public class Patterns {

    static int fun() {
        int x= 0;
        return ++x;
    }

    public static void main(String[] args) {


        System.out.println(fun());
     //   printPyramid(5);
        printPatterns(5);

        Integer num1 = 100;
        Integer num2 = 100;
        Integer num3 = 500;
        Integer num4 = 500;

        if(num1 == num2){
            System.out.println("num1 == num2");
        }
        else{
            System.out.println("num1 != num2");
        }
        if(num3.equals(num4)){
            System.out.println("num3 == num4");
        }
        else{
            System.out.println("num3 != num4");
        }
    }

    public static void printPyramid(int rows){

        int num=1;
        for (int i=0;i<rows;i++){
            for (int j=rows-1;j>i;j--){
                System.out.print(" ");
            }
            for (int j=0;j<num;j++){
                System.out.print("* ");
            }
            num+=2;
            System.out.println("");
        }
    }

    public static void printPattern(int n){

        int num=1;
        for (int i=0;i<n;i++){
            for (int j=n-i;j>1;j--){
                System.out.print(" ");
            }
            for (int j=0;j<num;j++){
                System.out.print("* ");
            }
            num+=2;
            System.out.println(" ");
        }
    }

    public static void printPatterns(int n){

        for (int i=0;i<n;i++){
            for (int j=2*(n-i);j>=0;j--){
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

}
