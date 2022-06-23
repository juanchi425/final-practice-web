package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import org.testng.Assert;

import static lippia.web.constants.MiCuentaConstants.*;
import static lippia.web.constants.registroConstants.*;

public class MiCuentaService extends ActionManager {




    public static void  clickMiCuenta(){
        waitVisibility(BTN_ACCOUNT_DETAILS_XPATH);
         click(BTN_ACCOUNT_DETAILS_XPATH);
    }
    public static void  verificaDetallesCuenta(){
        Assert.assertTrue(isVisible(TEXT_FIRST_NAME_XPATH));
    }
    public static void clickLogout(){
        click(BTN_LOGOUT_XPATH);
    }
    public static void verificaLogoutCorrectamente(){
        Assert.assertTrue(isVisible(TEXT_REGISTER_XPATH));

    }



}
