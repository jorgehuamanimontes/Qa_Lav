package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.homePage;
import utility.BrowserDriver;

public class loginStepDefinition {

    private WebDriver driver;
    private homePage HomePage;

    public loginStepDefinition() {
        this.driver = BrowserDriver.getDriver();
        this.HomePage = new homePage(driver); // Inicializar HomePage con el driver

    }

    //Scenario: Registro en la web
    @Given("estoy en la pagina de la tienda")
    public void estoy_en_la_pagina_de_la_tienda() {
        String titleTienda = "My Store";
        Assert.assertEquals(titleTienda, driver.getTitle());
    }

    @When("doy click en la opcion iniciar sesion")
    public void doy_click_en_la_opcion_iniciar_sesion() {
        HomePage.clickIniciarSesion();
    }

    @And("doy click en el link text cree una cuenta aqui")
    public void doy_click_en_el_link_text_cree_una_cuenta_aqui() {
        HomePage.clickCrearCuenta();
    }

    @And("lleno los campos del formulario para el registro")
    public void lleno_los_campos_del_formulario_para_el_registro() {
        HomePage.clickTratamiento();
        HomePage.registroFirstName("Jorge");
        HomePage.registroLastName("Huamani");
        HomePage.registroEmail("jorge.huamanimontes@gmail.com");
        HomePage.registroPassword("Calidad123.");
        HomePage.clickMostrarPass();
        HomePage.registroFecNac("06/09/1988");
        HomePage.clickRecibirOfertar();
        HomePage.clickAceptarTerminos();
        HomePage.clickBoletin();
        HomePage.clickPrivacidadDatos();
    }

    @And("doy click en el boton guardar")
    public void doy_click_en_el_boton_guardar(){
        HomePage.clickGuardarNuevoRegistro();

    }
    @Then("deberia visualizar mi usuario logeado en la pantalla")
    public void deberia_visualizar_mi_usuario_logeado_en_la_pantalla(){
        String loginTitle = driver.getTitle();
        String textLogin = "My Store";
        Assert.assertEquals(loginTitle,driver.getTitle());
        }
    }

