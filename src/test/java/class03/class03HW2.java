package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class03HW2 {

        public static void main(String[] args) throws InterruptedException {
            //Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D
            //Enter valid username
            //Leave password field empty
            //Click on login button
            //Verify error message with text “Password cannot be empty” is displayed. (edited)
            WebDriver driver=new ChromeDriver();
            driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D");
            driver.manage().window().maximize();


            WebElement username=driver.findElement(By.cssSelector(" input[id='txtUsername']"));
            username.sendKeys("Admin");

            WebElement butt=driver.findElement(By.cssSelector("input[id='btnLogin']"));
            butt.click();
            WebElement blankPass = driver.findElement(By.cssSelector("span[id='spanMessage']"));

            String invalidPass = blankPass.getText();
            if (invalidPass.equals(null)) {
                System.out.println("Password cannot be empty");
            } else {
                System.out.println("Password was filled");

            }
            System.out.println(driver.findElement(By.cssSelector("input[name = 'txtUsername']")));


    }
}
