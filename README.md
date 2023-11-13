Shell Sort es un algoritmo de ordenamiento que amplía la idea de la ordenación por inserción. Fue diseñado por Donald Shell para mejorar la complejidad temporal al permitir el intercambio de elementos distantes entre sí. La estrategia principal es reorganizar los elementos en posiciones distantes, reduciendo gradualmente la brecha entre los elementos a comparar e intercambiar.

**Características clave del Shell Sort:**

1. **Generalización de la ordenación por inserción:** Shell Sort es una extensión de la ordenación por inserción que considera dos observaciones clave.

2. **Eficiencia en casi ordenado:** Se destaca por ser eficiente cuando la entrada está "casi ordenada".

**Proceso de Shell Sort:**

El algoritmo implica comparar todos los elementos de un arreglo, realizando saltos entre ellos según la longitud del arreglo.

**Ejemplo:**

Supongamos que tenemos el siguiente conjunto: 35, 10, 55, 20, 5, 1.

La ordenación comienza con un valor inicial de intervalo de 4, dado que el número de elementos (n) es 6, entonces n/2 = 3.

El recorrido comienza desde el primer número del arreglo, realizando saltos de 3 en 3. Se compara el primer número con el segundo, y si es menor, se intercambian. Este proceso se repite hasta que el salto sea mayor que el número de elementos en el arreglo.

Luego, el intervalo se reduce a la mitad (3/2 = 1), y se repite el proceso de comparación y intercambio hasta que finalmente los números estén ordenados de mayor a menor.

**Ejemplo de ejecución:**

35, 10, 55, 20, 5, 1 (intervalo inicial 4)

**Paso 1:** 5, 10, 55, 20, 35, 1

**Paso 2:** 5, 1, 55, 20, 35, 10

**Paso 3:** 1, 5, 55, 20, 35, 10

**Paso 4:** 1, 5, 10, 20, 35, 55

En este ejemplo, el arreglo se ordena de manera ascendente mediante la aplicación del algoritmo Shell Sort.
