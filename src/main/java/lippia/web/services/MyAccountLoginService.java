package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.navigateTo;
import static lippia.web.constants.MyAccountLoginConstants.*;

public class MyAccountLoginService extends ActionManager {


     public static void  clickMyAccount(){
         waitVisibility(BTN_MY_ACCOUNT_XPATH);
         click(BTN_MY_ACCOUNT_XPATH);
     }
     public static void  ingresarUsuario(String username){
         waitVisibility(TEXTBOX_USERNAME_XPATH);
         setInput(TEXTBOX_USERNAME_XPATH,username);
     }
    public static void  ingresarContraseña(String password){
        waitVisibility(TEXTBOX_PASSWORD_XPATH);
        setInput(TEXTBOX_PASSWORD_XPATH,password);
    }
    public static void  clickLogin(){
         click(BTN_LOGIN_XPATH);
    }

    public static void validarError(){
        waitVisibility(ERROR_XPATH);
    }
    public static void  clickSignOut(){
        waitVisibility(BTN_SIGN_OUT_XPATH);
        click(BTN_SIGN_OUT_XPATH);
    }

    public static void verificarUsuarioNoLogueado(){
        Assert.assertTrue(isVisible(TEXT_LOGIN_XPATH));
    }


    public static void enterSearchCriteria(String text) {
        setInput(INPUT_SEARCH_XPATH, text);
    }

    public static void clickSearchButton() {
        click(SEARCH_BUTTON_NAME);
    }
}
