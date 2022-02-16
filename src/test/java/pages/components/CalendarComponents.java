package pages.components;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponents {
    public void setDate(String day){
        $("[class=react-datepicker__month-select]").selectOption("September");
        $("[class=react-datepicker__year-select").selectOption("1990");
        $(".react-datepicker__day--0"+day).click();

    }
}
