package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginUser {
    public static void main(String[] args) {
        String ChromeDriverPath = "C:\\Software\\chromedriver_ver113\\chromedriver\\chromedriver.exe";
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        System.setProperty("webdriver.chrome.driver", "ChromeDriverPath");
        driver.get("https://www.netflix.com/in/");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("elurikiran29@gmail.com");
        driver.findElement(By.xpath("//*[@data-uia='nmhp-card-cta+hero_fuji']")).click();
        //driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
        driver.findElement(By.xpath("//input[@id='id_password']")).sendKeys("Kiran@1095");
        driver.findElement(By.xpath("//button[@class='btn login-button btn-submit btn-small']")).click();
        driver.findElement(By.xpath("//div[@class='profile-icon']")).click();
    }
}
