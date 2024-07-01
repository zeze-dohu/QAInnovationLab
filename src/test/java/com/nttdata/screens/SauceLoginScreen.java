package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SauceLoginScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Username\"]")
    private WebElement txtUsuario;

    @AndroidFindBy(xpath = "(//android.widget.EditText)[2]")
    private WebElement txtPassword;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")
    private WebElement btnLogin;


    public void ingresarUsuario(String texto){
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(txtUsuario));

        waitFor(ExpectedConditions.elementToBeClickable(txtUsuario));


        txtUsuario.sendKeys(texto);
    }

    public void esperarElemento(WebElement elemento){
        waitFor(ExpectedConditions.elementToBeClickable(elemento));
    }

    public void ingresarClave(String arg0) {
        txtPassword.sendKeys(arg0);
    }

    public void ingresar() {
        btnLogin.click();
    }
}
