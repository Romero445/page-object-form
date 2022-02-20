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
    String yourSubjects = "Math";
    String yourState = "Uttar Pradesh";
    String yourCity = "Agra";
    String yourCurrentAddress = "USSR";
    String yourHobbies = "Sports";
    String yourGender = "Male";
    String yourPicture = "src/test/resources/Pictest.png";

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
                .setHobbies(yourHobbies)
                .setGender(yourGender)
                .setSubjects(yourSubjects)
                .uploadPicture(yourPicture)
                .setState(yourState)
                .setCity(yourCity)
                .setCurrentAddress(yourCurrentAddress)
                .setBirthDate("13")
                .clickRegButton();
        RegPage.checkForm("Student Name",yourFirstName+" "+yourLastName)
                .checkForm("Student Email", yourEmailInput)
                .checkForm("Gender", "Male")
                .checkForm("Date of Birth","13 September,1990")
                .checkForm("Subjects",yourSubjects)
                .checkForm("Hobbies","Sports" )
                .checkForm("Picture","Pictest.png" )
                .checkForm("Address",yourCurrentAddress)
                .checkForm("State and City",yourState+" "+yourCity)
                .checkTitleTable()
                .clickTableButton();

    }

}
