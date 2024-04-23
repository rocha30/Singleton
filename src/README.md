# Singleton Pattern Example

Este programa Java demuestra el uso del patrón Singleton para garantizar que una clase tenga una única instancia y proporciona un punto de acceso global a esa instancia. En este caso, la clase `Appconfig` se implementa como un Singleton para almacenar la configuración de la aplicación.

## Uso del programa

El programa consta de dos clases:

- **Main.java**: Contiene el método `main` donde se realiza la demostración del patrón Singleton.
- **Appconfig.java**: La clase Singleton `Appconfig` que almacena la configuración de la aplicación.

## Ejecución

1. Clona el repositorio o descarga los archivos `Main.java` y `Appconfig.java`.
2. Compila el programa ejecutando `javac Main.java`.
3. Ejecuta el programa con `java Main`.

## Funcionalidad

El programa realiza las siguientes operaciones:

1. Obtiene la instancia única de `Appconfig` utilizando el método `getInstance()`.
2. Establece y obtiene valores para `serverUrl`, `id` y `name`.
3. Imprime los valores establecidos y recuperados para demostrar el funcionamiento del Singleton.

## Notas

- La clase `Appconfig` tiene un constructor privado y un método estático `getInstance()` que devuelve la única instancia de la clase.
- La instancia se crea solo si aún no existe.
- Se utiliza sincronización para garantizar que la creación de la instancia sea segura en entornos multi-hilo.
