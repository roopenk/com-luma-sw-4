package com.luma.pages;

import com.luma.utility.Utility;
import org.openqa.selenium.By;

public class MenPage extends Utility {
    By cronusYogaPant = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    By size = By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-size-143-item-175']");
    By color = By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-color-93-item-49']");
    By addToCart = By.xpath("//body[1]/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/button[1]/span[1]");
    By addToCartText = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");

    public void mouseHoverOnCronusYogaPant() {
        mouseHoverToElement(cronusYogaPant);
    }

    public void clickOnSize() {
        clickOnTheElement(size);
    }

    public void clickOnColor() {
        clickOnTheElement(color);
    }

    public void clickOnAddToCart() {
        clickOnTheElement(addToCart);
    }

    public String getTextAfterAddToCart() {
        return getTextFromElement(addToCartText);
    }

    public void clickOnShoppingCart() {
        clickOnTheElement(shoppingCart);
    }

}
