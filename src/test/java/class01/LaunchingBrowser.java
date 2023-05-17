package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {
    /**
     * task
     * navigate to google.com
     */
    public static void main(String[] args) throws InterruptedException {
     WebDriver driver= new ChromeDriver();
     // use.get(url) to navigate to the desired url
        driver.get("https://www.google.com");
        // maximize the window
        driver.manage().window().maximize();
        // get the current url
        String currentURL = driver.getCurrentUrl();
        System.out.println("the current url of the website is : "+currentURL);
        // get the tittle of the page
        String tittle = driver.getTitle();
        System.out.println("The title of the page is : "+ tittle);
        // add some wait time
        Thread.sleep(5000); // press alt+ enter to get rid of the red line under sleep
        // close the web browser
        driver.quit();

    }
}
