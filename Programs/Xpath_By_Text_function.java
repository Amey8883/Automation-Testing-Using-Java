package BasicNa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Text_function {

    /*
       Aim: This program demonstrates how to use Selenium WebDriver to interact with a web element using the XPath
       locator strategy. Specifically, it retrieves and prints the text of a "Register" button on a demo web shop
       and then clicks the button to navigate to the registration page.
     */
    public static void main(String[] args) throws InterruptedException {
        
        // Initialize the ChromeDriver
        ChromeDriver driver = new ChromeDriver();
        
        // Maximize the browser window
        driver.manage().window().maximize();
        
        // Wait for 3 seconds to allow the page to load
        Thread.sleep(3000);
        
        // Navigate to the demo web shop
        driver.get("https://demowebshop.tricentis.com/");
        
        // Locate the "Register" button using XPath and get its text before clicking
        WebElement register = driver.findElement(By.xpath("//a[@class='ico-register']"));
        String data = register.getText();
        System.out.println(data);

        // Click the "Register" button to navigate to the registration page
        register.click();
        
        // Wait for 2 seconds to allow the registration page to load
        Thread.sleep(2000);
        
        // Close the browser
        driver.quit();        
    }
}
