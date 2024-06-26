package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page extends PageBase {


    public Login_Page(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@class='ico-login']")
    WebElement Login_btn;

    @FindBy(xpath = "//input[@id='Email']")
    WebElement Email;

    @FindBy(xpath = "//input[@id='Password']")
    WebElement Password;

    @FindBy(xpath = "//button[normalize-space()='Log in']")
    WebElement Submit;





    public void login(String email, String password)  {

        Login_btn.click();
        Email.sendKeys(email);
        Password.sendKeys(password);
        Submit.click();
    }
}
