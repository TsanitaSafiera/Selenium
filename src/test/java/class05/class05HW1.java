package class05;

import Utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class class05HW1 extends CommonMethods {
    // click on the last alert
    //send keys and accept it
    public static void main(String[] args) throws InterruptedException {
        String url = "http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement alert3Btn=driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        alert3Btn.click();
        Thread.sleep(3000);

        Alert confirmationAlert3 = driver.switchTo().alert();
        Thread.sleep(2000);

        alert3Btn.sendKeys("Tsanita");
        Thread.sleep(2000);

        confirmationAlert3.accept();


    }
}
