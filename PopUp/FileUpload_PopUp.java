package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Aim: This program demonstrates how to automate the file upload process
 * on the iLovePDF website using Selenium WebDriver. It navigates to the 
 * website and uploads a specified file from the local system.
 */
public class FileUpload_PopUp {

    public static void main(String[] args) throws InterruptedException {

        // Initializing the ChromeDriver
        ChromeDriver driver = new ChromeDriver();
        
        // Maximizing the browser window
        driver.manage().window().maximize();
        
        // Wait for 3 seconds to observe the opened page
        Thread.sleep(3000);
        
        // Navigating to the iLovePDF Word to PDF conversion page
        driver.navigate().to("https://www.ilovepdf.com/word_to_pdf");
        
        // Wait for 3 seconds for the page to load completely
        Thread.sleep(3000);
        
        // Locating the file input element for file upload
        WebElement sendFile = driver.findElement(By.xpath("//input[@type='file']"));
        
        // Uploading the specified file from the local system
        sendFile.sendKeys("C:\\Users\\Amey Deshpande\\Downloads\\JavaScript Notes QSP.docx");
    }
}
