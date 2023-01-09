import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Driver;

public class _03_Locators_id {
    public static void main(String[] args) {


        //
        WebDriver driver = Driver.getDriver();


        driver.get("https://techglobal-training.netlify.app/");

        if (driver.findElement(By.id("logo")).isDisplayed()){
            System.out.println("Logo is displayed");
        }else System.out.println("Logo is not displayed");


        // 3. Teardown - after actions
        driver.close();

    }
}
