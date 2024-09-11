package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelectionTest {

    public static void main(String[] args) throws InterruptedException {

        // Aim: This script tests the dropdown selection functionality on the Qspiders demo apps website.
        // It verifies if the page is loaded correctly, interacts with various dropdowns, and selects options.

        // Expected URL of the Qspiders demo apps home page
        String expectedUrl = "https://demoapps.qspiders.com/";
        
        // Initialize Chrome WebDriver
        ChromeDriver driver = new ChromeDriver();
        
        // Maximize the browser window to ensure all elements are visible
        driver.manage().window().maximize();
        
        // Navigate to the Qspiders demo apps website
        driver.get("https://demoapps.qspiders.com/");
        Thread.sleep(2000);
        
        // Get the actual URL of the current page
        String actualUrl = driver.getCurrentUrl();
        
        // Verify if the actual URL matches the expected URL
        if (actualUrl.equals(expectedUrl)) {
            // Click on the section to access dropdown options
            driver.findElement(By.xpath("//p[@class='text-[#000000] font-semibold text-[0.9rem] mt-[0.6rem]']")).click();
            Thread.sleep(3000);
            
            // Click on the "Dropdown" section
            driver.findElement(By.xpath("//section[contains(text(),'Dropdown')]")).click();
            Thread.sleep(3000);
            
            // Select an option from the phone code dropdown
            WebElement phoneDropdown = driver.findElement(By.xpath("//select[@id='select1']"));
            Select phoneSelect = new Select(phoneDropdown);
            phoneSelect.selectByVisibleText("+92");
            Thread.sleep(3000);

            // Enter a phone number
            driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("8986765432");
            
            // Select gender from the dropdown
            WebElement genderDropdown = driver.findElement(By.xpath("//select[@class='border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150']"));
            Select genderSelect = new Select(genderDropdown);
            genderSelect.selectByVisibleText("Male");
            Thread.sleep(3000);
            
            // Select country from the dropdown
            WebElement countryDropdown = driver.findElement(By.xpath("//select[@id='select3']"));
            Select countrySelect = new Select(countryDropdown);
            countrySelect.selectByVisibleText("India");
            Thread.sleep(3000);
            
            // Select state from the dropdown
            WebElement stateDropdown = driver.findElement(By.xpath("//select[@id='select5']"));
            Select stateSelect = new Select(stateDropdown);
            stateSelect.selectByVisibleText("Maharashtra");
            Thread.sleep(3000);
            
            // Select city from the dropdown
            WebElement cityDropdown = driver.findElement(By.xpath("(//select[@class='border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150'])[4]"));
            Select citySelect = new Select(cityDropdown);
            citySelect.selectByValue("Pune");
            Thread.sleep(3000);

            // Select a product from the dropdown
            WebElement productDropdown = driver.findElement(By.xpath("//select[@class='border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring  ease-linear transition-all duration-150 w-full']"));
            Select productSelect = new Select(productDropdown);
            productSelect.selectByIndex(1);
            Thread.sleep(3000);

            // Close the browser
            driver.quit();
        } else {
            System.out.println("The URL does not match the expected URL.");
        }
    }
}
