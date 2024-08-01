# EJERCICIOS DEL FIN DE TEMA  

## TEMA 1  

### Ejercicio 1: Palos de la baraja  
Escribe un peque�o programa en Java que defina un enumerado con los nombres de
 los palos de la baraja espa�ola: OROS, COPAS, BASTOS, ESPADAS, para
 posteriormente mostrar por pantalla cada valor del enumerado declarado. La
 salida por pantalla podr�a ser algo as�:  

PALOS DE LA BARAJA ESPA�OLA  
---------------------------  
Palo 1: OROS  
Palo 2: COPAS  
Palo 3: BASTOS  
Palo 4: ESPADAS  

### Ejercicio 2: C�lculos aritm�ticos  
Escribe un programa en Java que solicite dos n�meros reales y lleve a cabo los
 siguientes c�lculos:  
* El doble del primer n�mero.  
* La mitad del segundo n�mero.  
* El cuadrado de la suma de ambos n�meros.  
* La d�cima parte de la suma los cuadrados de ambos n�meros.  

Para ello tendr�s que utilizar operadores aritm�ticos tales como la suma, el
 producto o la divisi�n. Adem�s, es posible que en algunos casos necesites hacer
 uso de los par�ntesis.  

Un ejemplo de ejecuci�n del programa podr�a ser:  

Otro ejemplo de ejecuci�n podr�a ser:  

Y otro ejemplo m�s:  

### Ejercicio 3: Cambio de unidades  
El Sistema Internacional de Unidades (SI, del franc�s Le Syst�me International
 d�Unit�s) est� constituido por siete unidades b�sicas: amperio, kelvin, segundo,
 metro, kilogramo, candela y mol, adem�s de unidades derivadas, prefijos para
 denotar m�ltiplos y subm�ltiplos de las unidades y reglas para escribir el
 valor de las magnitudes.  

Por otro lado, el sistema anglosaj�n de unidades es un conjunto de unidades de
 medida diferentes a las del sistema m�trico decimal, que se utilizan
 actualmente como medida principal en los Estados Unidos, el Reino Unido y en
 algunos territorios hist�ricamente vinculados a estos dos pa�ses.  

A nuestro equipo de desarrollo le han propuesto que implemente un peque�o
 programa para transformar longitudes medidas en el sistema internacional a
 subm�ltiplos de �stas as� como tambi�n al sistema anglosaj�n.  

Lo primero que nos han pedido es la transformaci�n de una longitud dada en
 metros (introducida desde teclado) a:  
* dec�metros, cent�metros y mil�metros (sistema internacional).
* pulgadas, yardas y pies (sistema anglosaj�n de unidades).  

Para ello hay que tener en cuenta que:  
1. En el sistema m�trico decimal, un dec�metro es la d�cima parte de un metro
 (diez dec�metros hacen un metro), un cent�metro es la cent�sima parte de un
 metro (cien cent�metros hacen un metro) y un mil�metro es la mil�sima parte de
 un metro (mil mil�metros hacen un metro).  
2. En el sistema anglosaj�n, 1 pulgada = 2,54 cm, 1 pie = 12 pulgadas y una
 yarda = 3 pies.  

Escribe un programa en Java que lea de teclado una longitud en metros y muestra
 esa misma medida en: dec�metros, cent�metros y mil�metros (sistema
 internacional) y pulgadas, yardas y pies (sistema anglosaj�n de unidades).  

Un ejemplo de una posible salida por pantalla del programa podr�a ser:  


### Ejercicio 4: Volumen de una pir�mide
El volumen de una pir�mide se calcula con la siguiente f�rmula: V = (B*h)/3
En la f�rmula anterior, B corresponde con el �rea de la base y h corresponde con
 la altura de la pir�mide. Crea un programa que, dado el tama�o del lado de la
 base L y la altura h, calcule el volumen.  

Nota: ten en cuenta que la base (B) es un cuadrado, por lo que primero deber�s
 calcular el area B partiendo del tama�o del lado (L).  

Escribe un programa en Java que solicite la altura y la longitud del lado (en
 metros) de una pir�mide de base cuadr�ngular y calcule su volumen en metros
 c�bicos.  

Despu�s de realizar ese c�lculo, muestra a cu�ntas piscinas ol�mpicas equivale
 dicho volumen, teniendo en cuenta que una piscina ol�mpica tiene 2500 metros
 c�bicos.  

Aqu� tienes un ejemplo de ejecuci�n (los datos corresponden con la actual
pir�mide de Keops o Khufu):  


### Ejercicio 5: An�lisis de un n�mero
Escribe un programa en Java que solicite un n�mero entero (sin decimales) y lo
 analice averiguando lo siguiente: si es cero, si es positivo, si es menor que
 cien, si es par.  

Para ello tendr�s que utilizar operadores relacionales tales como igual (==),
 menor que (<), mayor que (<code>>), etc. Ten en cuenta que el resultado de la
 aplicaci�n de estos operadores es un valor de tipo boolean, es decir un valor
 que ser� true o false.  

Recuerda tambi�n que un n�mero es par si es divisible entre dos, es decir, si el
 resto de la divisi�n entera de ese n�mero entre dos es cero. En Java dispones
 del operador m�dulo (%) para calcular el resto de la divisi�n entera.  

Un ejemplo de ejecuci�n del programa podr�a ser:  

Otro ejemplo de ejecuci�n podr�a ser:  

Y otro ejemplo m�s:  


### Ejercicio 6: Estilos de nataci�n  
Un nadador entrena en la piscina haciendo un largo de ida a estilo crol, un
 largo de vuelta a estilo espalda, y as� sucesivamente.  

Escribe un programa en Java que solicite al usuario la cantidad de largos que
 ha recorrido el nadador y la longitud de la piscina en la que ha entrenado (en
 metros). El programa debe calcular e indicar: la cantidad total de metros que
 ha nadado en cada estilo as� como la longitud total que ha recorrido nadando
 (en kil�metros).  

Ejemplo de ejecuci�n 1: se han nadado 47 largos en una piscina de 25 metros. En
 tal caso el programa deber�a indicar que se han nadado 600 metros a crol y 575
 metros a espalda, de un total de 1,175 kil�metros.  

Ejemplo de ejecuci�n 2: se han nadado 100 largos en una piscina de 15,2 metros.
 En tal caso el programa deber�a indicar que se han nadado 760 metros a crol y
 760 metros a espalda, de un total de 1,52 kil�metros.  

### Ejercicio 7: Cuadernos de colores  
Una factor�a papelera confecciona cuadernos en los que se van alternando hojas
 de color rojo, verde y azul. Siempre se comienza por el color rojo, sigui�ndole
 el verde, luego el azul y comenzando nuevamente con el rojo.  

Por ejemplo, si un cuaderno est� compuesto por 100 hojas, 34 ser�an de color
 rojo, 33 de color verde y 33 de color azul.  

Sin embargo, si el cuaderno tuviera 200 hojas, 67 ser�an de color rojo, 67 de
 color verde y 66 de color azul.  

Por otro lado, si el cuaderno tuviera 201 hojas, 67 ser�an rojas, 67 verdes y 67
 azules.  

Escribe un programa en Java que solicite por teclado el n�mero de hojas del
 cuaderno y calcule y muestre por pantalla la cantidad de hojas que contiene de
 cada color.  

### Ejercicio 8: Concurso de TV  
Para un concurso de TV se solicitan personas cuyo nombre comience y termine por
 la misma letra, y adem�s sus apellidos tengan la misma cantidad de letras.  

Escribe un programa en Java que reciba como entradas el nombre, el primer
 apellido y el segundo apellido de una persona y muestre por pantalla:
* "La persona es APTA para el concurso" si es apta para participar en el
 concurso.
* "La persona es NO APTA para el concurso" si no lo es.  

La primera letra del nombre y de los apellidos debe escribirse en may�scula y el
 resto en min�scula. No se admiten acentos ni e�es.  

Aqu� tienes algunos ejemplos de funcionamiento:
1. AnaTorres Barros. Persona APTA para participar en el concurso.
2. Luis Zagal Hegel. Persona NO APTA para participar en el concurso.
3. Orlando Bisbal Torzal. Persona APTA para participar en el concurso.
4. Nanin Torres Manzano. Persona no APTA para participar en el concurso.  

