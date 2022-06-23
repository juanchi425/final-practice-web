
Feature:Registro

    Background:
      Given El usuario se encuentra en la web Automation Practice
      When  El usuario clickea el boton My Account de la home


  Scenario Outline: El usuario ingresa una contraseña vacia
    And   El Usuario ingresa un '<email>' valido
    And   El Usuario ingresa un '<password>' vacio
    And   El usuario clickea en el boton Register
    Then  se verifica que se muestre un mensaje de error

    Examples:
      | email               | password |
      | jorgeluis@gmail.com |          |


  Scenario Outline: El usuario ingresa un correo y contraseña vacia
    And   El Usuario ingresa un '<email>' vacio
    And   El Usuario ingresa un '<password>' vacio
    And   El usuario clickea en el boton Register
    Then  se verifica que se muestre el mensaje de error correspondiente acapos vacios

    Examples:
      | email | password |
      |       |          |




