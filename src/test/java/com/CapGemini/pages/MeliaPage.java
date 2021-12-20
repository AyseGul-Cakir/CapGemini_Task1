package com.CapGemini.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MeliaPage extends BasePageMelia {

     @FindBy(xpath ="//button[contains(@id,'didomi-notice-agree-button')]")
    public WebElement acceptCookies;


@FindBy(xpath = "//div[contains(@class,'u-download-apps')]//a[1]")
    public WebElement iosApp;

}
