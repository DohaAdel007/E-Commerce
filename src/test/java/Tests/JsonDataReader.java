package Tests;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonDataReader
{
    public String gender, firstname, lastname , Day, Month , Year , email , CompanyName,password , ConfirmationPassword ;

    public void JsonReader() throws IOException, ParseException {
        String filePath = System.getProperty("user.dir")+"/UserData.json";

        File srcFile = new File(filePath);

        JSONParser parser = new JSONParser();
        JSONArray jarray = (JSONArray)parser.parse(new FileReader(srcFile));

        for(Object jsonObj : jarray)
        {
            JSONObject Person = (JSONObject) jsonObj ;

            gender = (String) Person.get("gender");
            firstname  = (String) Person.get("firstname");
            lastname = (String) Person.get("lastname");
            Day = (String) Person.get("Day");
            Month = (String) Person.get("Month");
            Year = (String) Person.get("Year");
            email = (String) Person.get("email");
            CompanyName = (String) Person.get("CompanyName");
            password = (String) Person.get("password");
            ConfirmationPassword = (String) Person.get("ConfirmationPassword");

        }

    }

}
