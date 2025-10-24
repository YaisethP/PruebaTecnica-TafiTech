# PARTE 1 - TESTING MANUAL - SAUCEDEMO

## ESCENARIOS CRÍTICOS

### 1. Inicio de sesión exitoso
- **Por qué es crítico:** Es el punto de entrada de todos los usuarios. Si el login falla, no se puede acceder a la tienda.  
- **Pasos para probar:**  
  1. Ingresar a [https://www.saucedemo.com/](https://www.saucedemo.com/)  
  2. Ingresar credenciales válidas (`standard_user` / `secret_sauce`)  
  3. Hacer clic en el botón “Login”.  
- **Resultado esperado:** El usuario debe ingresar al inventario sin errores y visualizar los productos disponibles.

---

### 2. Agregar producto al carrito y validar contenido
- **Por qué es crítico:** Es el flujo principal de compra; garantiza que los productos seleccionados se agregan correctamente.  
- **Pasos para probar:**  
  1. Iniciar sesión con un usuario válido.  
  2. En la pantalla de inventario, hacer clic en “Add to cart” en un producto.  
  3. Hacer clic en el ícono del carrito.  
- **Resultado esperado:** El producto agregado se visualiza en el carrito con su nombre, precio y cantidad correctos.

---

### 3. Flujo de compra completo (checkout)
- **Por qué es crítico:** Valida que el proceso de compra pueda completarse sin errores.  
- **Pasos para probar:**  
  1. Iniciar sesión con un usuario válido.  
  2. Agregar uno o más productos al carrito.  
  3. Entrar al carrito → “Checkout”.  
  4. Ingresar información de envío válida y continuar.  
  5. Finalizar la compra.  
- **Resultado esperado:** El sistema muestra el mensaje de confirmación “Thank you for your order!”.

---

## CASOS EDGE

### 1. Intentar iniciar sesión sin credenciales
- **Qué podría salir mal:** El sistema podría permitir el acceso o no mostrar un mensaje de error claro.  
- **Cómo lo probarías:**  
  - Dejar usuario y contraseña vacíos y presionar “Login”.  
  - Verificar mensaje de error y bloqueo de acceso.  
- **Resultado esperado:** Se debe mostrar un mensaje como “Username is required” y no permitir ingresar.

---

### 2. Usuario con error simulado (“error_user”)
- **Qué podría salir mal:** Este usuario está diseñado para generar fallos en la interfaz (imágenes no cargan, botones fallan, etc.).  
- **Cómo lo probarías:**  
  - Iniciar sesión con `error_user / secret_sauce`.  
  - Navegar por el inventario y validar comportamiento visual y funcional.  
- **Resultado esperado:** El sistema debe manejar los errores visuales sin romper la experiencia ni generar bloqueos.

---

## BUGS ENCONTRADOS

### 1. Botón “Add to cart” no cambia a “Remove” de forma consistente (intermitente)
- **Severidad:** Media  
- **Pasos para reproducir:**  
  1. Iniciar sesión con `standard_user`.  
  2. Agregar varios productos al carrito rápidamente.  
  3. Observar que en algunos casos el botón no cambia su estado o lo hace con retardo.  
- **Resultado esperado:** Cada producto agregado debe cambiar inmediatamente su botón a “Remove”.  
- **Resultado actual:** El botón a veces mantiene el texto “Add to cart” a pesar de estar agregado.  
- **Evidencia:** [opcional - screenshot o video corto]
