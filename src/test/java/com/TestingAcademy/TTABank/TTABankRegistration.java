package com.TestingAcademy.TTABank;

import com.TestingAcademy.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class TTABankRegistration extends CommonToAll {

    @Test(priority = 1)
    public void verifySignUP(ITestContext iTestContext) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        String userName="Atif";
        String email="AtifTest@example.com";
        String password="Password@2814";

        OpenBrowser(driver, "https://tta-bank-digital-973242068062.us-west1.run.app/");
        CustomWait(3000);

        WebElement signUpButton=driver.findElement(By.xpath("//button[text()=\"Sign Up\"]"));
        signUpButton.click();
        CustomWait(3000);

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
        CustomWait(3000);

        Assert.assertTrue(driver.getPageSource().contains("Dashboard"));

        WebElement quickTransferBtn= driver.findElement(By.xpath("//button[text()='Quick Transfer']"));
        quickTransferBtn.click();

        CustomWait(2000);

        WebElement manageBeneficiaries= driver.findElement(By.xpath("//button[text()='Manage Beneficiaries']"));
        manageBeneficiaries.click();

        CustomWait(1000);

        WebElement FN= driver.findElement(By.xpath("//input[@placeholder='e.g. John Doe']"));
        FN.sendKeys("Electricity Bill");

        WebElement bankName= driver.findElement(By.xpath("//input[@placeholder='e.g. Citibank']"));
        bankName.sendKeys("Axis Bank");

        WebElement AccNo= driver.findElement(By.xpath("//input[@placeholder='8-12 digits']"));
        AccNo.sendKeys("2222222222");

        WebElement SaveBeneficiary= driver.findElement(By.xpath("//button[text()='Save Beneficiary']"));
        SaveBeneficiary.click();

    }

}
