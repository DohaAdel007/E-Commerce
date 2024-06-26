package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Objects;

public class Registration_Page extends PageBase {


    public Registration_Page(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement Register_btn;

    @FindBy(xpath = "//input[@id='gender-female']")
    WebElement Female;

    @FindBy(xpath = "//input[@id='gender-male']")
    WebElement Male;

    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement FirstName;

    @FindBy(xpath = "//input[@id='LastName']")
    WebElement LastName;

    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement Date_Day;

    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement Date_Month;

    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement Date_Year;

    @FindBy(xpath = "//input[@id='Email']")
    WebElement Email;

    @FindBy(xpath = "//input[@id='Company']")
    WebElement Company_Name;

    @FindBy(xpath = "//input[@id='Password']")
    WebElement Password;

    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement Confirm_Password;

    @FindBy(xpath = "//button[@id='register-button']")
    WebElement Submit_btn;

    public void Register(String gender,String firstName , String lastName , String Day ,String Month ,String Year , String email, String CompanyName , String password , String ConfirmationPassword )  {

        Register_btn.click();
        if(Objects.equals(gender, "female")) {
            Female.click();}
        else if (Objects.equals(gender, "male")) {
            Male.click();
        }
        FirstName.sendKeys(firstName);
        LastName.sendKeys(lastName);
        Date_Day.sendKeys(Day);
        Date_Month.sendKeys(Month);
        Date_Year.sendKeys(Year);
        Email.sendKeys(email);
        Company_Name.sendKeys(CompanyName);
        Password.sendKeys(password);
        Confirm_Password.sendKeys(ConfirmationPassword);
        Submit_btn.click();
    }
}
