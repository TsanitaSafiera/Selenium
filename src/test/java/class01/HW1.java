package class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    //navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
    //fill out the form
    //close the browser
    //Note: use name or id as locators
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("John");
        driver.findElement(By.id("customer.lastName")).sendKeys("Doe");
        driver.findElement(By.id("customer.address.street")).sendKeys("Abbots Bridge Rd");
        driver.findElement(By.id("customer.address.city")).sendKeys("Duluth");
        driver.findElement(By.id("customer.address.state")).sendKeys("Georgia");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("30097");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("123-456-789");
        driver.findElement(By.id("customer.ssn")).sendKeys("987-654-3210");
        driver.findElement(By.id("customer.username")).sendKeys("num1234");
        driver.findElement(By.id("customer.password")).sendKeys("paSS4567");
        driver.findElement(By.id("repeatedPassword")).sendKeys("paSS4567");
        Thread.sleep(5000);

        driver.close();




    }

}
