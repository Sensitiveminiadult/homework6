package LeagueOfLegends;


import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import com.codeborne.selenide.Condition;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
public class homework6 {
    @BeforeTest
    public void false1(){
        open("https://www.google.com/");

    }
    @Test
    public void false2 (){
        SelenideElement ser = $(byName("q")),
                ber =$(byText("Ima"));
        ser.setValue("tamar goguadze");
        Assert.assertFalse(ber.is(Condition.visible));
        Assert.assertEquals(ser.getValue(),"tamar goguadze","message1");

    }
}
