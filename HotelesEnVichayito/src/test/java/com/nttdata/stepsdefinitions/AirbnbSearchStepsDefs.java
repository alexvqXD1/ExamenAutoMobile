package com.nttdata.stepsdefinitions;

import com.nttdata.steps.AirbnbSearchSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

import java.io.File;

public class AirbnbSearchStepsDefs {

    @Steps
    AirbnbSearchSteps airbnbSearchSteps;

    @Given("que me enuentro en el login de Airbnb")
    public void que_me_enuentro_en_el_login_de_airbnb() {
        airbnbSearchSteps.clickClose();
    }
    @When("busco {string}")
    public void busco(String place) {
        airbnbSearchSteps.searchByText(place);
    }
    @Then("muestra el texto {string}")
    public void muestra_el_texto(String text) {

        Assert.assertEquals(airbnbSearchSteps.getResultText(), text);
    }

    @Given("Ingreso a la aplicacion y cierro las ventanas popup")
    public void ingresoALaAplicacionYCierroLasVentanasPopup() {
        airbnbSearchSteps.clickClose();
    }

    @When("dentro del formulario Where to? realizo la busqueda {string}")
    public void dentroDelFormularioWhereToRealizoLaBusqueda(String place) {
        airbnbSearchSteps.searchByText(place);
    }

    @And("Selecciono la primera busqueda")
    public void seleccionoLaPrimeraBusqueda() {
    }

    @And("Selecciono Skip")
    public void seleccionoSkip() {
    }

    @And("Selecciono Search")
    public void seleccionoSearch() {
    }

    @Then("debe de aparecer en pantalla {string}")
    public void debeDeAparecerEnPantalla(String text) {
        Assert.assertEquals(airbnbSearchSteps.getResultText(), text);
    }

    @And("debe de haber almenos algun resultado")
    public void debeDeHaberMasDeResultado() {
        int numero = airbnbSearchSteps.obtenertamanio() ;
        Assert.assertTrue( "El tamaño de la lista es: " +numero, numero > 0);
    }
}
