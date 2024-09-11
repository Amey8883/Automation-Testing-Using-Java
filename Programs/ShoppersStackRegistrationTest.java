package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppersStackRegistrationTest {

    public static void main(String[] args) throws InterruptedException {

        // Aim: This script tests the registration process on the ShoppersStack website.
        // It verifies if the page title is correct, navigates to the login page, and fills out the registration form.

        // Expected title of the ShoppersStack home page
        String expectedTitle = "ShoppersStack";
        
        // Initialize Chrome WebDriver
        ChromeDriver driver = new ChromeDriver();
        
        // Maximize the browser window to ensure all elements are visible
        driver.manage().window().maximize();
        
        // Navigate to the ShoppersStack home page
        driver.get("https://www.shoppersstack.com/");
        
        // Wait for the page to load
        Thread.sleep(3000);
        
        // Get the actual title of the current page
        String actualTitle = driver.getTitle();
        
        // Verify if the actual title matches the expected title
        if (actualTitle.equals(expectedTitle)) {
            // Expected title on the login page
            String expectedLoginTitle = "Shopper Login";
            
            // Click on the "Login" button
            driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
            
            // Wait for the login page to load
            Thread.sleep(3000);
            
            // Find the login page title element and verify its text
            WebElement loginPageTitle = driver.findElement(By.xpath("//strong[contains(text(),'Shopper Login')]"));
            
            if (loginPageTitle.getText().equals(expectedLoginTitle)) {
                // Fill out the registration form
                driver.findElement(By.xpath("//span[@class='MuiButton-label']")).click();
                Thread.sleep(3000);
                
                driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMarginDense MuiOutlinedInput-inputMarginDense']")).sendKeys("Shinchan");
                Thread.sleep(3000);
                
                driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMarginDense MuiOutlinedInput-inputMarginDense']")).sendKeys("Nohara");
                Thread.sleep(3000);
                
                driver.findElement(By.cssSelector("input[value='MALE']")).click();
                Thread.sleep(3000);
                
                driver.findElement(By.name("Phone Number")).sendKeys("7775989922");
                Thread.sleep(3000);
                
                driver.findElement(By.name("Email Address")).sendKeys("shinchan2005@gmail.com");
                Thread.sleep(3000);
                
                WebElement passwordField = driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd MuiOutlinedInput-inputAdornedEnd MuiInputBase-inputMarginDense MuiOutlinedInput-inputMarginDense']"));
                passwordField.sendKeys("Nuttertools@123");
                Thread.sleep(3000);
              
                WebElement confirmPasswordField = driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd MuiOutlinedInput-inputAdornedEnd MuiInputBase-inputMarginDense MuiOutlinedInput-inputMarginDense']"));
                confirmPasswordField.sendKeys("Nuttertools@123");
                Thread.sleep(3000);
                
                driver.findElement(By.xpath("//input[@class='jss22']")).click();
                Thread.sleep(3000);
                
                // Check if password and confirm password fields match before submitting the form
                if (passwordField.getAttribute("value").equals(confirmPasswordField.getAttribute("value"))) {
                    driver.findElement(By.xpath("//button[contains(text(),'Register')]")).click();
                } else {
                    System.out.println("Please enter the same password in both fields.");
                }
            } else {
                System.out.println("Login page title does not match expected title.");
            }
        } else {
            System.out.println("Welcome page title does not match expected title.");
        }
        
        // Close the browser
        driver.quit();
    }
}
