package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static lippia.web.services.MyAccountLoginService.*;
import static lippia.web.services.ResgistroService.*;

public class RegistroSteps extends PageSteps {

    @And("El Usuario ingresa un '(.*)' valido")
    public void elUsuarioIngresaUnEmailValido(String email) {
        ingresarEmail(email);
    }


    @And("El usuario clickea en el boton Register")
    public void elUsuarioClickeaEnElBotonRegister() {
        clickRegister();
    }

    @Then("se verifica que se muestre un mensaje de error")
    public void seVerificaQueSeMuestreUnMensajeDeError() {
        validarErrorRegistro();
    }





    @And("El Usuario ingresa un '(.*)' vacio")
    public void elUsuarioIngresaUnPasswordVacio(String password) {
        ingresarPassword(password);
    }

    @Then("se verifica que se muestre el mensaje de error correspondiente acapos vacios")
    public void seVerificaQueSeMuestreElMensajeDeErrorCorrespondienteAcaposVacios() {
        validarErrorCamposVacios();
    }
}
