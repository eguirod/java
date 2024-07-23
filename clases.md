# STRING  
Se puede utilizar en Java como si de un tipo de datos primitivo se tratase, y 
como caso especial, no necesita del operador **new** para ser creado.  

## MÉTODOS  

* **charAt**: obtención del carácter que se encuentra en una posición 
determinada de la cadena.`char character = sentence.charAt(3);`  
* **length**: obtención de longitud de un String. `int large = sentence.lenth();`  
* **concat**: para concatenar cadenas de caracteres.`String sentence3 = sentence1.concat(sentence2);`  
* **equals**: devuelve un valor booleano que indica si las cadenas comparadas 
son o no iguales.`boolean compare = sentence1.equals(sentence2);`  
* **equalsIgnoreCase**: igual que el anterior pero ignorando las mayúsculas de 
las cadenas a considerar. `boolean compare = sentence1.equalsIgnoreCase(sentence2);`  
* **substring**: obtener cadenas derivadas de una cadena original. Debemos 
indicar el inicio y el fin de la subcadena a obtener. `String sentence2 = sentence1.substring(0, 5);`  
* **toUpperCase**: devuelven una nueva variable que transforma en mayúsculas la
 variable inicial. `String sentence2 = sentence1.toUperCase();`  
* **toLowerCase**: devuelven una nueva variable que transforma en minúsculas la
 variable inicial. `String sentence2 = sentence1.toLowerCase();`  
* **valueOf**: para convertir un tipo de dato primitivo (int, long, float, etc.)
 a una variable de tipo String. `String value = String.valueOf(number);`