package BasicNa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * This program demonstrates how to use the `getAttribute` method in Selenium to retrieve
 * the value of an HTML attribute from a web element. The example uses a search field from
 * the Demo Web Shop website and retrieves the "id" attribute of the search field element.
 */
public class GetAttributeMethod {

    public static void main(String[] args) throws InterruptedException {
        
        // Initialize ChromeDriver and maximize the browser window
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        // Wait for 3 seconds to allow the browser to load completely
        Thread.sleep(3000);
        
        // Navigate to the Demo Web Shop website
        driver.navigate().to("https://demowebshop.tricentis.com/");
        
        // Locate the search field element by its name attribute
        WebElement search_field = driver.findElement(By.name("q"));
        
        // Retrieve the value of the "id" attribute from the search field element
        String attributeValue = search_field.getAttribute("id");
        
        // Print the value of the "id" attribute to the console
        System.out.println(attributeValue);
        
        // Close the browser and end the session
        driver.quit();
    }
}
