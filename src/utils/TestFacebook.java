package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestFacebook {
    public static void main(String[] args) {

        try{
            WebDriver driver =  Driver.getDriver();
            driver.get("https://www.facebook.com/");



            //URL Verification
            driver.getCurrentUrl();
            if (driver.getCurrentUrl().equals("https://www.facebook.com/")) System.out.println("URL Test Passed");
            else System.out.println("URL Test Did Not Pass");


            //Logo Verification
            if (driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"))
                    .isDisplayed()) System.out.println("Logo Test Passed");
            else System.out.println("Logo Test Failed");

            //Heading Verification
            if (driver.findElement(By.className("_8eso"))
                    .equals("Connect with friends and the world around you on Facebook."))
                System.out.println("Heading Test Passed");
            else System.out.println("Heading Test Failed");

            //Email or Phone Verification
            if (driver.findElement(By.id("email")).isDisplayed()) System.out.println("Email And Phone Test Passed");
            else System.out.println("Email And Phone Test Failed");

            //PassWord
            if (driver.findElement(By.id("pass")).isDisplayed()) System.out.println("Password Test Passed");
            else System.out.println("Password Test Failed");

            //Login
            if (driver.findElement(By.xpath("//button[@name=\"login\"]")).isDisplayed())
                System.out.println("Login Test Passed");
            else System.out.println("Login Test Failed");

            //Forgot Password
            //if (driver.findElement(By.("a[href='\"https://www.facebook.com/recover/initiate/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjczMjk2NTI5LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D&amp;ars=facebook_login\"']")))

            //Create new Account
            if (driver.findElement(By.id("u_0_0_sT")).isDisplayed()) System.out.println("Create new Account Test Passed");
            else System.out.println("Create new Account Test Failed");

            driver.findElement(By.)








        }catch (Exception e){
            System.out.println("Test FAILED due to: " + e.getMessage());
        } finally {
            Driver.quitDriver();
        }

    }
}
