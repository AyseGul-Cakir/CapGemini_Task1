package com.CapGemini.pages;

import com.CapGemini.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePageANZ {


    public BasePageANZ() {
        PageFactory.initElements(Driver.get(), this);
    }



}
