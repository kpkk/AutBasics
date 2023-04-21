package org.example;

public interface A {
 //   public void add();
    default void m1(){
        System.out.println("default method");
    }
}

interface B{
    void sub();
}

interface C extends A,B{
    void mul(int a, int b);

    default public void m1(){
        System.out.println("default method");
    }
}
