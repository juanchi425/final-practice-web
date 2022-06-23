package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static lippia.web.services.HomePageService.*;
import static lippia.web.services.ShopService.*;

public class ShopSteps extends PageSteps {


    @And("El usuario agrega el libro de Android Quick Start Guide al carrito")
    public void elUsuarioAgregaElLibroDeAndroidQuickStartGuideAlCarrito() {
        clickBtnAddProducto();
    }
    @And("El usuario clikea en el boton view basquet para proceder a la pagina de pago")
    public void elUsuarioClikeaEnElBotonViewBasquetParaProcederALaPaginaDePago() {
        clickViewBasket();
    }


    @And("Se verifica que la tasa de impuesto para extranjero sea del cinco porciento")
    public void seVerificaQueLaTasaDeImpuestoParaExtranjeroSeaDelCincoPorciento() {
        verificaTasaExtranjero();
    }

    @Then("Se verifica que la tasa de impuesto para la india sea del dos porciento")
    public void seVerificaQueLaTasaDeImpuestoParaLaIndiaSeaDelDosPorciento() {
        verificaTasaIndia();
    }

    @And("El usuario Selecciona el pais de india")
    public void elUsuarioSeleccionaElPaisDeIndia() {
        seleccionaPaisIndia();
    }
}
