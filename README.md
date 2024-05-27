# AndroidMaster
La aplicación en el repositorio ADRIELCELSOROSALES/AndroidMaster es un proyecto Android multifacético que incluye varias mini-aplicaciones, cada una demostrando diferentes aspectos y funcionalidades de desarrollo en Android. A continuación, se detalla la documentación de las principales características y componentes de la aplicación:

##   Configuración del Proyecto
El proyecto utiliza Kotlin como lenguaje de programación y está configurado para compilar con el SDK 34 de Android. Utiliza Gradle Kotlin DSL (build.gradle.kts) para la configuración de compilación, lo que permite una sintaxis más expresiva y la capacidad de usar características de Kotlin en los scripts de compilación.
```bash
plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}
```
## Componentes Principales
### 1. Actividades y Navegación
El proyecto define varias actividades, cada una correspondiendo a una mini-aplicación o funcionalidad específica dentro del proyecto. La navegación entre estas actividades se realiza mediante intents explícitos.

**firstAppActivity**: Una actividad simple que recoge un nombre de usuario y lo pasa a otra actividad para mostrarlo.
```bash
val intent = Intent(this, ResultActivity::class.java)
intent.putExtra("EXTRA_NAME", name)
startActivities(arrayOf(intent))
```
**SettingActivity**: Demuestra el uso de DataStore para almacenar y recuperar preferencias del usuario, como el volumen, la vibración, el modo oscuro y el estado del Bluetooth.
```bash
private suspend fun saveVolume(value: Int) {
    dataStore.edit { preferences ->
        preferences[intPreferencesKey(VOLUME_LVL)] = value
    }
}
```

### 2. DataStore para Preferencias
Utiliza DataStore para manejar las preferencias del usuario de manera asíncrona y segura, reemplazando el uso de SharedPreferences para un manejo más moderno y eficiente de datos.

### 3. View Binding
El proyecto habilita el View Binding para facilitar la interacción con las vistas sin necesidad de findViewById, mejorando así la seguridad de tipo y la claridad del código.
```bash
viewBinding {
  enable = true
}
```

### 4. Retrofit para Consumo de API
Incluye dependencias para Retrofit y Gson, preparando el proyecto para consumir APIs REST de manera eficiente y convertir las respuestas JSON en objetos Kotlin.
```bash
implementation("com.squareup.retrofit2:retrofit:2.9.0")
implementation("com.squareup.retrofit2:converter-gson:2.9.0")
```

### 5. Diseño y Estilos
El proyecto define una serie de recursos como colores, strings y estilos, que se utilizan a lo largo de las diferentes actividades para mantener una consistencia visual y facilitar cambios globales.

## Conclusiones
El repositorio ADRIELCELSOROSALES/AndroidMaster es un compendio de mini-aplicaciones que demuestran el uso de diversas tecnologías y prácticas recomendadas en el desarrollo de aplicaciones Android modernas. Desde el manejo de preferencias del usuario con DataStore, pasando por la navegación entre actividades, hasta el consumo de servicios web con Retrofit, el proyecto sirve como un recurso educativo para desarrolladores que buscan aprender o mejorar sus habilidades en el desarrollo de aplicaciones Android.
