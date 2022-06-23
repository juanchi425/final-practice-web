Feature: El usuario añade un producto al carrito y realiza el pedido

  Background:
    Given El usuario se encuentra en la web Automation Practice
    When  El usuario clickea el boton Shop de la home


  Scenario Outline: El usuario añade un producto al carrito y realiza el pedido
    And   El usuario agrega el libro de Android Quick Start Guide al carrito
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

  @Prueba
  Scenario Outline: El usuario añade un producto y se verifica que la tasa de impuesto para la india sea del 2% y para el extranjero 5%
    And   El usuario agrega el libro de Android Quick Start Guide al carrito
    And   Se verifica que el precio  se haya añadido al elemento del header
    And   El usuario clikea en el boton view basquet para proceder a la pagina de pago
    And   El usuario  puede visualizar valores totales y subtotales
    And   Se Verifica que el total sea menor al subtotal
    And   El usuario clikea en el boton continuar con el pago
    And   El usuario puede ver los detalles de facturación, los detalles del pedido, los detalles adicionales y los detalles de la pasarela de pago.
    And   El usuario Completa el formulario con sus datos '<Nombre>' and '<Apellido>' and'<Nombre Empresa>' and'<email>' and'<telefono>' and'<pais>' and'<direccion>' and'<Dpto>' and '<Localidad>' and'<Cuidad>' and'<Codigo Postal>'
    And   Se verifica que la tasa de impuesto para extranjero sea del cinco porciento
    And   El usuario Selecciona el pais de india
    Then  Se verifica que la tasa de impuesto para la india sea del dos porciento


    Examples:
      | Nombre | Apellido | Nombre Empresa | email       | telefono | pais      | direccion | Dpto | Localidad  | Cuidad     | Codigo Postal | Tipo de Pago |
      | Juan   | Martinez | eNova          | juan@22.com | 3939302  | Argentina | rioja 232 | 2    | Corrientes | Corrientes | 3400          | CHEQUE       |