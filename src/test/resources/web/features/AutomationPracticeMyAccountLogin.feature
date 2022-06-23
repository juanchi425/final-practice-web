Feature:Login

    Background:
      Given El usuario se encuentra en la web Automation Practice
      When  El usuario clickea el boton My Account de la home


  Scenario Outline: El usuario ingresa un username erroneo
    And   El Usuario ingresa un '<username>' incorrecto
    And   El usuario ingresa una '<password>' correcta
    And   El usuario clickea en el boton Login
    Then  se verifica que se muestre un mensaje de error de username o contraseña invalida

    Examples:
      | username      | password         |
      | juan123@Gmail | JuanMtestin@2020 |





  Scenario Outline: El usuario se logea y cierra sesion, se verifica que se encuentre en la pagina general
    And   El Usuario ingresa un '<username>' correcto
    And   El usuario ingresa una '<password>' correcta
    And   El usuario clickea en el boton Login
    And   El usuario clikea en el boton Sign Out
    And   El usuario clickea el boton My Account de la home
    Then  Se verifica que el usuario no este logueado


    Examples:
      | username          | password         |
      | juanema@gmail.com | JuanMtestin@2020 |