# EJERCICIOS DEL FIN DE TEMA  

## TEMA 1  

### Ejercicio 1: Palos de la baraja  
Escribe un pequeño programa en Java que defina un enumerado con los nombres de
 los palos de la baraja española: OROS, COPAS, BASTOS, ESPADAS, para
 posteriormente mostrar por pantalla cada valor del enumerado declarado. La
 salida por pantalla podría ser algo así:  

PALOS DE LA BARAJA ESPAÑOLA  
---------------------------  
Palo 1: OROS  
Palo 2: COPAS  
Palo 3: BASTOS  
Palo 4: ESPADAS  

### Ejercicio 2: Cálculos aritméticos  
Escribe un programa en Java que solicite dos números reales y lleve a cabo los
 siguientes cálculos:  
* El doble del primer número.  
* La mitad del segundo número.  
* El cuadrado de la suma de ambos números.  
* La décima parte de la suma los cuadrados de ambos números.  

Para ello tendrás que utilizar operadores aritméticos tales como la suma, el
 producto o la división. Además, es posible que en algunos casos necesites hacer
 uso de los paréntesis.  

Un ejemplo de ejecución del programa podría ser:  

Otro ejemplo de ejecución podría ser:  

Y otro ejemplo más:  

### Ejercicio 3: Cambio de unidades  
El Sistema Internacional de Unidades (SI, del francés Le Système International
 d’Unités) está constituido por siete unidades básicas: amperio, kelvin, segundo,
 metro, kilogramo, candela y mol, además de unidades derivadas, prefijos para
 denotar múltiplos y submúltiplos de las unidades y reglas para escribir el
 valor de las magnitudes.  

Por otro lado, el sistema anglosajón de unidades es un conjunto de unidades de
 medida diferentes a las del sistema métrico decimal, que se utilizan
 actualmente como medida principal en los Estados Unidos, el Reino Unido y en
 algunos territorios históricamente vinculados a estos dos países.  

A nuestro equipo de desarrollo le han propuesto que implemente un pequeño
 programa para transformar longitudes medidas en el sistema internacional a
 submúltiplos de éstas así como también al sistema anglosajón.  

Lo primero que nos han pedido es la transformación de una longitud dada en
 metros (introducida desde teclado) a:  
* decímetros, centímetros y milímetros (sistema internacional).
* pulgadas, yardas y pies (sistema anglosajón de unidades).  

Para ello hay que tener en cuenta que:  
1. En el sistema métrico decimal, un decímetro es la décima parte de un metro
 (diez decímetros hacen un metro), un centímetro es la centésima parte de un
 metro (cien centímetros hacen un metro) y un milímetro es la milésima parte de
 un metro (mil milímetros hacen un metro).  
2. En el sistema anglosajón, 1 pulgada = 2,54 cm, 1 pie = 12 pulgadas y una
 yarda = 3 pies.  

Escribe un programa en Java que lea de teclado una longitud en metros y muestra
 esa misma medida en: decímetros, centímetros y milímetros (sistema
 internacional) y pulgadas, yardas y pies (sistema anglosajón de unidades).  

Un ejemplo de una posible salida por pantalla del programa podría ser:  


### Ejercicio 4: Volumen de una pirámide
El volumen de una pirámide se calcula con la siguiente fórmula: V = (B*h)/3
En la fórmula anterior, B corresponde con el área de la base y h corresponde con
 la altura de la pirámide. Crea un programa que, dado el tamaño del lado de la
 base L y la altura h, calcule el volumen.  

Nota: ten en cuenta que la base (B) es un cuadrado, por lo que primero deberás
 calcular el area B partiendo del tamaño del lado (L).  

Escribe un programa en Java que solicite la altura y la longitud del lado (en
 metros) de una pirámide de base cuadrángular y calcule su volumen en metros
 cúbicos.  

Después de realizar ese cálculo, muestra a cuántas piscinas olímpicas equivale
 dicho volumen, teniendo en cuenta que una piscina olímpica tiene 2500 metros
 cúbicos.  

Aquí tienes un ejemplo de ejecución (los datos corresponden con la actual
pirámide de Keops o Khufu):  


### Ejercicio 5: Análisis de un número
Escribe un programa en Java que solicite un número entero (sin decimales) y lo
 analice averiguando lo siguiente: si es cero, si es positivo, si es menor que
 cien, si es par.  

Para ello tendrás que utilizar operadores relacionales tales como igual (==),
 menor que (<), mayor que (<code>>), etc. Ten en cuenta que el resultado de la
 aplicación de estos operadores es un valor de tipo boolean, es decir un valor
 que será true o false.  

Recuerda también que un número es par si es divisible entre dos, es decir, si el
 resto de la división entera de ese número entre dos es cero. En Java dispones
 del operador módulo (%) para calcular el resto de la división entera.  

Un ejemplo de ejecución del programa podría ser:  

Otro ejemplo de ejecución podría ser:  

Y otro ejemplo más:  


### Ejercicio 6: Estilos de natación  
Un nadador entrena en la piscina haciendo un largo de ida a estilo crol, un
 largo de vuelta a estilo espalda, y así sucesivamente.  

Escribe un programa en Java que solicite al usuario la cantidad de largos que
 ha recorrido el nadador y la longitud de la piscina en la que ha entrenado (en
 metros). El programa debe calcular e indicar: la cantidad total de metros que
 ha nadado en cada estilo así como la longitud total que ha recorrido nadando
 (en kilómetros).  

Ejemplo de ejecución 1: se han nadado 47 largos en una piscina de 25 metros. En
 tal caso el programa debería indicar que se han nadado 600 metros a crol y 575
 metros a espalda, de un total de 1,175 kilómetros.  

Ejemplo de ejecución 2: se han nadado 100 largos en una piscina de 15,2 metros.
 En tal caso el programa debería indicar que se han nadado 760 metros a crol y
 760 metros a espalda, de un total de 1,52 kilómetros.  

### Ejercicio 7: Cuadernos de colores  
Una factoría papelera confecciona cuadernos en los que se van alternando hojas
 de color rojo, verde y azul. Siempre se comienza por el color rojo, siguiéndole
 el verde, luego el azul y comenzando nuevamente con el rojo.  

Por ejemplo, si un cuaderno está compuesto por 100 hojas, 34 serían de color
 rojo, 33 de color verde y 33 de color azul.  

Sin embargo, si el cuaderno tuviera 200 hojas, 67 serían de color rojo, 67 de
 color verde y 66 de color azul.  

Por otro lado, si el cuaderno tuviera 201 hojas, 67 serían rojas, 67 verdes y 67
 azules.  

Escribe un programa en Java que solicite por teclado el número de hojas del
 cuaderno y calcule y muestre por pantalla la cantidad de hojas que contiene de
 cada color.  

### Ejercicio 8: Concurso de TV  
Para un concurso de TV se solicitan personas cuyo nombre comience y termine por
 la misma letra, y además sus apellidos tengan la misma cantidad de letras.  

Escribe un programa en Java que reciba como entradas el nombre, el primer
 apellido y el segundo apellido de una persona y muestre por pantalla:
* "La persona es APTA para el concurso" si es apta para participar en el
 concurso.
* "La persona es NO APTA para el concurso" si no lo es.  

La primera letra del nombre y de los apellidos debe escribirse en mayúscula y el
 resto en minúscula. No se admiten acentos ni eñes.  

Aquí tienes algunos ejemplos de funcionamiento:
1. AnaTorres Barros. Persona APTA para participar en el concurso.
2. Luis Zagal Hegel. Persona NO APTA para participar en el concurso.
3. Orlando Bisbal Torzal. Persona APTA para participar en el concurso.
4. Nanin Torres Manzano. Persona no APTA para participar en el concurso.  

