package pages;


import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponents;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegPage {

    CalendarComponents calendarComponents = new CalendarComponents();

    //Locators
      private final SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput =  $("#lastName"),
            userEmailInput = $("#userEmail"),
            userNumberInput = $("#userNumber"),
            userHobbiesSelect = $(byText("Sports")),
            userGenderSelect = $(byText("Male"));

    public RegPage openPage (){
        open("/automation-practice-form");

        return this;
    }

    //Actions
    public RegPage setFirstName(String firstName){
        firstNameInput.setValue(firstName);

        return this;
    }

    public RegPage setLastName(String lastName){
        lastNameInput.setValue(lastName);

        return this;
    }

    public RegPage setEmailInput(String userEmail){
        userEmailInput.setValue(userEmail);

        return this;
    }

    public RegPage setNumberInput(String userNumber){
        userNumberInput.setValue(userNumber);

        return this;
    }

    public RegPage setGender( ){
        userGenderSelect.click();

        return this;

    }
    public RegPage setHobbies( ){
        userHobbiesSelect.click();

        return this;

    }

    public void setBirthDate(String day, String month, String year){
        $("#dateOfBirthInput").click();
        calendarComponents.setDate(day, month, year);


    }

}
