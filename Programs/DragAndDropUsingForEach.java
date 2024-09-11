package DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Arrays;
import java.util.List;

public class DragAndDropUsingForEach {

    public static void main(String[] args) throws InterruptedException {
        
        // Aim: This program demonstrates a drag-and-drop functionality using Selenium WebDriver with ChromeDriver.
        // It performs drag-and-drop actions on elements from a source to a target location on a demo webpage.

        // Initialize the ChromeDriver
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // Maximize the browser window
        Thread.sleep(3000); // Wait for 3 seconds to ensure the browser is fully loaded
        
        // Navigate to the drag-and-drop demo page
        driver.navigate().to("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        Actions act = new Actions(driver); // Initialize the Actions class for performing actions
        Thread.sleep(3000); // Wait for 3 seconds to ensure the page elements are fully loaded
        
        // Find all source elements
        List<WebElement> sources = Arrays.asList(
            driver.findElement(By.id("box6")),
            driver.findElement(By.id("box5")),
            driver.findElement(By.id("box7")),
            driver.findElement(By.id("box4")),
            driver.findElement(By.id("box3")),
            driver.findElement(By.id("box2")),
            driver.findElement(By.id("box1"))
        );
        
        // Find all target elements
        List<WebElement> targets = Arrays.asList(
            driver.findElement(By.id("box106")),
            driver.findElement(By.id("box105")),
            driver.findElement(By.id("box107")),
            driver.findElement(By.id("box104")),
            driver.findElement(By.id("box103")),
            driver.findElement(By.id("box102")),
            driver.findElement(By.id("box101"))
        );
        
        // Perform drag-and-drop using a for loop
        for (int i = 0; i < sources.size(); i++) {
            WebElement source = sources.get(i);
            WebElement target = targets.get(i);
            // Perform drag-and-drop action
            act.dragAndDrop(source, target).build().perform();
            Thread.sleep(1000); // Sleep for 1 second between operations to observe the drag-and-drop effect
        }
        
        // Quit the driver to close the browser
        driver.quit();
    }
}
