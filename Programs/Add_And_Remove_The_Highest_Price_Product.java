package BasicNa;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add_And_Remove_The_Highest_Price_Product {

    /*
       Aim: To automate the process of adding products to the cart on the Demo Web Shop,
       navigate to the cart, identify the product with the highest price, and remove it from the cart.
     */
    public static void main(String[] args) throws InterruptedException {

        // Define the expected URL of the website
        String expected_result = "https://demowebshop.tricentis.com/";
		
        // Initialize ChromeDriver
        ChromeDriver driver = new ChromeDriver();
		
        // Maximize the browser window
        driver.manage().window().maximize();
		
        // Open the Demo Web Shop website
        driver.get(expected_result);
		
        // Get the current URL after page load
        String actual_result = driver.getCurrentUrl();
		
        // Verify that the correct webpage has been opened
        if(actual_result.equals(expected_result)) {
			
            // Define the expected title of the "Digital downloads" page
            String expected_result1 = "Demo Web Shop. Digital downloads";
			
            System.out.println("I am in DWS web page");
			
            // Click on the "Digital downloads" link
            driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
			
            // Get the title of the current page
            String actual_result1 = driver.getTitle();
			
            // Verify that the user is on the "Digital downloads" page
            if(actual_result1.equals(expected_result1)) {
                System.out.println("I am in the digital download page");
				
                // Find all "Add to cart" buttons on the page
                List<WebElement> addToCart = driver.findElements(By.xpath("//input[@value='Add to cart']"));
			    
                // Click each "Add to cart" button to add products to the cart
                for(WebElement web : addToCart) {
                    Thread.sleep(1000); // Wait for 1 second before clicking
                    web.click();
                }
			    
                // Wait for 2 seconds before proceeding
                Thread.sleep(2000);
                
                // Click on the shopping cart icon to view the cart
                driver.findElement(By.xpath("//a[@class='ico-cart']")).click();
                Thread.sleep(2000);
			   
                // Find all product prices in the cart
                List<WebElement> prices = driver.findElements(By.xpath("//span[@class='product-subtotal']"));
			   
                // Find all "Remove" checkboxes in the cart
                List<WebElement> removeItems = driver.findElements(By.xpath("//td[@class='remove-from-cart']/input"));
			   
                double maxPrice = 0;
                int maxPriceIndex = 0;
			   
                // Loop through the prices to find the highest price
                for(int i = 0; i < prices.size(); i++) {
                    String priceText = prices.get(i).getText().replace("$", "");
                    double price = Double.parseDouble(priceText);
				   
                    // Update the highest price and its index
                    if(price > maxPrice) {
                        maxPrice = price;
                        maxPriceIndex = i;
                    }
                }
			   
                // Click the "Remove" checkbox for the product with the highest price
                removeItems.get(maxPriceIndex).click();
			   
                // Wait for 2 seconds before updating the cart
                Thread.sleep(2000);
                
                // Click the "Update cart" button to apply changes
                driver.findElement(By.name("updatecart")).click();
                Thread.sleep(2000);
			   
                // Close the browser
                driver.close();
            }
        } else {
            // If the webpage is not correct, print a message and close the browser
            System.out.println("I am not in DWS webpage");
            driver.close();
        }
        
        // Additional delay before closing the browser
        Thread.sleep(2000);
        driver.close();
    }
}
