package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.MobileActionManager;
import org.testng.Assert;

import static lippia.web.constants.HomePageConstants.*;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class HomePageService extends ActionManager {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void clickShop(){
        waitVisibility(BTN_SHOP_ID);
        click(BTN_SHOP_ID);

    }

    public static void verificaPaginaDeCompra(){
        waitVisibility(TEXT_SELENIUM_RUBY);
        Assert.assertTrue(isVisible(PRECIO_SELENIUM_RUBY));
    }

    public static void verificaCantProductos(){
        Assert.assertTrue(isVisible(IMG_SELENIUM_XPATH));
        Assert.assertTrue(isVisible(IMG_THINKIN_XPATH));
        Assert.assertTrue(isVisible(IMG_MASTERING_XPATH));
    }
    public static void clickProducto(){
        waitVisibility(IMG_SELENIUM_XPATH);
        click(IMG_SELENIUM_XPATH);
    }
    public static void  clickAñadirProducto(){
        try{
          waitVisibility(BTN_ADD_BASKET_XPATH);
          click(BTN_ADD_BASKET_XPATH);
        }catch (Exception e){
            System.out.println("NO SE PUEDE AÑADIR ESE PRODUCTO AL CARRITO, NO HAY STOCK PARA ESE PRODUCTO");
        }

    }
      public static void seVerificaPrecioHeader(){
        Assert.assertNotEquals(getAttribute(TEXT_PRECIO_MENU_XPATH,"innerText"),"0.00");
      }

    public static void verificarProdcutoAgregado(){
        click(VISUALIZAR_CARRITO_XPATH);
        waitVisibility(BTN_APLICAR_CUPON_XPATH);
        waitVisibility(PRODUCTO_EN_CARRITO_XPATH);

    }
    public static void  seVisualizaValoresTotalYSubTotal(){
        Assert.assertTrue(isVisible(TEXT_TOTAL_XPATH));
        Assert.assertTrue(isVisible(TEXT_SUBTOTAL_XPATH));
    }
    public static void  verificaTotal_Subtotal(){
       double total= Double.parseDouble(getAttribute(TOTAL_XPATH,"innerText").substring(1,4));
       double subtotal= Double.parseDouble(getAttribute(SUBTOTAL_XPATH,"innerText").substring(1,4));
       double roaming= Double.parseDouble(getAttribute(ROAMING_TAX_XPATH,"innerText").substring(1,4));
       subtotal = subtotal+roaming;

       if(total<subtotal){
           System.out.println("el total es menor al subtotal");
       }


    }
    public static void  continuarPago(){
        click(BTN_CONTINUAR_PAGO_XPATH);
    }
    public static void completarFormulario(String nombre,String apellido,String nombre_empresa,String email,String telefono,String pais, String direccion,String dpto,String localidad,String cuidad,String codPostal ){
        waitVisibility(TEXT_BILLIG_DETAILS_XPATH);
        setInput(NOMBRE_ID,nombre);
        setInput(APELLIDO_ID,apellido);
        setInput(NOMBRE_COMPANIA_ID,nombre_empresa);
        setInput(EMAIL_XPATH,email);
        setInput(TELEFONO_ID,telefono);

        click(BTN_DESPLEGABLE_PAIS_ID);
        setInput(PAIS_XPATH,pais);
        click(SELECT_OPTION_XPATH);

        setInput(DIRECCION_XPATH,direccion);
        setInput(DPTO_XPATH,dpto);
        setInput(LOCALIDAD_XPATH,localidad);

        click(BTN_DESPLEGABLE_CUIDAD_ID);
        setInput(CUIDAD_XPATH,cuidad);
        click(SELECT_OPTION_XPATH);


        setInput(CODIGO_POSTAL_XPATH,codPostal);

    }
    public static void seleccionarFormaPago(String formaPago){
        if(formaPago.equals("TRANSFERECNIA BANCARIA")){
            click(TRANSFERENCIA_BANCARIA_ID);
        }
        else if(formaPago.equals("CHEQUE")){
            click(CHEQUE_ID);
        }
        else if(formaPago.equals("CONTRA REEMBOLSO")){
            click(CONTRA_REEMBOLSO_ID);
        }
        else{
            click(PAYPAL_ID);
        }
    }
    public static void seVerificaDetalles(){
        waitVisibility(TEXT_ADICIONAL_INFO_XPATH);
        Assert.assertTrue(isVisible(TEXT_ADICIONAL_INFO_XPATH));
        waitVisibility(TEXT_DETALLE_PEDIDO_XPATH);
        Assert.assertTrue(isVisible(TEXT_DETALLE_PEDIDO_XPATH));
        waitVisibility(TEXT_YOUR_ORDER_XPATH);
        Assert.assertTrue(isVisible(TEXT_YOUR_ORDER_XPATH));
    }
    public static void verificaCuponEInfoAdilcionales(){

        if(isVisible(TEXT_ADICIONAL_INFO_XPATH)&&isVisible(TEXT_DETALLE_PEDIDO_XPATH)){
            System.out.println("Existe la posibilidad de agregar informacion adicional y tambien existen detalles acerca del pedido");
        }else{
            System.out.println("No se han encotrado informacion adicional y tampoco detalles del pedido");
        }

    }
    public static void clickRealizarPedido(){
        waitVisibility(BTN_PLACE_ORDER_ID);
        click(BTN_PLACE_ORDER_ID);
    }
    public static void verificaDetallesPedidos(){
        Assert.assertTrue(isVisible(TEXT_ORDER_DETAILS_XPATH));
    }
    public static void seVerificaDetallesPedido(){
        waitVisibility(DETALLES_FACTURACION);
        Assert.assertTrue(isVisible(DETALLES_FACTURACION));
        waitVisibility(DETALLES_PEDIDO);
        Assert.assertTrue(isVisible(DETALLES_PEDIDO));

    }
    public static void enterSearchCriteria(String text) {
        setInput(INPUT_SEARCH_XPATH, text);
    }

    public static void clickSearchButton() {
        click(SEARCH_BUTTON_NAME);
    }
}
