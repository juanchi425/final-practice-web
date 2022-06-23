package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.navigateTo;
import static lippia.web.constants.HomePageConstants.*;
import static lippia.web.constants.ShopConstants.*;

public class ShopService extends ActionManager {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void clickShop(){
        waitVisibility(BTN_SHOP_ID);
        click(BTN_SHOP_ID);

    }
    public static void clickBtnAddProducto(){
        waitVisibility(BTN_ADD_BASKET_XPATH);
        click(BTN_ADD_BASKET_XPATH);

    }
    public static void  clickViewBasket(){
        waitVisibility(VIEW_BASKET_XPATH);
        click(VIEW_BASKET_XPATH);
    }
    public static void  verificaTasaExtranjero(){
        double total = Double.parseDouble(getAttribute(TOTAL_XPATH,"innerText").substring(1,6));
        double taxExtranjero = Double.parseDouble(getAttribute(TAX_XPATH,"innerText").substring(1,5));
        double calcuTax = (total * 5)/100;
        Assert.assertEquals(calcuTax,taxExtranjero);
    }
     public static void  seleccionaPaisIndia(){
         waitVisibility(BTN_DESPLEGABLE_PAIS_ID);
         click(BTN_DESPLEGABLE_PAIS_ID);
         setInput(PAIS_XPATH,"India");
         click(SELECT_INDIA);
     }

     public static void  verificaTasaIndia(){
        waitVisibility(TOTAL_XPATH);
         double total = Double.parseDouble(getAttribute(TOTAL_XPATH,"innerText").substring(1,6));
         double taxIndia = Double.parseDouble(getAttribute(TAX_XPATH,"innerText").substring(1,5));
         double calcuTax = (total * 2)/100;
         Assert.assertEquals(calcuTax,taxIndia);


     }

}
