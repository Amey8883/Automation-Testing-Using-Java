package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAction {

    public static void main(String[] args) throws InterruptedException {
        
        // Aim: This program demonstrates the use of Selenium WebDriver to perform a click action on a web element.
        // It first navigates to a demo webshop, performs a search operation by entering a query, and then clicks the search button.
        
        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        // Maximize the browser window
        driver.manage().window().maximize();
        
        // Wait for 3 seconds to ensure the browser is fully loaded
        Thread.sleep(3000);
        
        // Navigate to the demo webshop
        driver.get("https://demowebshop.tricentis.com/");
        
        // Enter a search query into the search input field
        driver.findElement(By.id("small-searchterms")).sendKeys("hardwork");
        
        // Initialize the Actions class for performing advanced user interactions
        Actions act = new Actions(driver);
        
        // Wait for 3 seconds to ensure the page elements are fully loaded
        Thread.sleep(3000);
        
        // Find the search button element
        WebElement search = driver.findElement(By.cssSelector("input[type='submit']"));
        
        // Perform click action on the search button
        act.click(search).build().perform();
        
        // Wait for 1 second to observe the result of the click action
        Thread.sleep(1000);
        
        // Quit the driver and close the browser
        driver.quit();
    }
}
