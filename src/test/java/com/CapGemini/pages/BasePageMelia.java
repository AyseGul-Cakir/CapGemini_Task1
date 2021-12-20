package com.CapGemini.pages;

import com.CapGemini.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract  class BasePageMelia {

    public BasePageMelia() {
        PageFactory.initElements(Driver.get(), this);
    }
}
