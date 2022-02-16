package pages.components;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponents {
    public void setDate(String day, String month, String year){
        $("[class=react-datepicker__month-select]").selectOption("September");
        $("[class=react-datepicker__year-select").selectOption("1990");
        $("[aria-label$='" +month+" "+day+"th, "+ year+ "']").click();

    }
}
