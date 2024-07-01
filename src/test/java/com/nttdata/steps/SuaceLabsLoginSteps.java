package com.nttdata.steps;

import com.nttdata.screens.SauceLoginScreen;

public class SuaceLabsLoginSteps {
    SauceLoginScreen login;


    public void ingresoElUsuario(String usuario) {
        login.ingresarUsuario(usuario);

    }

    public void ingresarClave(String arg0) {
        login.ingresarClave(arg0);
    }

    public void ingresar() {
        login.ingresar();
    }
}
