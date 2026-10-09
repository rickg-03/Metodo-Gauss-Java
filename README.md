# Metodo de Gauss - Sistema de Ecuaciones Lineales

Programa desarrollado en **Java** con diseño modular que implementa el **Metodo de Gauss** para resolver sistemas de ecuaciones lineales de forma exacta.

---

## Como esta organizado el proyecto? 

El código fuente esta separado en tres modulos independientes para mantener una estructura limpia:
1. **`Main.java`**: Es la clase principal. Coordina la ejecucion del programa.
2. **`LectorDatos.java`**: Se encarga de interactuar con el usuario para pedir los datos de la matriz y mostrarla de forma ordenada en la consola.
3. **`MetodoGauss.java`**: Contiene la logica matematica pura (eliminacion hacia adelante y sustitucion hacia atras).

---

## Como compilar y ejecutar el programa?

1. **Abre tu terminal** en la carpeta donde guardaste los archivos `.java`.
2. **Compila los archivos** ejecutando el siguiente comando:
   ```bash
   javac Main.java LectorDatos.java MetodoGauss.java
   javac Main.java LectorDatos.java MetodoGauss.java

## Que ingresar en la consola?

Para probar el programa utilizaremos este sistema de 3 ecuaciones con 3 incognitas:

2x_1 + 1x_2 - 1x_3 = 8
-3x_1 - 1x_2 + 2x_3 = -1
-2x_1 + 1x_2 + 2x_3 = -3

Paso 1: Indicar el tamaño del sistema
Pantalla: Ingrese el número de variables (ecuaciones):
Tú escribes: 3 y presionas Enter.

Paso 2: Ingresar los coeficientes de la Ecuación 1
Pantalla: Ecuación 1: Coeficiente de x_1: -> Escribes: 2 [Enter]
Pantalla: Coeficiente de x_2: -> Escribes: 1 [Enter]
Pantalla: Coeficiente de x_3: -> Escribes: -1 [Enter]
Pantalla: Término independiente (b_1): -> Escribes: 8 [Enter]

Paso 3: Ingresar los coeficientes de la Ecuación 2
Pantalla: Ecuación 2: Coeficiente de x_1: -> Escribes: -3 [Enter]
Pantalla: Coeficiente de x_2: -> Escribes: -1 [Enter]
Pantalla: Coeficiente de x_3: -> Escribes: 2 [Enter]
Pantalla: Término independiente (b_2): -> Escribes: -11 [Enter]

Paso 4: Ingresar los coeficientes de la Ecuación 3
Pantalla: Ecuación 3: Coeficiente de x_1: -> Escribes: -2 [Enter]
Pantalla: Coeficiente de x_2: -> Escribes: 1 [Enter]
Pantalla: Coeficiente de x_3: -> Escribes: 2 [Enter]
Pantalla: Término independiente (b_3): -> Escribes: -3 [Enter]

## Salida esperada en la consola
Una vez que ingreses el último valor, el programa procesara automáticamente los datos y te mostrara este resultado final:

Matriz aumentada ingresada:
[     2.00     1.00    -1.00 |     8.00 ]
[    -3.00    -1.00     2.00 |   -11.00 ]
[    -2.00     1.00     2.00 |    -3.00 ]

==========================================
RESULTADOS
x_1 = 2.0000
x_2 = 3.0000
x_3 = -1.0000
