package pages;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponents;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegPage {

    CalendarComponents calendarComponents = new CalendarComponents();

    //Locators
      private final SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput =  $("#lastName"),
            userEmailInput = $("#userEmail"),
            userNumberInput = $("#userNumber"),
            userSubjectSelect = $("#subjectsInput"),
            userStateSelect = $("#react-select-3-input"),
            userCurrentAddress = $x("//textarea[@placeholder='Current Address']"),
            resultsTable = $("[class=table-responsive]"),
            regButton = $("#submit"),
            titleTable = $("#example-modal-sizes-title-lg"),
            userCitySelect = $("#react-select-4-input"),
            tableButton = $("#closeLargeModal");


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

    public RegPage setGender(String gender){
        $(byText(gender)).click();

        return this;

    }

    public RegPage setHobbies(String hobbies ){
        $(byText(hobbies)).click();

        return this;

    }

    public RegPage setBirthDate(String day){
        $("#dateOfBirthInput").click();
        calendarComponents.setDate(day);

        return this;

    }

    public RegPage setSubjects(String userSubjects){
        userSubjectSelect.setValue(userSubjects).pressEnter();

        return this;
    }

    public RegPage uploadPicture(String srcFile ){
        $("#uploadPicture").uploadFile(new File((srcFile)));

        return this;

    }

    public RegPage setState(String userState){
        userStateSelect.setValue(userState).pressEnter();

        return this;
    }

    public RegPage setCity(String userCity){
        userCitySelect.setValue(userCity).pressEnter();

        return this;
    }

    public RegPage setCurrentAddress(String currentAddress){
        userCurrentAddress.setValue(currentAddress);

        return this;
    }

    public RegPage checkTitleTable( ){
        titleTable.shouldHave(Condition.text("Thanks for submitting the form"));;

        return this;

    }

    public RegPage clickRegButton( ){
        regButton.click();

        return this;

    }

    public RegPage checkForm(String fieldName, String value) {
        resultsTable.$(byText(fieldName))
                .parent().shouldHave(text(value));

        return this;
    }

    public RegPage clickTableButton( ){
        tableButton.click();

        return this;

    }

}
