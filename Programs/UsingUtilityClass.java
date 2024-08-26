package BasicNa;

import org.openqa.selenium.By;
import UtilityClass.BaseClassDWS;

// Aim: This program navigates to the Demo Web Shop homepage and verifies if the URL matches the expected result. 
// If the verification is successful, it attempts to search for "Rolls Royce" on the page.

public class UsingUtilityClass extends BaseClassDWS {

    public static void main(String[] args) throws InterruptedException {
        
        // Define the expected URL of the Demo Web Shop homepage
        String expected_result = "https://demowebshop.tricentis.com/";
        
        // Perform pre-condition setup (e.g., opening the browser, navigating to the URL)
        preCondition1();
        
        // Get the current URL from the browser
        String actual_result = driver.getCurrentUrl();
        
        // Print the actual URL to the console
        System.out.println(actual_result);
        
        // Check if the actual URL matches the expected URL
        if(expected_result.equals(actual_result)) {
            // If the URLs match, confirm that we are on the Demo Web Shop page
            System.out.println("I am in DWS page");
            
            // Find the search box element and input "Rolls Royce" as the search term
            driver.findElement(By.id("small-searchterms")).sendKeys("Rolls Royce");
            
            // Perform post-condition actions (e.g., closing the browser)
            postCondition1();

        } else {
            // If the URLs do not match, indicate that we are not on the Demo Web Shop page
            System.out.println("I am not in DWS page");
            
            // Perform post-condition actions
            postCondition1();
        }
        
        // Perform additional post-condition actions if necessary
        postCondition2();    
    }
}
