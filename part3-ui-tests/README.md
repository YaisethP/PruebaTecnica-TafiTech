## *SauceDemo – Automatización UI con Serenity BDD + Screenplay*

## 1. Descripción del proyecto

Este proyecto automatiza pruebas end-to-end para el sitio SauceDemo usando:
1. Serenity BDD 4.0.12
2. Cucumber 7.14.0
3. Selenium 4.17.0
4. Screenplay Pattern
5. Chrome en modo incógnito

Se incluyen dos escenarios principales:
1. Flujo exitoso: login válido → agregar producto al carrito → validar producto en carrito.
2. Edge case / negativo: login con usuario bloqueado → validar mensaje de error.

## 2. Estructura del proyecto
src
 ├── main
 │   └── java
 │       └── saucedemo
 │           ├── interactions
 │           ├── tasks
 │           ├── questions
 │           ├── userinterfaces
 │           └── utils
 └── test
     ├── java
     │   └── saucedemo
     │       ├── runners
     │       └── stepdefinitions
     └── resources
         └── features
















