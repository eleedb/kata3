# Kata 3
__Autora__: Elena Díaz Batista  
__Enlace a video explicativo__: https://drive.google.com/file/d/1unYfkGl3h9l9fN5_vNV8otaNQS6nXr8p/view?usp=sharing

---

## 1. Objetivo de la entrega
El objetivo principal de esta kata es practicar la transformación de filas CSV o TSV en objetos de dominio y el uso de una biblioteca JSON o una serialización controlada por el propio
código.

---

## 2. Requisitos y configuración
### Dependencias y entorno de desarrollo
__JDK__: Oracle OpenJDK 25.0.1  
__IDE Recomendado__: IntelliJ IDEA  
__Sistema de Construcción__: Maven  
__Sistema de Control de Versiones__: Git  
__depencias usadas__: gson versión 2.14.0

### Paquete base
El código fuente se encuentra en el paquete:   
software.ulpgc.katas

---

## 3. Estructura del proyecto y clases principales
Dentro del paquete principal software.ulpgc.katas nos encontramos:
- __Paquete adapters__:  contiene las clases FileUserWriter, JsonRandomUserReader y UserDto que se usan para la transformacion de filas TSV o CSV en objetos de dominio
- __Paquete domain.model__: contiene el record User y el enumerado Gender que modelan a los usuarios y su género.
- __Paquete ports__: contiene las interfaces UserReader y UserWriter que se implementan en los adapters
- __Clase Main__: permite usar un JsonRandomUserReader y un FileUserWriter para verificar su funcionamiento y correspondiente salida en una carpeta "users"

---

## 4. Compilación y ejecución
Desde IntelliJ IDEA:
1. Abrir la carpeta raíz kata3 en IntelliJ IDEA.
2. Navegar a src/main/java/software/ulpgc/katas/Main.java 
3. Ejecutar la clase utilizando el icono de ejecución del entorno.

---

## 5. Clonar
1. Abrir IntelliJ IDEA
2. Si tienes un proyecto abierto haz: File > Close Project
3. En la pantalla principal ve a: Clone Repository
4. En el campo URL introduce la dirección del repositorio
5. Haz clic en clone

---

## 6. Flujo Git y repetición
La kata se ha repetido 3 veces, visibles en las distintas ramas develop_numeroDeRepeticion

---

## 7. Verificación de funcionamiento
Se adjuntan tres imágenes, en la primera se muestra la clase Main en la que se usa un JsonRandomUserReader y un FileUserWriter,
en la segunda se muestran la salida de la terminal sin errores, 
y en la tercera se muestra el contenido del directorio users con todas las imágenes esperadas

<img width="795" height="246" alt="image" src="https://github.com/user-attachments/assets/68902db9-37c1-4a10-805f-f99f59262cca" />
<img width="606" height="102" alt="image" src="https://github.com/user-attachments/assets/34d50fee-1602-4089-9900-15715cbc2cf4" />
<img width="606" height="507" alt="image" src="https://github.com/user-attachments/assets/834093f8-1be8-4904-b496-3ad83531cf7d" />


