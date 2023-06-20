package p1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Create {
    public static void main(String[] args) {
        String ChromeDriverPath = "C:\\Software\\chromedriver_ver113\\chromedriver\\chromedriver.exe";
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        System.setProperty("webdriver.chrome.driver", "ChromeDriverPath");
        driver.get("https://www.netflix.com/in/");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("miriyalayamini3010@gmail.com");
        driver.findElement(By.xpath("//button[@class=' e1ax5wel1 default-ltr-cache-1n9pf0']")).click();
        driver.findElement(By.xpath(("//*[@id=\"appMountPoint\"]/div/div/div/div[2]/div/div[2]/button"))).click();
        //driver.findElement(By.xpath("//button[@class='nf-btn nf-btn-primary nf-btn-solid nf-btn-oversize']")).click();
        driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("Harshitha@123");
        driver.findElement(By.xpath("//button[@placeholder='regForm_button_next']")).click();
        driver.findElement(By.xpath("//button[@placeholder='button_see_plans']")).click();
        // String loc_mail= "//input[@name='emailOrPhone']";



    }
}
