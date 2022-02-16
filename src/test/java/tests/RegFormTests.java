package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.RegPage;



public class RegFormTests {

    RegPage RegPage = new RegPage();

    String yourFirstName = "Boris";
    String yourLastName = "Britva";
    String yourNumberInput = "8999818907";
    String yourEmailInput = "borisbritva@gmail.com";

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl="https://demoqa.com";
    }


    @Test
    void testPracticeForm() {
        RegPage.openPage()
                .setFirstName(yourFirstName)
                .setLastName(yourLastName)
                .setNumberInput(yourNumberInput)
                .setEmailInput(yourEmailInput)
                .setHobbies()
                .setGender()
                .setBirthDate("13","September","1990");

    }

}
