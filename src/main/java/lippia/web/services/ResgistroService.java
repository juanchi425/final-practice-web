package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import org.testng.Assert;

import static lippia.web.constants.HomePageConstants.TOTAL_XPATH;
import static lippia.web.constants.registroConstants.*;

public class ResgistroService extends ActionManager {


     public static void  ingresarEmail(String email){
         waitVisibility(TEXBOX_EMAIL);
         setInput(TEXBOX_EMAIL,email);
     }
    public static void  ingresarPassword(String password){
        waitVisibility(TEXBOX_PASSWORD);
        setInput(TEXBOX_PASSWORD,password);
    }

    public static void  clickRegister(){
        waitVisibility(BTN_REGISTER);
         click(BTN_REGISTER);
    }

    public static void validarErrorRegistro(){
        Assert.assertEquals(getAttribute(TEXT_ERROR,"innerText"),"Error: Please enter an account password.");
     }
    public static void validarErrorCamposVacios(){
        Assert.assertEquals(getAttribute(TEXT_ERROR,"innerText"),"Error: Please provide a valid email address.");
    }



}
