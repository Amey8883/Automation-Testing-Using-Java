package DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

    // Aim: This program automates the drag-and-drop functionality on a demo webpage using Selenium WebDriver.

    public static void main(String[] args) throws InterruptedException {
        
        // Initialize ChromeDriver to launch the Chrome browser
        ChromeDriver driver = new ChromeDriver();
        
        // Maximize the browser window for better visibility
        driver.manage().window().maximize();
        
        // Wait for 3 seconds to ensure the browser is fully loaded
        Thread.sleep(3000);
        
        // Navigate to the demo page for drag-and-drop functionality
        driver.navigate().to("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        
        // Create an instance of the Actions class for performing drag-and-drop actions
        Actions act = new Actions(driver);
        
        // Wait for 3 seconds before performing the drag-and-drop
        Thread.sleep(3000);

        // Drag the element "box6" and drop it on "box106"
        WebElement source = driver.findElement(By.id("box6"));
        WebElement target = driver.findElement(By.id("box106"));
        act.dragAndDrop(source, target).build().perform();
        
        // Wait for 1 second before the next action
        Thread.sleep(1000);
        
        // Drag the element "box5" and drop it on "box105"
        WebElement source1 = driver.findElement(By.id("box5"));
        WebElement target1 = driver.findElement(By.id("box105"));
        act.dragAndDrop(source1, target1).build().perform();
        
        // Wait for 1 second before the next action
        Thread.sleep(1000);
        
        // Drag the element "box7" and drop it on "box107"
        WebElement source2 = driver.findElement(By.id("box7"));
        WebElement target2 = driver.findElement(By.id("box107"));
        act.dragAndDrop(source2, target2).build().perform();
        
        // Wait for 1 second before the next action
        Thread.sleep(1000);
        
        // Drag the element "box4" and drop it on "box104"
        WebElement source3 = driver.findElement(By.id("box4"));
        WebElement target3 = driver.findElement(By.id("box104"));
        act.dragAndDrop(source3, target3).build().perform();
        
        // Wait for 1 second before the next action
        Thread.sleep(1000);
        
        // Drag the element "box3" and drop it on "box103"
        WebElement source4 = driver.findElement(By.id("box3"));
        WebElement target4 = driver.findElement(By.id("box103"));
        act.dragAndDrop(source4, target4).build().perform();
        
        // Wait for 1 second before the next action
        Thread.sleep(1000);
        
        // Drag the element "box2" and drop it on "box102"
        WebElement source5 = driver.findElement(By.id("box2"));
        WebElement target5 = driver.findElement(By.id("box102"));
        act.dragAndDrop(source5, target5).build().perform();
        
        // Wait for 1 second before the next action
        Thread.sleep(1000);
        
        // Drag the element "box1" and drop it on "box101"
        WebElement source6 = driver.findElement(By.id("box1"));
        WebElement target6 = driver.findElement(By.id("box101"));
        act.dragAndDrop(source6, target6).build().perform();
        
        // Wait for 1 second before quitting the browser
        Thread.sleep(1000);
        
        // Close the browser and quit the WebDriver session
        driver.quit();
    }

}
