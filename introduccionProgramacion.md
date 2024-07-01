# TEMA 1. INTRODUCCIÓN A LA PROGRAMACIÓN.
## 1. Programas: buscando una solución
**Resolución de problemas**:
* *Análisis del problema*: requiere que el problema sea definido ycomprendido claramente para que pueda ser analizado con todo detalle.
* *Diseño o desarrollo de algoritmos*:procedimiento paso a pasopara solucionar el problema dado.
* *Resolución del algoritmo elegido en la computadora*: consiste enconvertir el algoritmo en programa, y comprobar que soluciona verdaderamente el problema.
**Virtudes** que debería tener nuestra solución:
* Corrección y eficacia: si resuelve el problema adecuadamente.
* Eficiencia: si lo hace en un tiempo mínimo y con un uso óptimo de los recursos del sistema.  
Cuando afrontemos la construcción de la solución tendremos que tener en cuenta los siguientes conceptos:
1. Abstracción: se trata de realizar un análisis del problema para descomponerlo en problemas más pequeños y de menorcomplejidad, describiendo cada uno de ellos de manera precisa.
2. Encapsulación: consiste en ocultar la información para poder implementarla de diferentes maneras sin que esto influyaen el resto de elementos.
3. Modularidad: estructuraremos cada parte en módulos independientes, cada uno de ellos tendrá su funcióncorrespondiente.
### 1.1. Algoritmos y programas
**Algoritmo**: secuencia ordenada de pasos, descrita sin ambigüedades, que conducen a la solución de un problema dado. Son independientes de los lenguajes de programación y de las computadorasdonde se ejecutan. Su diseño será una tarea que necesitará de la creatividad y conocimientos de las técnicas de programación. Características fundamentales:
* Debe ser preciso e indicar el orden de realización paso a paso.
* Debe estar bien definido, si se ejecuta dos o más veces, debe obtener el mismo resultado cada vez.
* Debe ser finito, debe tener un número finito de pasos.
Cuando los problemas son complejos, es necesario descomponer éstos en subproblemas más simples y, a su vez, enotros más pequeños. Estas estrategias reciben el nombre de **diseño descendente** o **diseño modular** (**top-down design**). Este sistema se basa en el lema **divide y vencerás**.  
Para representar gráficamente los algoritmos que vamos a diseñar, tenemos a nuestra disposición diferentes herramientas queayudarán a describir su comportamiento de una forma precisa y genérica, para luego poder codificarlos con el lenguaje que nos interese. Entre otras tenemos:
* **Diagramas de flujo**: esta técnica utiliza símbolos gráficos para la representación del algoritmo. Suele utilizarse en las fases de análisis.
* Pseudocódigo: esta técnica se basa en el uso de palabras clave en lenguaje natural, constants, variables, otro sobjetos, instrucciones y estructuras de programación que expresan de forma escrita la solución del problema. Es la técnica más utilizada actualmente.
Tablas de decisión: En una tabla son representadas las posibles condiciones del problema con sus respectivasacciones. Suele ser una técnica de apoyo al pseudocódigo cuando existen situaciones condicionales complejas.
**Programa**: los pasos quepermiten resolver el problema, deben escribirse en un determinado lenguaje de programación para que puedan ser ejecutados en el ordenador y así obtener la solución.  
**Los lenguajes de programación** son sólo un medio para expresar el algoritmo y el ordenador un procesador para ejecutarlo.  

## 2. Fases de la programación
### Fase de resolución del problema.
Puede dividirse en dos etapas:
* *Análisis*: Por regla general, el análisis del problema nos va a indicar la especificación de requisitos que la aplicación debe cubrir. El análisis inicial ofrecerá una idea general de lo que se solicita, realizando posteriormente sucesivos refinamientos que servirán para dar respuesta a las siguientes cuestiones:
  * ¿Cuál es la información que ofrecerá la resolución del problema? La respuesta a esta primera pregunta se identifica con los resultados deseados o las salidas del problema.
  * ¿Qué datos son necesarios para resolver el problema? La respuesta a esta segunda pregunta indicará qué datos se proporcionan o las entradas del problema.  
En esta fase debemos aprender a analizar la documentación de la empresa, investigar, observar todo lo que rodea al problema y recopilar cualquier información útil.
* *Diseño*: En esta etapa se convierte la especificación realizada en la fase de análisis en un diseño más detallado, indicando el comportamiento o la secuencia lógica de instrucciones capaz de resolver el problema planteado.
Consiste en plantear la aplicación como una única operación global, e ir descomponiéndola en operaciones más sencillas, detalladas y específicas. En cada nivel de refinamiento, las operaciones identificadas se asignan a módulos separados.  
Hay que tener en cuenta que antes de pasar a la implementación del algoritmo, hemos de asegurarnos de que tenemos una solución adecuada. Para ello, todo diseño requerirá de la realización de la prueba o traza del programa. Este proceso consistirá en un seguimiento paso a paso de las instrucciones del algoritmo utilizando datos concretos. Si la solución aportada tiene errores, tendremos que volver a la fase de análisis para realizar las modificaciones necesarias o tomar un nuevo camino para la solución. Sólo cuando el algoritmo cumpla los requisitos y objetivos especificados en la fase de análisis se pasará a la fase de implementación.
### Fase de implementación.
### Fase de explotación y mantenimiento.
