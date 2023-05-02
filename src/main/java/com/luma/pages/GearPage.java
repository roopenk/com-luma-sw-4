package com.luma.pages;

import com.luma.utility.Utility;
import org.openqa.selenium.By;

public class GearPage extends Utility {
    By overnightDuffle = By.xpath("//a[normalize-space()='Overnight Duffle']");

    public void clickOnOvernightDuffle() {
        clickOnTheElement(overnightDuffle);
    }
}
