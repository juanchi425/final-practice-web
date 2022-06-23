package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static lippia.web.services.MyAccountLoginService.*;

public class MyAccountLoginSteps extends PageSteps {


    @When("El usuario clickea el boton My Account de la home")
    public void elUsuarioClickeaElBotonMyAccountDeLaHome() {
        clickMyAccount();
    }

    @And("El Usuario ingresa un '(.*)' incorrecto")
    public void elUsuarioIngresaUnUsernameIncorrecto(String username) {
        ingresarUsuario(username);
    }

    @And("El usuario ingresa una '(.*)' correcta")
    public void elUsuarioIngresaUnaContraseñaCorrecta(String password) {
        ingresarContraseña(password);
    }

    @And("El usuario clickea en el boton Login")
    public void elUsuarioClickeaEnElBotonLogin() {
        clickLogin();
    }


    @Then("se verifica que se muestre un mensaje de error de username o contraseña invalida")
    public void seVerificaQueSeMuestreUnMensajeDeErrorDeUsernameOContraseñaInvalida() {
        validarError();
    }

    @And("El Usuario ingresa un '(.*)' correcto")
    public void elUsuarioIngresaUnUsernameCorrecto(String username) {
        ingresarUsuario(username);
    }

    @And("El usuario clikea en el boton Sign Out")
    public void elUsuarioClikeaEnElBotonSignOut() {
        clickSignOut();
    }

    @Then("Se verifica que el usuario no este logueado")
    public void seVerificaQueElUsuarioNoEsteLogueado() {
        verificarUsuarioNoLogueado();
    }
}
