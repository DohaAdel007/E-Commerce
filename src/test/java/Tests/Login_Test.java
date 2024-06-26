package Tests;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;
import Pages.Login_Page;

import java.io.IOException;

public class Login_Test extends TestBase {

    public Login_Page Login_Page;


    @Test (priority = 1 )
    public void Registration() throws IOException, ParseException {

        JsonDataReader jsonReader = new JsonDataReader();
        jsonReader.JsonReader();

        Login_Page = new Login_Page(driver);
        Login_Page.login(jsonReader.email , jsonReader.password);
    }
}
