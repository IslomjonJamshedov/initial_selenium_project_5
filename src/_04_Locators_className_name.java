import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.Waiter;

public class _04_Locators_className_name {
    public static void main(String[] args) {

        try{
            WebDriver driver = Driver.getDriver();

            driver.get("https://techglobal-training.netlify.app/");

            Waiter.pause(2);

            driver.findElement(By.id("dropdown-button")).click();
            Waiter.pause(2);

            driver.findElement(By.id("frontend-option")).click();
            Waiter.pause(2);

            driver.findElement(By.id("card-1")).click();
            Waiter.pause(2);

            WebElement kiwiItem = driver.findElement(By.id("item_kiwi"));
            WebElement orangeItem = driver.findElement(By.name("item_orange"));
            WebElement grapesItem = driver.findElement(By.className("item_grapes"));

            if (kiwiItem.isDisplayed()) System.out.println ("Kiwi item validation is PASSED");
            else  System.out.println ("Kiwi item validation is NOT PASSED");

            if (orangeItem.isDisplayed()) System.out.println("Orange item validation is PASSED");
            else  System.out.println ("Orange item validation is NOT PASSED");

            if (grapesItem.isDisplayed()) System.out.println("Grapes item validation is PASSED");
            else  System.out.println ("Grapes item validation is NOT PASSED");


        } catch (Exception e){
            System.out.println("Test FAILED due to: " + e.getMessage());
        }

        finally {
            Driver.quitDriver();
        }
    }

        // 3. TearDown

    }


