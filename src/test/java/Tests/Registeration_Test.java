package Tests;


import Pages.Registration_Page;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.IOException;


public class Registeration_Test extends TestBase{

    public Registration_Page Registration_Page;


    @Test (priority = 1)
    public void Registration() throws IOException, ParseException, InterruptedException {

        JsonDataReader jsonReader = new JsonDataReader();
        jsonReader.JsonReader();
        Registration_Page = new Registration_Page(driver);
        Registration_Page.Register(jsonReader.gender,jsonReader.firstname,jsonReader.lastname,jsonReader.Day, jsonReader.Month, jsonReader.Year,jsonReader.email , jsonReader.CompanyName, jsonReader.password, jsonReader.ConfirmationPassword);

    }
}
