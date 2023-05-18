package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class02HW {
    // HW  (only use XPATH)
    //navigate to fb.com
    //click on create new account
    //fill up all the text boxes
    //close the popup
    //close the browser
    //[10:19 PM]
    //Note : in order for ur code to work
    //u have to put Thread.sleep(2000) after clicking on Create new account

    public static void main(String[] args) throws InterruptedException {
        //declare instance
        WebDriver driver = new ChromeDriver();
        //navigate to Facebook
        driver.get("https://www.facebook.com/");
        //maximize window
        driver.manage().window().maximize();
        // find element Create account
        WebElement account = driver.findElement(By.xpath("//a[text()='Create new account']"));
        account.click();
        // add some wait time
        Thread.sleep(2000);

        WebElement firstName= driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("Jane");

        WebElement lastName= driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys("Doe");

        WebElement mobileNum= driver.findElement(By.xpath("//input[@aria-label = 'Mobile number or email']"));
        mobileNum.sendKeys("123-456-7891");                

        WebElement newPass= driver.findElement(By.xpath("//input[@aria-label = 'New password']"));
        newPass.sendKeys("abc@123");

        WebElement birthdayMonth= driver.findElement(By.xpath("//select[@name='birthday_month']"));
        birthdayMonth.sendKeys("June");

        WebElement birthday= driver.findElement(By.xpath("//select[@id='day']"));
        birthday.sendKeys("17");

        WebElement birthdayYear= driver.findElement(By.xpath("//select[@id='year']"));
        birthdayYear.sendKeys("1974");

        WebElement gender= driver.findElement(By.xpath("//label[text()='Female']"));
        gender.click();

        Thread.sleep(5000);

        WebElement signUp= driver.findElement(By.xpath("//button[text()='Sign Up']"));
        signUp.click();

        Thread.sleep(5000);
        driver.quit();

    }
}
