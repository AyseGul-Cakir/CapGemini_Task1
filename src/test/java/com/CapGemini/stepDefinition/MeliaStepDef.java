package com.CapGemini.stepDefinition;

import com.CapGemini.pages.ANZPage;
import com.CapGemini.pages.MeliaPage;
import com.CapGemini.utilities.BrowserUtils;
import com.CapGemini.utilities.ConfigurationReader;
import com.CapGemini.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Set;

public class MeliaStepDef {
   MeliaPage meliaPage =new MeliaPage();


  /* @Given("Open chrome")
    public void openChrome() {
        Driver.get().manage().window().maximize();
   }
   */


    @And("^Navigate to melia$")
    public void NavigateToMelia() throws Throwable {
        String urlMelia= ConfigurationReader.get("urlMelia");
        Driver.get().get(urlMelia);
    }


    @And("^Close melia cookies$")
    public void Close_melia_cookies() throws Throwable {
        meliaPage.acceptCookies.click();
    }


    @When("^Check link ios app$")
    public void Check_link_app() throws Throwable {
        Assert.assertTrue( meliaPage.iosApp.isDisplayed()) ;
    }

   @And("^Click link ios app$")
   public void Click_link_ios_app() throws Throwable {
       meliaPage.iosApp.click();
        //Ver visualmente el resultado
       //https://www.melia.com/es/promo/landing-app/vacacional/index.html?utm_medium=meliacom&utm_source=footerdescarga
        BrowserUtils.waitFor(4);

        String currentWindowHandle= Driver.get().getWindowHandle();

        Set<String> windowHandles = Driver.get().getWindowHandles();

       for (String handle : windowHandles) {
           if (!handle.equals(currentWindowHandle)) {
               Driver.get().switchTo().window(handle);

               String currentUrl = Driver.get().getCurrentUrl();
               System.out.println("currentUrl = " + currentUrl);
               String expectedUrl="https://www.melia.com/es/promo/landing-app/vacacional/index.html?utm_medium=meliacom&utm_source=footerdescarga" ;
               Assert.assertEquals(currentUrl, expectedUrl);


           }
       }
   }
}