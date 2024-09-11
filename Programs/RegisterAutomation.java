package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterAutomation {

    public static void main(String[] args) throws InterruptedException {
        
        // Aim: This script automates the process of filling out and submitting a registration form on the demo automation testing page.
        // It validates the URL, fills in various fields, selects options from dropdowns, checks checkboxes, and submits the form.
        
        String expected_url = "https://demo.automationtesting.in/Register.html";
        
        // Initialize the ChromeDriver
        ChromeDriver driver = new ChromeDriver();
        
        // Maximize the browser window to ensure all elements are visible
        driver.manage().window().maximize();
        
        // Wait for 3 seconds to ensure the browser is properly initialized
        Thread.sleep(3000);
        
        // Navigate to the registration page
        driver.get("https://demo.automationtesting.in/Register.html");
        
        // Get the current URL of the page
        String actual_url = driver.getCurrentUrl();
        
        // Verify if the current URL matches the expected URL
        if (actual_url.equals(expected_url)) {
            System.out.println("Fill all the details");
            
            // Fill out various form fields with the provided data
            driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("Shinchan");
            Thread.sleep(1000);
            
            driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Nohara");
            Thread.sleep(1000);
            
            driver.findElement(By.cssSelector("textarea[ng-model='Adress']")).sendKeys("Kasukabe City, Japan.");
            Thread.sleep(1000);
            
            driver.findElement(By.cssSelector("input[type='email']")).sendKeys("shinchan2005@gmail.com");
            Thread.sleep(1000);
            
            driver.findElement(By.cssSelector("input[type='tel']")).sendKeys("7709118764");
            Thread.sleep(1000);
            
            // Select the gender radio button
            WebElement gender = driver.findElement(By.cssSelector("input[value='Male']"));
            gender.click();
            Thread.sleep(1000);
            
            // Select hobbies checkboxes
            WebElement cricket = driver.findElement(By.cssSelector("input[id='checkbox1']"));
            cricket.click();
            Thread.sleep(1000);
            
            WebElement movies = driver.findElement(By.cssSelector("input[id='checkbox2']"));
            movies.click();
            Thread.sleep(1000);
            
            WebElement hockey = driver.findElement(By.cssSelector("input[id='checkbox3']"));
            hockey.click();
            Thread.sleep(1000);
            
            // Select a language from the dropdown
            WebElement language = driver.findElement(By.xpath("//div[@id='msdd']"));
            Thread.sleep(1000);
            language.click();
            WebElement languageSelection = driver.findElement(By.xpath("//a[contains(text(),'Japanese')]"));
            languageSelection.click();
            Thread.sleep(1000);
            
            // Select skills from the dropdown
            WebElement skills = driver.findElement(By.xpath("//select[@id='Skills']"));
            Select sel1 = new Select(skills);
            sel1.selectByVisibleText("Java");
            Thread.sleep(1000);
            
            // Select a country from the dropdown
            WebElement countryDropdown = driver.findElement(By.xpath("//span[@class='select2-selection__arrow']"));
            countryDropdown.click();
            Thread.sleep(1000);
            WebElement country = driver.findElement(By.xpath("//li[text()='Japan']"));
            country.click();
            Thread.sleep(1000);
            
            // Select date of birth from dropdowns
            WebElement year = driver.findElement(By.xpath("//select[@id='yearbox']"));
            Select sel3 = new Select(year);
            sel3.selectByVisibleText("2005");
            Thread.sleep(1000);
            
            WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
            Select sel4 = new Select(month);
            sel4.selectByVisibleText("May");
            Thread.sleep(1000);
            
            WebElement day = driver.findElement(By.xpath("//select[@id='daybox']"));
            Select sel5 = new Select(day);
            sel5.selectByVisibleText("5");
            Thread.sleep(1000);
             
            // Fill out password fields
            WebElement password = driver.findElement(By.xpath("//input[@id='firstpassword']"));
            password.sendKeys("Nuttertools@123");
            Thread.sleep(1000);
            
            WebElement confirmPassword = driver.findElement(By.xpath("//input[@id='secondpassword']"));
            confirmPassword.sendKeys("Nuttertools@123");
            Thread.sleep(1000);
            
            // Verify if all checkboxes are selected and submit the form if they are
            if (gender.isSelected() && cricket.isSelected() && movies.isSelected() && hockey.isSelected()) {
                System.out.println("Form submitted successfully");
                driver.findElement(By.id("submitbtn")).click();
                Thread.sleep(3000);
            } else {
                System.out.println("Please select gender and hobbies");
            }
        }
        
        // Close the browser
        driver.quit();
    }
}
