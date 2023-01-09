import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_URL_and_Title_Validation {
    public static void main(String[] args) throws InterruptedException {
        // 1. Set up
        System.setProperty("webdriver.chromedriver", "/Users/jonjamshedov/IdeaProjects/initial_selenium_project_5/chromedriver");


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        // 2. Test Validation
        driver.get("https://www.techglobalschool.com/");
        if (driver.getTitle().equals("SDET Bootcamp | TechGlobal")) System.out.println("Title validation Passed");
        else System.out.println("Title validation failed");

        if (driver.getCurrentUrl().equals("https://www.techglobalschool.com/")) System.out.println("URL validation Passed");
        else System.out.println("URL validation Failed");


        // 3. TearDown
        Thread.sleep(2000);
        driver.close();
    }
}
