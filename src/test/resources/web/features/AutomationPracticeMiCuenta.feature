
Feature:Mi Cuenta

    Background:
      Given El usuario se encuentra en la web Automation Practice
      When  El usuario clickea el boton My Account de la home


  Scenario Outline: El usuario ingresa a su cuenta y visualiza los detalles desu cuenta
    And   El Usuario ingresa un '<email>' valido en el campo login
    And   El Usuario ingresa un '<password>' valido en el camo login
    And   El usuario clickea en el boton Login
    And   El usuario clickea en el boton de Mi cuenta
    Then  Se visualiza los detalles de la cuenta



    Examples:
      | email             | password         |
      | juanema@gmail.com | JuanMtestin@2020 |



  Scenario Outline: El usuario ingresa a su cuenta y visualiza los detalles desu cuenta y cierra sesion correctamente
    And   El Usuario ingresa un '<email>' valido en el campo login
    And   El Usuario ingresa un '<password>' valido en el camo login
    And   El usuario clickea en el boton Login
    And   El usuario clickea en el boton de Mi cuenta
    Then  Se visualiza los detalles de la cuenta
    And   El usuario cierra sesion
    And   Se verifica que se haya cerrado sesion correctamente


    Examples:
      | email             | password         |
      | juanema@gmail.com | JuanMtestin@2020 |







