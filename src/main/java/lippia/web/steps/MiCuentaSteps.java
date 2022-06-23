package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static lippia.web.services.MiCuentaService.*;
import static lippia.web.services.MyAccountLoginService.*;
import static lippia.web.services.ResgistroService.*;

public class MiCuentaSteps extends PageSteps {



    @And("El usuario clickea en el boton de Mi cuenta")
    public void elUsuarioClickeaEnElBotonDeMiCuenta() {
        clickMiCuenta();
    }

    @Then("Se visualiza los detalles de la cuenta")
    public void seVisualizaLosDetallesDeLaCuenta() {
        verificaDetallesCuenta();
    }

    @And("El usuario cierra sesion")
    public void elUsuarioCierraSesion() {
        clickLogout();
    }

    @And("El Usuario ingresa un '(.*)' valido en el campo login")
    public void elUsuarioIngresaUnEmailValidoEnElCampoLogin(String email) {
        ingresarUsuario(email);
    }

    @And("El Usuario ingresa un '(.*)' valido en el camo login")
    public void elUsuarioIngresaUnPasswordValidoEnElCamoLogin(String password) {
        ingresarContraseña(password);
    }

    @And("Se verifica que se haya cerrado sesion correctamente")
    public void seVerificaQueSeHayaCerradoSesionCorrectamente() {
        verificaLogoutCorrectamente();
    }
}
