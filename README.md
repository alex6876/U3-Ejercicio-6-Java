Aquí tienes la estructura en formato Markdown lista para el `README.md` de este código de **Simulación de Gestión de Usuarios y Autenticación (Encapsulamiento y Seguridad en Java)**, manteniendo el enfoque exclusivo de **Programación Orientada a Objetos en memoria** (sin bases de datos):

---

# 👤 Simulación de Gestión de Usuarios y Autenticación (Encapsulamiento y Seguridad en Java)

Este proyecto es una aplicación en Java que modela el registro y control de credenciales de acceso para usuarios de un sistema. Pone en práctica conceptos clave de la **Programación Orientada a Objetos (POO)** como el **encapsulamiento de atributos privados**, el manejo seguro de contraseñas y la validación de operaciones de seguridad en memoria.

---

## 🧩 Clases y Estructura del Sistema

El diseño del software se organiza a través de una clase de dominio encapsulada y un punto de ejecución:

* **`Usuario`**: Modela la entidad de perfil de usuario y protege la confidencialidad de su información personal y claves de acceso.
* **Atributos privados (`private`)**: `nombreUsuario`, `email` y `password`, impidiendo el acceso directo o la visualización/modificación no autorizada desde fuera de la clase.
* **Constructor**: Inicializa el perfil del usuario asignando el nombre, el correo electrónico y la contraseña inicial.
* **Métodos operativos de negocio**:
* `cambiarPassword(String passwordActual, String nuevaPassword)`: Comprueba que la contraseña actual ingresada coincida con la registrada. Si es correcta, actualiza el valor por la nueva clave.
* `validarCredenciales(String passwordIngresada)`: Evalúa si la clave proporcionada coincide con la contraseña activa del usuario, otorgando o denegando el acceso.




* **`Main`**: Punto de entrada del programa. Instancia múltiples usuarios con credenciales predeterminadas, simula intentos de cambio de contraseña exitosos y erróneos, y comprueba la validez de los accesos por consola.

---

## ⚙️ Reglas de Negocio y Control de Validación

1. **Verificación de Autenticidad en Cambios de Clave:** El método `cambiarPassword` implementa una validación estricta exigiendo la contraseña actual (`passwordActual.equals(password)`) antes de permitir cualquier modificación.
2. **Protección de Datos Sensibles:** Al declarar la contraseña como un campo privado (`private`), se evita la exposición de información crítica de seguridad fuera de las fronteras de la clase.
3. **Control de Intentos de Acceso:** El método `validarCredenciales` procesa de forma segura la entrada del usuario, informando por consola el estado del inicio de sesión y retornando un indicador booleano (`true` o `false`).

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera el siguiente resultado:

```text
--- Usuario 1 ---
Contraseña cambiada correctamente.
Se ingresó a la cuenta correctamente.
--- Usuario 2 ---
Error: Validación incorrecta.
Acceso incorrecto.

```

---

## 🚀 Conceptos de Programación Aplicados

* **Encapsulamiento Estricto:** Ocultamiento de la contraseña y datos personales del usuario, exponiendo únicamente métodos seguros de interacción (`cambiarPassword` y `validarCredenciales`).
* **Seguridad Basada en Objetos:** Cada instancia de usuario administra su propio estado de autenticación de forma independiente y aislada.
* **Diseño Modular:** Clara separación entre la lógica de autenticación del usuario (`Usuario`) y la ejecución de casos de prueba (`Main`).
