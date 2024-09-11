package DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

    public static void main(String[] args) throws InterruptedException {
        
        // Aim: This program demonstrates the use of Selenium WebDriver to perform a click-and-hold operation on an element,
        // and then release it onto a target location on a demo webpage.
        
        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        // Maximize the browser window
        driver.manage().window().maximize();
        
        // Navigate to the drag-and-drop demo page
        driver.navigate().to("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        
        // Initialize the Actions class to perform advanced user interactions
        Actions act = new Actions(driver);
        
        // Wait for the page to load completely
        Thread.sleep(3000);
        
        // Find the source element to click and hold
        WebElement rome = driver.findElement(By.id("box6"));
        
        // Perform click-and-hold action on the source element
        act.clickAndHold(rome).build().perform();
        
        // Wait for a moment before releasing the element
        WebElement italy = driver.findElement(By.id("box106"));
        Thread.sleep(3000);
        
        // Release the source element onto the target location
        act.release(italy).build().perform();
        
        // Quit the driver and close the browser
        driver.quit();
    }
}
