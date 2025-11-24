Feature: Product - Store

  Scenario: Crear una cuenta en la web qalab
    Given estoy en la pagina de la tienda
    When doy click en la opcion iniciar sesion
    And doy click en el link text cree una cuenta aqui
    And lleno los campos del formulario para el registro
    And doy click en el boton guardar
    Then deberia visualizar mi usuario logeado en la pantalla

    Scenario: Realizar el login en la web qalab
      Given estoy en la pagina de la tienda
      When doy click en la opcion iniciar sesion
      And ingreso mi usuario y contraseña registrado
      And doy click en el boton iniciar sesion
      Then deberia visualizar mi usuario logeado en la pantalla

