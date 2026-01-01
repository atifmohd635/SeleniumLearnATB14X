package com.TestingAcademy.TTABank;

import com.TestingAcademy.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class TTABankLogin extends CommonToAll {


    @Test(priority = 2)
    public void login(ITestContext iTestContext) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        String userName="Atif";
        String email="AtifTest@example.com";
        String password="Password@2814";

        OpenBrowser(driver, "https://tta-bank-digital-973242068062.us-west1.run.app/");
        CustomWait(5000);

        WebElement signInPageText=driver.findElement(By.xpath("//p[text()='Secure Digital Banking Portal']"));
        Assert.assertTrue(signInPageText.getText().contains("Secure Digital Banking Portal"));

        WebElement emailFieldOfSignInPage= driver.findElement(By.xpath("//input[@placeholder='you@example.com']"));
        emailFieldOfSignInPage.clear();
        emailFieldOfSignInPage.sendKeys(email);

        WebElement passwordField= driver.findElement(By.xpath("//div[@class='relative']/input[@type='password']"));
        passwordField.sendKeys(password);
        System.out.println("Login Page");
        WebElement signInBtn= driver.findElement(By.xpath("//button[text()='Sign In']"));
        signInBtn.click();


    }
}
