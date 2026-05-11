# TextoApp - Aplicación Android de Texto

Una aplicación Android sencilla creada con Kotlin que permite procesar y mostrar texto con alertas interactivas.

## Características

- ✏️ **Caja de Texto (EditText)**: Para ingresar texto
- 📝 **Label (TextView)**: Para mostrar el texto ingresado
- 🔘 **Botón**: Para procesar el texto
- ⚠️ **Alerta Pop-up**: Muestra un mensaje de éxito al procesar el texto

## Requisitos

- Android Studio Iguana o superior
- Android SDK API 34
- Kotlin 1.9.20 o superior
- Java 11

## Instalación

1. Clona este repositorio o copia el proyecto a tu máquina local
2. Abre el proyecto en Android Studio
3. Sincroniza el proyecto con los archivos Gradle
4. Conecta un dispositivo Android o inicia un emulador
5. Presiona **Run** o usa la combinación `Shift + F10`

## Uso

1. Ingresa texto en la caja de texto
2. Presiona el botón "Procesar Texto"
3. El texto aparecerá en el label inferior
4. Se mostrará una alerta emergente con un mensaje de éxito

## Estructura del Proyecto

```
android-texto-app/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── kotlin/
│   │   │   │   └── com/example/textoapp/
│   │   │   │       └── MainActivity.kt
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   │   └── activity_main.xml
│   │   │   │   ├── values/
│   │   │   │   │   ├── strings.xml
│   │   │   │   │   ├── colors.xml
│   │   │   │   │   └── themes.xml
│   │   │   │   ├── drawable/
│   │   │   │   │   ├── edit_text_background.xml
│   │   │   │   │   └── text_view_background.xml
│   │   │   │   └── xml/
│   │   │   │       ├── backup_rules.xml
│   │   │   │       └── data_extraction_rules.xml
│   │   │   └── AndroidManifest.xml
│   │   └── test/
│   └── build.gradle.kts
├── gradle/
│   └── libs.versions.toml
├── build.gradle.kts
├── settings.gradle.kts
├── gradle.properties
└── README.md
```

## Componentes

### MainActivity.kt

La actividad principal que contiene toda la lógica de la aplicación:

- **Inicialización de vistas**: Se obtienen las referencias de los componentes UI
- **Gestor de clic**: Maneja el evento del botón
- **Validación**: Valida que el campo de texto no esté vacío
- **Alertas**: Muestra mensajes de éxito o error

### activity_main.xml

El archivo de diseño que define la interfaz de usuario:

- LinearLayout vertical con padding
- EditText para entrada de texto
- TextView para mostrar el resultado
- Button para procesar

## Versiones

- **API mínima**: 24 (Android 7.0)
- **API objetivo**: 34 (Android 14)
- **Versión de Kotlin**: 1.9.20

## Dependencias

- AndroidX Core KTX: 1.12.0
- AppCompat: 1.6.1
- Material Design: 1.10.0
- Activity KTX: 1.8.0
- ConstraintLayout: 2.1.4

## Autor

Proyecto creado para demostración de desarrollo Android con Kotlin.

## Licencia

MIT
