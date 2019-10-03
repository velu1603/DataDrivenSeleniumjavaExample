package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    //Constructor
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication(){
        click("Form Authentication");
        return new LoginPage(driver);
    }
    public DropdownPage clickDropDown(){
        click("Dropdown");
        return new DropdownPage(driver);
    }
    public HoversPage clicHover(){
        click("Hovers");
        return new HoversPage(driver);
    }
    private void click(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
