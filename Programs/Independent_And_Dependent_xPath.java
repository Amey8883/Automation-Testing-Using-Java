package BasicNa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Independent_And_Dependent_xPath {

    // Aim: This program automates navigation to a web page, verifies the URL, clicks on a specific link, and 
    // uses independent and dependent xPath techniques to locate and retrieve text from a web element.

    public static void main(String[] args) throws InterruptedException {
        String expected_Result = "https://demowebshop.tricentis.com/";
        
        // Initialize the ChromeDriver and maximize the browser window
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        // Navigate to the expected URL
        driver.get(expected_Result);
        String actual_result = driver.getCurrentUrl();
        
        // Verify if the current URL matches the expected URL
        if(expected_Result.equals(actual_result)) {
            System.out.println("I am in DWS page >>> ");
            Thread.sleep(3000);

            // Click on the 'Digital downloads' link using xPath
            driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
            WebElement verify = driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]"));

            // Verify if the 'Digital downloads' page is displayed
            if(verify.isDisplayed()) {
                System.out.println("I am in Digital Download Page >>> ");
                Thread.sleep(3000);
                
                // Use independent and dependent xPath to find and retrieve the text of the 3rd Album price
                WebElement album3D = driver.findElement(By.xpath("//a[contains(text(),'3rd Album')]/../following-sibling::div[3]/div/span"));
                System.out.println(album3D.getText());

                // Close the browser
                driver.close();
            } else {
                System.out.println("I am not in Digital download Page <<< ");
                driver.close();
            }
        } else {
            System.out.println("I am not in DWS page <<< ");
            driver.close();
        }
    }
}
