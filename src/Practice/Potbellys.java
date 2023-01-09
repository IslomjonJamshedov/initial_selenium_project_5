package Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Driver;
import utils.Waiter;


public class Potbellys {
    public static void main(String[] args) throws InterruptedException {

        // 1. Create a webdriver instance

        try{
            WebDriver driver = Driver.getDriver();
        // Go to PotBelly's website
        driver.get("https://potbelly.com/");
            Waiter.pause(5);

        //Find and Click On Order
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/section[1]/div/button")).click();
            Waiter.pause(3);

        //Find And Select PickUp
        driver.findElement(By.xpath("//*[@id=\"orderPanel\"]/div[2]/button[1]")).click();
        Waiter.pause(4);

        //Find And Select "Order From Here" Button
        driver.findElement(By.xpath("//*[@id=\"scrollable\"]/div/div[1]/div[3]/button")).click();
        Waiter.pause(3);

        //Find And Select "CONTINUE TO MENU" Button
        driver.findElement(By.xpath("//*[@id=\"scrollable\"]/div[4]/form/div/button")).click();
        Waiter.pause(3);


        //Find and Click "VEGGIE MELT"
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[2]/div[1]/a[5]")).click();
        Waiter.pause(3);

        //Find and Click On SandWitch Size
        driver.findElement(By.cssSelector("button.MainPrimaryOption_optionSelect__CDWGz")).click();
        Waiter.pause(3);

        //Select Size Large
        driver.findElement(By.xpath("//button[@class=\"MainPrimarySidebar_item__9tcp2 MainPrimarySidebar_item__selected__UHS2C\"]")).click();
        Waiter.pause(3);


        //Find and Click On Bread Type
        driver.findElement(By.xpath("//button[@data-testid=\"box-options-dropdown\"]")).click();
        Waiter.pause(3);

        //Select Bread Type
        driver.findElement(By.xpath("(//div[@class=\"MainPrimarySidebar_primary__dgay8\"])[1]")).click();
        Waiter.pause(3);

        //Save Changes After Bread Is Selected
        driver.findElement(By.xpath("(//button[@class=\"Button_button__x52ji " +
                "undefined MainPrimarySidebar_saveButton__aKJES \"])[1]")).click();
        Waiter.pause(3);

        //Find and Click On Toppings Button
        driver.findElement(By.xpath("//div[@class=\"ToppingsModalButton_customize__label__main__kdRJh\"]")).click();
        Waiter.pause(3);

       //Find and Add Hot Peppers
       driver.findElement(By.xpath("(//span[@class=\"OptionCard_card__title__MTl9m\"])[15]")).click();
       Waiter.pause(3);

       //Find and Add Pickles
       driver.findElement(By.xpath("(//span[@class=\"OptionCard_card__title__MTl9m\"])[19]")).click();
       Waiter.pause(3);


       //Find "Add To Bag" And Click It
       driver.findElement(By.xpath("(//button[@data-testid='add-to-bag-button'])[2]")).click();
       Waiter.pause(3);


       //Find And Click On "GO TO BAG" Button
       driver.findElement(By.xpath("//button[@data-testid='go-to-bag-button']")).click();
       Waiter.pause(3);

       //Find and Click On "CHECKOUT" Button
       driver.findElement(By.xpath("//button[@data-testid='checkout-button']")).click();
       Waiter.pause(3);

       //Enter FirstName
       driver.findElement(By.id("firstname")).sendKeys("Islomjon");
       Waiter.pause(3);


       //Enter LastName
       driver.findElement(By.id("lastname")).sendKeys("Jamshedov");
       Waiter.pause(3);


       //Enter Email
       driver.findElement(By.id("emailaddress")).sendKeys("Jonjamshedov@gmail.com");
       Waiter.pause(3);


       //Enter Phone Number
       driver.findElement(By.id("contactnumber")).sendKeys("2245002866");
       Waiter.pause(3);


       //Enter Card #
       driver.findElement(By.xpath("//input[@autocomplete=\"cc-number\"]")).sendKeys("1234123412341234");
       Waiter.pause(3);


       //Enter CVV #
       driver.findElement(By.xpath("//input[@aria-label=\"CVV\"]")).sendKeys("123");
       Waiter.pause(3);


       //Enter EXP Date
       driver.findElement(By.id("expiration")).sendKeys("1224");
       Waiter.pause(3);


       //Enter ZipCode
       driver.findElement(By.id("zip")).sendKeys("60021");
       Waiter.pause(3);



       //Find And Click On "PLace My Order" Button
       //driver.findElement(By.id("(//button[@data-testid='place-my-order-button'])[2]")).click();
       //Waiter.pause(3);


        } catch (Exception e){
            System.out.println("Test FAILED due to: " + e.getMessage());
        }

        finally {
            Driver.quitDriver();
        }


    }
}
