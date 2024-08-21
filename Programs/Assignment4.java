package BasicNa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

    /*
     * Aim:
     * This Selenium script is designed to automate the process of:
     * 1. Navigating to the Demo Web Shop home page.
     * 2. Clicking on the "Gift Cards" section.
     * 3. Adding a gift card to the cart with specific details.
     * 4. Verifying if the gift card has been successfully added to the cart.
     * 
     * Comments:
     * - This script uses ChromeDriver to interact with the web page.
     * - It includes pauses (Thread.sleep) to wait for elements to load properly.
     * - It handles both element interactions and verification of the cart contents.
     */

    public static void main(String[] args) throws InterruptedException {
        
        // Set the expected URL
        String expected_result = "https://demowebshop.tricentis.com/";
        
        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        // Maximize the browser window
        driver.manage().window().maximize();
        
        // Navigate to the website
        driver.get("https://demowebshop.tricentis.com/");
        
        // Get the current URL
        String actual_result = driver.getCurrentUrl();
        
        // Verify if we are on the correct page
        if(actual_result.equals(expected_result)) {
            System.out.println("I am on the DWS home page");
            Thread.sleep(1000);
            
            // Click on the "Gift Cards" link
            driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]")).click();
            Thread.sleep(1000);

            // Click on the "Add to cart" button for the first gift card
            driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
            Thread.sleep(1000);            
            
            // Clear default value and enter quantity
            WebElement quantityField = driver.findElement(By.xpath("//input[@id='addtocart_1_EnteredQuantity']"));
            quantityField.clear();  // Clear the default value first
            Thread.sleep(1000);
            quantityField.sendKeys("3");  // Enter new value
            Thread.sleep(1000);
            
            // Enter recipient's name
            driver.findElement(By.xpath("//input[@id='giftcard_1_RecipientName']")).sendKeys("Vivek Oberoi");
            Thread.sleep(1000);
            
            // Enter recipient's email
            driver.findElement(By.xpath("//input[@id='giftcard_1_RecipientEmail']")).sendKeys("vivekoberoi65@gmail.com");
            Thread.sleep(1000);

            // Enter sender's name
            driver.findElement(By.xpath("//input[@id='giftcard_1_SenderName']")).sendKeys("Salman Khan");
            Thread.sleep(1000);

            // Enter sender's email
            driver.findElement(By.xpath("//input[@id='giftcard_1_SenderEmail']")).sendKeys("beinghuman12@gmail.com");
            Thread.sleep(1000);

            // Enter a message
            driver.findElement(By.xpath("//textarea[@name='giftcard_1.Message']")).sendKeys("Send the clothes properly");
            Thread.sleep(1000);

            // Click on the "Add to cart" button to add the gift card to the cart
            driver.findElement(By.xpath("//input[@id='add-to-cart-button-1']")).click();
            Thread.sleep(1000);

            // Click on the "shopping cart" link to view the cart
            driver.findElement(By.linkText("Shopping cart")).click();
            Thread.sleep(1000);
        
            // Verify if the gift card is in the cart
            WebElement text = driver.findElement(By.linkText("$5 Virtual Gift Card"));
            Thread.sleep(1000);

            if(text.isDisplayed()) {
                System.out.println("Product is added successfully");
                Thread.sleep(1000);
                driver.close();
            } else {
                System.out.println("Product is not added");
                driver.quit();
            }
        } else {
            System.out.println("I am not on the DWS home page");
            driver.quit();
        }
        
        // Close the browser after completing the test
        driver.quit();
    }
}
