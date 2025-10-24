@ui @saucedemo
Feature: Automatización de pruebas de Saucedemo

  Scenario: Flujo exitoso de compra
    Given el usuario está en la página de login
    When el usuario inicia sesión con credenciales válidas
    And agrega un producto al carrito
    Then el producto debería aparecer en el carrito

  Scenario: Login fallido con usuario inválido
    Given el usuario está en la página de login
    When el usuario intenta iniciar sesión con credenciales inválidas
    Then debería ver un mensaje de error indicando que el login falló
