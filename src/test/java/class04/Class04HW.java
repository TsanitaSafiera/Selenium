package class04;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Class04HW extends CommonMethods{
    // select , tuesday, thursday and friday one by one
    public static void main(String[] args) throws InterruptedException {
        openBrowserAndLaunchApplication(" http://practice.syntaxtechs.net/basic-select-dropdown-demo.php","chrome");
        WebElement days=driver.findElement(By.cssSelector("select[id='select-demo']"));
        days.click();
        Thread.sleep(1000);
        Select sel= new Select(days);
        sel.selectByValue("Tuesday");
        Thread.sleep(2000);
        sel.selectByValue("Thursday");
        Thread.sleep(2000);
        sel.selectByValue("Friday");
        Thread.sleep(2000);
        driver.quit();

    }

    }
