package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class03HW1 {

    // use css and xpath to do this
    //HW1:
    //Open chrome browser
    //Go to “http://practice.syntaxtechs.net/input-form-demo.php%E2%80%9D
    //fill in the complete form
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        // maximize the screen
        driver.manage().window().maximize();
        // driver.get to navigate to the website
        driver.get("http://practice.syntaxtechs.net/input-form-demo.php");
        WebElement firstName = driver.findElement(By.xpath("//input[@name='first_name']"));
        firstName.sendKeys("Tsanita");
        WebElement lastName = driver.findElement(By.xpath("//input[@name='last_name']"));
        lastName.sendKeys("Safiera");
        WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("wiekecahyadi@gmail.com");
        WebElement phone=driver.findElement(By.xpath("//input[@name='phone']"));
        phone.sendKeys("7812010768");
        WebElement address=driver.findElement(By.xpath("//input[@name='address']"));
        address.sendKeys("330 Alapaha ct");
        WebElement city=driver.findElement(By.xpath("//input[@name='city']"));
        city.sendKeys("Johns Creek");
        WebElement state=driver.findElement(By.xpath("//option[text()='Georgia']"));
        state.click();
        WebElement zipCode=driver.findElement(By.xpath("//input[@name='zip']"));
        zipCode.sendKeys("30022");
        WebElement a=driver.findElement(By.xpath("//input[@name='website']"));
        a.sendKeys("www.google.com");
        WebElement select=driver.findElement(By.xpath("//input[@value='yes']"));
        select.click();
        WebElement d= driver.findElement(By.xpath("//textarea[@name='comment']"));
        d.sendKeys("Always Happy");

    }
}
