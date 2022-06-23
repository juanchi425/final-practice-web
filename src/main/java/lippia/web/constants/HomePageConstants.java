package lippia.web.constants;

public class HomePageConstants {

    public static final String INPUT_SEARCH_XPATH = "xpath://input[@class='gLFyf gsfi']";
    public static final String SEARCH_BUTTON_NAME = "name:btnK";
    public static final String STATS_ID = "id:rcnt";

   public static final String TEXT_SELENIUM_RUBY="xpath://h1[text()='Selenium Ruby']";
  public static final String PRECIO_SELENIUM_RUBY="xpath:(//span[contains(@class,'amount')])[2]";

   public static final String TEXT_PRECIO_MENU_XPATH="xpath://span[contains(@class,'amount')][1]";
    public static final String BTN_SHOP_ID= "id:menu-item-40";

    public static final String BTN_HOME_XPATH= "xpath://a[text()='Home']";
    public static final String TEXT_ORDER_DETAILS_XPATH="xpath://h2[text()='Order Details']";
    public static final String BTN_PLACE_ORDER_ID="id:place_order";
    public static final String IMG_SELENIUM_XPATH="xpath://img[@title='Selenium Ruby']";
    public static final String IMG_THINKIN_XPATH="xpath://img[@title='Thinking in HTML']";
    public static final String IMG_MASTERING_XPATH="xpath://img[@title='Mastering JavaScript']";
    public static final String BTN_PRODUCTO_XPATH= "xpath://*[@id=\"content\"]/ul/li[2]/a[2]";
    public static final String IMG_PRODUCTO_XPATH= "xpath://*[@id=\"content\"]/ul/li[2]/a[1]";

    public static final String BTN_ADD_BASKET_XPATH="xpath://a[contains(@class,'button')][1]";
    public static final String VISUALIZAR_CARRITO_XPATH="xpath://a[text()='View Basket']";
    public static final String PRODUCTO_EN_CARRITO_XPATH="xpath://a[text()='Functional Programming in JS']";
    public static final String TEXT_CLICK_CUPON_XPATH="xpath://a[@class='showcoupon']";
    public static final String BTN_APLICAR_CUPON_XPATH="xpath://input[@name='apply_coupon']";
    public static final String CONTAINER_CUPON="xpath://*[@id=\"page-35\"]/div/div[1]/div[2]";
    public static final String TEXT_ADICIONAL_INFO_XPATH="xpath://h3[text()='Additional Information']";
    public static final String TEXT_DETALLE_PEDIDO_XPATH="xpath://h3[text()='Billing Details']";
    public static final String TEXT_YOUR_ORDER_XPATH ="xpath://h3[text()='Your order']";

    //Formas de pago
    public static final String TRANSFERENCIA_BANCARIA_ID="id:payment_method_bacs";
    public static final String CHEQUE_ID="id:payment_method_cheque";
    public static final String CONTRA_REEMBOLSO_ID="id:payment_method_cod";
    public static final String PAYPAL_ID="id:payment_method_ppec_paypal";
    //..........................



    public static final String TOTAL_XPATH="xpath:(//span[contains(@class,'amount')])[3]";
    public static final String TEXT_SUBTOTAL_XPATH="xpath://th[text()='Subtotal']";
    public static final String TEXT_TOTAL_XPATH="xpath://th[text()='Total']";
    public static final String SUBTOTAL_XPATH="xpath:(//span[contains(@class,'amount')])[4]";
    public static final String ROAMING_TAX_XPATH="xpath:(//span[contains(@class,'amount')])[5]";

    public static final String BTN_CONTINUAR_PAGO_XPATH="xpath:(//a[contains(@class,'button')])[1]";

    public static final String TEXT_BILLIG_DETAILS_XPATH="xpath://h3[text()='Billing Details']";

    //DATOS FORMULARIO
    public static final String NOMBRE_ID="id:billing_first_name";
    public static final String APELLIDO_ID="id:billing_last_name";
    public static final String NOMBRE_COMPANIA_ID="id:billing_company";
    public static final String EMAIL_XPATH="xpath:(//input[contains(@class,'input-text')])[7]";
    public static final String TELEFONO_ID="id:billing_phone";
    public static final String BTN_DESPLEGABLE_PAIS_ID="id:select2-chosen-1";
    public static final String PAIS_XPATH="xpath://*[@id=\"s2id_autogen1_search\"]";
    public static final String SELECT_OPTION_XPATH="xpath://span[@class='select2-match']";
    public static final String DIRECCION_XPATH="xpath:(//input[contains(@class,'input-text')])[9]";
    public static final String DPTO_XPATH="xpath:(//input[contains(@class,'input-text')])[10]";
    public static final String BTN_DESPLEGABLE_CUIDAD_ID="id:select2-chosen-2";
    public static final String LOCALIDAD_XPATH="xpath:(//input[contains(@class,'input-text')])[11]";

    public static final String CUIDAD_XPATH="xpath://*[@id=\"s2id_autogen2_search\"]";
    public static final String CODIGO_POSTAL_XPATH="xpath:(//input[contains(@class,'input-text')])[12]";


    public static final String DETALLES_FACTURACION ="xpath:(//ul[contains(@class,'order_details')])[1]";
    public static final String DETALLES_PEDIDO ="xpath://h2[text()='Order Details']";









}
