package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class SearchDetailsScreen extends PageObject {

    @AndroidFindBy(xpath="//android.widget.TextView[@text=\"Search destinations\"]")
    private WebElement searchDetailInput;

    @AndroidFindBy(xpath="//android.widget.EditText[@resource-id=\"com.airbnb.android:id/input_bar_input\"]")
    private WebElement searchDetailInputText;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView")
    private WebElement firstOption;

    @AndroidFindBy(id = "2131430997")
    private WebElement nextButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"com.airbnb.android:id/n2_simple_search_footer_link\"]")
    private WebElement SkipButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"com.airbnb.android:id/n2_dls_action_footer_gradient_button\"]")
    private WebElement searchButton;

    public void enterSearchInput(String place){

       searchDetailInput.click();
        searchDetailInputText.sendKeys(place);


    }

    public void clickFirstOption(){
        firstOption.click();
    }

    public void clickNext(){
        nextButton.click();
    }

    public void clickSkip(){
        SkipButton.click();
    }

    public void clickSearch(){
        searchButton.click();
    }
}
