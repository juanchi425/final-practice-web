package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import static lippia.web.services.HomePageService.*;
import lippia.web.services.GoogleSearchResultService;

public class HomePageSteps extends PageSteps {


    @Given("El usuario se encuentra en la web Automation Practice")
    public void elUsuarioSeEncuentraEnLaWebAutomationPractice() {
        navegarWeb();
    }
    @When("El usuario clickea el boton Shop de la home")
    public void elUsuarioClickeaElBotonShopDeLaHome() {
        clickShop();
    }
    @And("El usuario clikea en el boton Home")
    public void elUsuarioClikeaEnElBotonHome() {
    }
    @And("Se verifica que la pagina de la Home tenga tres productos")
    public void seVerificaQueLaPaginaDeLaHomeTengaTresProductos() {
        verificaCantProductos();
    }
    @And("El usuario clickea en la imagen de Selenium Ruby")
    public void elUsuarioClickeaEnLaImagenDeSeleniumRuby() {
        clickProducto();
    }
    @And("El usuario Selecciona el boton Añadir a carrito")
    public void elUsuarioSeleccionaElBotonAñadirACarrito() {
        clickAñadirProducto();
    }


    @And("El usuario verifica que se haya añadido al carrito")
    public void elUsuarioVerificaQueSeHayaAñadidoAlCarrito() {
        verificarProdcutoAgregado();

    }


    @And("Se Verifica que el total sea menor al subtotal")
    public void seVerificaQueElTotalSeaMenorAlTotal() {
        verificaTotal_Subtotal();

    }

    @And("El usuario clikea en el boton continuar con el pago")
    public void elUsuarioClikeaEnElBotonContinuarConElPago() {
        continuarPago();
    }
    @And("El usuario Completa el formulario con sus datos '(.*)' and '(.*)' and'(.*)' and'(.*)' and'(.*)' and'(.*)' and'(.*)' and'(.*)' and '(.*)' and'(.*)' and'(.*)'")
    public void elUsuarioCompletaElFormularioConSusDatosNombreAndApellidoAndNombreEmpresaAndEmailAndTelefonoAndPaisAndDireccionAndDptoAndLocalidadAndCuidadAndCodigoPostal(String nombre,String apellido,String nombre_empresa,String email,String telefono,String pais, String direccion,String dpto,String localidad,String cuidad,String codPostal ) {
        completarFormulario(nombre,apellido,nombre_empresa,email,telefono,pais,direccion,dpto,localidad,cuidad,codPostal);

    }
    @And("El usario selecciona forma de pago '(.*)'")
    public void elUsarioSeleccionaFormaDePagoTipoDePago(String formaPago) {
        seleccionarFormaPago(formaPago);
    }


    @Then("El cliente verifica que exista la posibilidad de agregar un cupon de pago,informacion adicional y visualizar detalles de pedido")
    public void elClienteVerificaQueExistaLaPosibilidadDeAgregarUnCuponDePagoInformacionAdicionalYVisualizarDetallesDePedido() {
        verificaCuponEInfoAdilcionales();
    }


    @And("El usuario clickea el boton de relaizar pedido")
    public void elUsuarioClickeaElBotonDeRelaizarPedido() {
        clickRealizarPedido();
    }

    @Then("Se verifica que se visualizen los detalles del pedido")
    public void seVerificaQueSeVisualizenLosDetallesDelPedido() {
        verificaDetallesPedidos();
    }



    @And("Se verifica que el precio  se haya añadido al elemento del header")
    public void seVerificaQueElPrecioSeHayaAñadidoAlElementoDelHeader() {
        seVerificaPrecioHeader();
    }

    @And("El usuario  puede visualizar valores totales y subtotales")
    public void elUsuarioPuedeVisualizarValoresTotalesYSubtotales() {
        seVisualizaValoresTotalYSubTotal();
    }

    @And("El usuario puede ver los detalles de facturación, los detalles del pedido, los detalles adicionales y los detalles de la pasarela de pago.")
    public void elUsuarioPuedeVerLosDetallesDeFacturaciónLosDetallesDelPedidoLosDetallesAdicionalesYLosDetallesDeLaPasarelaDePago() {
              seVerificaDetalles();
    }


    @Then("El usuario navega a la página de confirmación del pedido con detalles del pedido, detalles bancarios, detalles del cliente y detalles de facturación")
    public void elUsuarioNavegaALaPáginaDeConfirmaciónDelPedidoConDetallesDelPedidoDetallesBancariosDetallesDelClienteYDetallesDeFacturación() {
        seVerificaDetallesPedido();
    }

    @And("Se verifica que está navegando a la página  donde el usuario puede agregar ese libro al carrito.")
    public void seVerificaQueEstáNavegandoALaPáginaDondeElUsuarioPuedeAgregarEseLibroAlCarrito() {
        verificaPaginaDeCompra();
    }
}
