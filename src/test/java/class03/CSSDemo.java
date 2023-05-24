package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSDemo {
    public static void main(String[] args) throws InterruptedException {
        // instance of the webDriver
        WebDriver driver = new ChromeDriver();
        // maximize the screen
        driver.manage().window().maximize();
        // driver.get to navigate to the website
        driver.get("https://www.facebook.com/");
        // click on create new account
        WebElement createNewAccount = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createNewAccount.click();
        // because the DOM doesnt have first name by default
        // it only shows up after click on create account
        //and the cose takes time to appear in DOM for firstname
        // so we must add sleep here
        Thread.sleep(2000);

        // enter the first name
        WebElement fName = driver.findElement(By.cssSelector("input[name='firstname']"));
        fName.sendKeys("moazzam");



    }
}
