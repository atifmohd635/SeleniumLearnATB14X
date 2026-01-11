package com.TestingAcademy.ProblemStatement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class LoginTTA {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new FirefoxDriver();
        String userName="Atif";
        String email="AtifTest@example.com";
        String password="Password@2814";

        driver.get("https://tta-bank-digital-973242068062.us-west1.run.app/");

        WebElement signUpButton=driver.findElement(By.xpath("//button[text()=\"Sign Up\"]"));
        signUpButton.click();
        new LoginTTA().CustomWait(3000);

        WebElement registrationPageText=driver.findElement(By.xpath("//p[text()=\"Create your digital account\"]"));
        Assert.assertTrue(registrationPageText.getText().contains("Create your digital account"));

        WebElement fullName= driver.findElement(By.xpath("//input[@placeholder=\"John Doe\"]"));
        fullName.sendKeys(userName);

        WebElement emailAddress= driver.findElement(By.xpath("//input[@placeholder=\"you@example.com\"]"));
        emailAddress.sendKeys(email);

        WebElement passwordField= driver.findElement(By.xpath("//div[@class=\"relative\"]/input[@type=\"password\"]"));
        passwordField.sendKeys(password);

        WebElement createAccountBtn= driver.findElement(By.xpath("//button[text()='Create Account']"));
        createAccountBtn.click();
        new LoginTTA().CustomWait(3000);

        Assert.assertTrue(driver.getPageSource().contains("Dashboard"));
    }
    public static void CustomWait(int i) throws InterruptedException {
        Thread.sleep(i);
    }
}
