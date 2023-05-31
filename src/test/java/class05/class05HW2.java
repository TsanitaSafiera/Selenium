package class05;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class class05HW2 extends CommonMethods {
    // click on check box
    //then select bay cat from drop down
    //then enter text in text box


    public static void main(String[] args) throws InterruptedException {
        String url = "https://chercher.tech/practice/frames";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        // click on check box
        driver.switchTo().frame("frame1");
        driver.switchTo().frame("frame3");
        WebElement check = driver.findElement(By.xpath("//input[@id='a']"));
        check.click();
        Thread.sleep(2000);

        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        // find the WebElement animal
        WebElement animal = driver.findElement(By.xpath("//b[text()='Animals :']"));
        System.out.println(animal.getText());
        // select baby cat
        WebElement dd = driver.findElement(By.xpath("//select[@id='animals']"));
        Select sel =new Select(dd);
        sel.selectByVisibleText("Baby Cat");

        // enter text in text box
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame1");
        WebElement textBox = driver.findElement(By.xpath("//input"));
        textBox.sendKeys("Meow meow");
        Thread.sleep(2000);

    }
}
