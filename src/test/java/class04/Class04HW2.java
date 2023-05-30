package class04;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Class04HW2 extends CommonMethods {
    // goto facebook.com
    // click on create account
    // and select the your  date of birth using select class

    public static void main(String[] args) throws InterruptedException {
        openBrowserAndLaunchApplication("https://www.facebook.com/","chrome");
        driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();
        Thread.sleep(2000);
        WebElement month= driver.findElement(By.cssSelector("select[id='month']"));
        Select sel1=new Select(month);
        sel1.selectByValue("12");
        WebElement day= driver.findElement(By.cssSelector("select[id='day']"));
        Select sel2= new Select(day);
        sel2.selectByValue("14");
        WebElement year= driver.findElement(By.cssSelector("select[id='year']"));
        Select sel3= new Select(year);
        sel3.selectByValue("1979");
        Thread.sleep(5000);
        driver.quit();
    }

}
