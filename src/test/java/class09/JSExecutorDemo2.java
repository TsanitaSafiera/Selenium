package class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import javax.swing.*;

public class JSExecutorDemo2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://amazon.com/";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        // perform a scroll operation
        // using java script

        JavascriptExecutor js= (JavascriptExecutor) driver;
        // scroll down
        js.executeScript("window.scrollBy(0, 500)");
        // thread.sleep for observation
        Thread.sleep(3000);
        // scroll up
        js.executeScript("window.scrollBy(0, -500)");

        // click on the dropdown "ALL"
        // use click from jsExecutor

        //        find the text box
        WebElement DD=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        js.executeScript("arguments[0].click();",DD);




    }
}
