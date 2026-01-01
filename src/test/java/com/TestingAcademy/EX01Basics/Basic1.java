package com.TestingAcademy.EX01Basics;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Basic1 {
    @Test
    public void testBasic(){
        System.setProperty("webdriver.gecko.driver",
                "D:\\PromodDutta\\SeleniumLearnATB14X\\geckodriver.exe");
        FirefoxDriver firefoxDriver=new FirefoxDriver();
        firefoxDriver.get("https://paytm.com");
    }
}
