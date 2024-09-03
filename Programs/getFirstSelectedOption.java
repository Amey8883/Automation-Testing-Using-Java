package BasicNa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getFirstSelectedOption {

    /*
       Aim: This program demonstrates how to interact with a dropdown list in a web page using Selenium.
       It specifically shows how to select multiple options in a multi-select dropdown and retrieve 
       the first selected option.
     */
    public static void main(String[] args) throws InterruptedException {
        
        // Set up ChromeDriver and initialize WebDriver
        WebDriver driver = new ChromeDriver();
        
        // Maximize the browser window
        driver.manage().window().maximize();
        
        // Wait for 3 seconds to ensure the page is fully loaded (not recommended for production use)
        Thread.sleep(3000);
        
        // Navigate to the local HTML file containing the dropdown
        driver.get("file:///C:/Users/Amey%20Deshpande/Downloads/demo.html");
        
        // Locate the dropdown element by its ID
        WebElement cars = driver.findElement(By.id("multiple_cars"));
        
        // Create a Select object to interact with the dropdown
        Select sel = new Select(cars);
        
        // Select multiple options by their visible text
        sel.selectByVisibleText("Ford");
        sel.selectByVisibleText("BMW");
        sel.selectByVisibleText("Jaguar");
        
        // Get the first selected option in the dropdown
        WebElement element = sel.getFirstSelectedOption();
        
        // Print the text of the first selected option to the console
        System.out.println(element.getText());
        
        // Close the browser and end the session
        driver.quit();
    }
}
