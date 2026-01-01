package com.TestingAcademy.EX01Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium04GetMethods {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://app.vwo.com");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
    }
}
