# Proyecto: Mostrar Usuarios desde API con Jetpack Compose

Este proyecto utiliza **Retrofit** para consumir datos de usuarios desde la API `https://jsonplaceholder.typicode.com/users` y muestre los resultados.

---

## Estructura del Proyecto

El proyecto está dividido en las siguientes partes:

1. **Configuración de Retrofit**: Para manejar las llamadas a la API.
2. **Modelo de Datos**: Representación de los datos de los usuarios.
3. **Pantalla Principal**: Composición de la lista de usuarios.
4. **Actividad Principal**: Punto de entrada de la aplicación.

---

## Dependencias
```gradle
    implementation (libs.retrofit)
    implementation (libs.converter.gson)
    implementation (libs.androidx.activity.ktx)
    implementation (libs.androidx.lifecycle.viewmodel.ktx)
