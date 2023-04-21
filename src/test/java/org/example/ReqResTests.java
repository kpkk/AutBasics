package org.example;


import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.testng.annotations.Test;

public class ReqResTests {

    @Test(description = "this is login test")
    @Description("this is login test")
    @Step("logging in...")
    public void test1(){
        System.out.println("this is test-1");
    }
    @Test(description = "this is user order creation test")
    @Description("this is user order creation test")
    @Step("user is being created..")
    public void test2(){
        System.out.println("this is test-2");
    }
    @Test(description = "this is search test case")
    @Description("this is search test case")
    @Step("product is being searched..")
    public void test3(){
        System.out.println("this is test-3");
    }
}
