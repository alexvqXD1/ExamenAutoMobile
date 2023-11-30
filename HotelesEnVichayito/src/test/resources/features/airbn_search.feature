Feature: Búsqueda en Airbnb

  @test
  Scenario: Busqueda de hospedaje en Vichayito

    Given Ingreso a la aplicacion y cierro las ventanas popup
    When dentro del formulario Where to? realizo la busqueda "Vichayito"
    And Selecciono la primera busqueda
    And Selecciono Skip
    And Selecciono Search
    Then debe de aparecer en pantalla "Over 1,000 places"
    And debe de haber almenos algun resultado
