Feature: El usuario añade un producto al carrito,completa el formulario correctamente y realiza un pedido

  Background:
    Given El usuario se encuentra en la web Automation Practice
    When  El usuario clickea el boton Shop de la home


  Scenario Outline: El usuario añade un producto al carrito y completa el formulario con sus datos
    And   El usuario clikea en el boton Home
    And   Se verifica que la pagina de la Home tenga tres productos
    And   El usuario clickea en la imagen de Selenium Ruby
    And   Se verifica que está navegando a la página  donde el usuario puede agregar ese libro al carrito.
    And   El usuario Selecciona el boton Añadir a carrito
    And   Se verifica que el precio  se haya añadido al elemento del header
    And   El usuario clikea en el boton view basquet para proceder a la pagina de pago
    And   El usuario  puede visualizar valores totales y subtotales
    And   Se Verifica que el total sea menor al subtotal
    And   El usuario clikea en el boton continuar con el pago
    And   El usuario puede ver los detalles de facturación, los detalles del pedido, los detalles adicionales y los detalles de la pasarela de pago.
    And   El usuario Completa el formulario con sus datos '<Nombre>' and '<Apellido>' and'<Nombre Empresa>' and'<email>' and'<telefono>' and'<pais>' and'<direccion>' and'<Dpto>' and '<Localidad>' and'<Cuidad>' and'<Codigo Postal>'
    And   El usario selecciona forma de pago '<Tipo de Pago>'
    Then  El cliente verifica que exista la posibilidad de agregar un cupon de pago,informacion adicional y visualizar detalles de pedido


    Examples:
      | Nombre | Apellido | Nombre Empresa | email       | telefono | pais      | direccion | Dpto | Localidad  | Cuidad     | Codigo Postal | Tipo de Pago |
      | Juan   | Martinez | eNova          | juan@22.com | 3939302  | Argentina | rioja 232 | 2    | Corrientes | Corrientes | 3400          | CHEQUE       |


  Scenario Outline: El usuario realiza un pedido correctamente
    And   El usuario clikea en el boton Home
    And   Se verifica que la pagina de la Home tenga tres productos
    And   El usuario clickea en la imagen de Selenium Ruby
    And   Se verifica que está navegando a la página  donde el usuario puede agregar ese libro al carrito.
    And   El usuario Selecciona el boton Añadir a carrito
    And   Se verifica que el precio  se haya añadido al elemento del header
    And   El usuario clikea en el boton view basquet para proceder a la pagina de pago
    And   El usuario  puede visualizar valores totales y subtotales
    And   Se Verifica que el total sea menor al subtotal
    And   El usuario clikea en el boton continuar con el pago
    And   El usuario puede ver los detalles de facturación, los detalles del pedido, los detalles adicionales y los detalles de la pasarela de pago.
    And   El usuario Completa el formulario con sus datos '<Nombre>' and '<Apellido>' and'<Nombre Empresa>' and'<email>' and'<telefono>' and'<pais>' and'<direccion>' and'<Dpto>' and '<Localidad>' and'<Cuidad>' and'<Codigo Postal>'
    And   El usario selecciona forma de pago '<Tipo de Pago>'
    And   El usuario clickea el boton de relaizar pedido
    Then  El usuario navega a la página de confirmación del pedido con detalles del pedido, detalles bancarios, detalles del cliente y detalles de facturación

    Examples:
      | Nombre | Apellido | Nombre Empresa | email       | telefono | pais      | direccion | Dpto | Localidad  | Cuidad     | Codigo Postal | Tipo de Pago |
      | Juan   | Martinez | eNova          | juan@22.com | 3939302  | Argentina | rioja 232 | 2    | Corrientes | Corrientes | 3400          | CHEQUE       |


