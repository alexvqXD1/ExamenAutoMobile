package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SearchScreen extends PageObject {

    @AndroidFindBy(id = "com.airbnb.android:id/start_button")
    private WebElement formsearch;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Search destinations\"]")
    private WebElement searchInput;

    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.view.View[3]/android.widget.Button")
    private WebElement cerrarBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.airbnb.android:id/n2_bottom_sheet_title_title\"]")
    private WebElement resultText;

    @AndroidFindBy(xpath = "//android.widget.GridView[@content-desc=\"Explore Airbnb\"]/androidx.compose.ui.platform.ComposeView[2]/android.view.View/android.view.View")
    private List<WebElement> Tamanio;
    public void clickSearchInput(){
        try{
            Thread.sleep(3000);
        }catch (Exception e){

        }

        try{
            System.out.println("se cerrara una ventana");
            cerrarBtn.click();
            System.out.println("se cerro ventana");
        }catch (Exception e){
            System.out.println("error: "+e.getMessage());
        }
        formsearch.click();
        System.out.println("se hara click en el campo busqueda");
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.elementToBeClickable(searchInput));
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        searchInput.click();
    }

    public String getResultText(){
        return resultText.getText();
    }
    public int getTamanio(){
        return Tamanio.size();
    }
}
