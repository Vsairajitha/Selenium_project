package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver = null;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void setSearchText(String value) {
        String Loc = "//input[@data-uia='login-field']";
        WebElement ele = this.driver.findElement(By.xpath(Loc));
        ele.sendKeys(value);
    }
    public void setSearchText1(String value) {
        String Loc = "//input[@type='password']";
        WebElement ele = this.driver.findElement(By.xpath(Loc));
        ele.sendKeys(value);
    }
    public void clickSearchButton() {
        String Loc = "//button[@class='btn login-button btn-submit btn-small']";
        WebElement ele = this.driver.findElement(By.xpath(Loc));
        ele.click();
    }
    public void dropDown() {
        String Loc = "///div[@class='account-dropdown-button']";
        WebElement ele = this.driver.findElement(By.xpath(Loc));
        ele.click();
    }
    public void clickAccount() {
        String Loc = "//div[@class='account-menu-item']";
        WebElement ele = this.driver.findElement(By.xpath(Loc));
        ele.click();
    }
    public void clickChangePassword() {
        String Loc = "//a[@data-uia='account-password-link']";

        WebElement ele = this.driver.findElement(By.xpath(Loc));
        ele.click();
    }
    public void browse(){
        String Loc="//a[@class='menu-trigger' and text()='Browse']";
        WebElement ele = this.driver.findElement(By.xpath(Loc));
        ele.click();
    }
    public void clickMyList(){
        String Loc="//a[@class='menu-trigger']";
        WebElement ele = this.driver.findElement(By.xpath(Loc));
        ele.click();


}
