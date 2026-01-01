package com.TestingAcademy.EX01Basics;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Selenium03HierarchyOfDriver {
    public static void main(String[] args) {

        SearchContext driver=new FirefoxDriver();

        RemoteWebDriver remoteWebDriver=new FirefoxDriver(); //If we run it on remote machine

        WebDriver webDriver=new FirefoxDriver();
        webDriver=new ChromeDriver(); //we can change it and use it on multiple browser

        FirefoxDriver firefoxDriver=new FirefoxDriver(); //only for one browser
    }

}
