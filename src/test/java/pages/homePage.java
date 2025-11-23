package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {

    WebDriver driver;

    public homePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //LOCALIZADORES
    @FindBy(xpath = "//*[@id=\"field-id_gender-1\"]")
    public WebElement chkTratamiento;
    @FindBy(xpath = "//*[@id=\"_desktop_user_info\"]/div/a/span")
    public WebElement bntIniciarSesion;
    @FindBy(xpath = "//*[@id=\"content\"]/div/a")
    public WebElement bntCrearCuenta;
    @FindBy(xpath = "//*[@id=\"field-firstname\"]")
    public WebElement txtFirstName;
    @FindBy(xpath = "//*[@id=\"field-lastname\"]")
    public WebElement txtLastName;
    @FindBy(xpath = "//*[@id=\"field-email\"]")
    public WebElement txtEmail;
    @FindBy(xpath = "//*[@id=\"field-password\"]")
    public WebElement txtPassword;
    @FindBy(xpath = "//*[@id=\"customer-form\"]/div/div[5]/div/div[1]/div[1]/span/button")
    public WebElement bntMostrarPass;
    @FindBy(xpath = "//*[@id=\"field-birthday\"]")
    public WebElement txtFechNac;
    @FindBy(xpath = "//*[@id=\"customer-form\"]/div/div[7]/div[1]/span/label/input")
    public WebElement chkRecibirOfertas;
    @FindBy(xpath = "//*[@id=\"customer-form\"]/div/div[8]/div[1]/span/label/input")
    public WebElement chkAceptarTeminos;
    @FindBy(xpath = "//*[@id=\"customer-form\"]/div/div[9]/div[1]/span/label/input")
    public WebElement chkBoletin;
    @FindBy(xpath = "//*[@id=\"customer-form\"]/div/div[10]/div[1]/span/label/input")
    public WebElement chkPrivacidadDatos;
    @FindBy(xpath = "//*[@id=\"customer-form\"]/footer/button")
    public WebElement bntGuardarNuevoRegistro;
    @FindBy(xpath = "//*[@id=\"_desktop_user_info\"]/div/a[2]/span")
    public WebElement usuarioLogin;


    //
    public void clickTratamiento(){
        chkTratamiento.click();
    }

    public void clickIniciarSesion() {
        bntIniciarSesion.click();
    }

    public void clickCrearCuenta() {
        bntCrearCuenta.click();
    }

    //REGISTRO EN LA WEB
    public void registroFirstName(String texto) {
        txtFirstName.sendKeys(texto);
    }

    public void registroLastName(String texto) {
        txtLastName.sendKeys(texto);
    }

    public void registroEmail(String texto) {
        txtEmail.sendKeys(texto);
    }

    public void registroPassword(String texto) {
        txtPassword.sendKeys(texto);
    }

    public void clickMostrarPass() {
        bntMostrarPass.click();
    }

    public void registroFecNac(String texto){
        txtFechNac.sendKeys(texto);
    }

    public void clickRecibirOfertar(){
        chkRecibirOfertas.click();
    }

    public void clickAceptarTerminos(){
        chkAceptarTeminos.click();
    }

    public void clickBoletin(){
        chkBoletin.click();
    }

    public void clickPrivacidadDatos(){
        chkPrivacidadDatos.click();
    }

    public void clickGuardarNuevoRegistro(){
        bntGuardarNuevoRegistro.click();
    }

}
