package com.nttdata.steps;

import com.nttdata.screens.LoginScreen;
import com.nttdata.screens.SearchDetailsScreen;
import com.nttdata.screens.SearchScreen;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

public class AirbnbSearchSteps {

    LoginScreen loginScreen;
    SearchScreen searchScreen;
    SearchDetailsScreen searchDetailsScreen;

    @Step("Click en cerrar")
    public void clickClose(){
        loginScreen.clickClose();
    }

    @Step("Búsqueda por texto {0}")
    public void searchByText(String place){
        System.out.println("se hara click en el campo de busqueda.....");
        searchScreen.clickSearchInput();
        System.out.println("se ingresara la busqueda....");
        searchDetailsScreen.enterSearchInput(place);
        searchDetailsScreen.clickFirstOption();
        searchDetailsScreen.clickSkip();
        searchDetailsScreen.clickSearch();
    }

    @Step("Obtiene el texto del resultado")
    public String getResultText(){
        return searchScreen.getResultText();
    }
    @Step("Obtiene el texto del resultado")
    public int obtenertamanio(){
        return searchScreen.getTamanio();
    }

}
