import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.TechGlobalUtil;
import utils.Waiter;

public class _05_Locators_tagName {
    public static void main(String[] args) {

        try{

            WebDriver driver = Driver.getDriver();

            TechGlobalUtil.getFrontEndTesting();

            driver.findElement(By.id("card-1")).click();
            Waiter.pause(2);

            WebElement heading = driver.findElement(By.id("main_heading"));

            if (heading.getText().equals("Locators")) System.out.println("Header test Passed");
            else System.out.println("Header test Failed");

        } catch (Exception e){
            System.out.println("Test FAILED due to: " + e.getMessage());
        }

        finally {
            Driver.quitDriver();
        }
    }
}
