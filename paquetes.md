# JAVA.IO
Paquete que proporciona interfaces, clases y excepciones para acceder a todo tipo de ficheros.  

## CLASES

### FILE

#### MÉTODOS

* **renameTo()**: renombrar el archivo. El objeto File dejará de referirse al archivo renombrado, ya que el String con el nombre del archivo en el objeto File no cambia.
* **delete()**: borrar el archivo.
* **deleteOnExit()**: borra el archivo cuando finaliza la ejecución de la máquina virtual Java.
* **createTempFile()**: crear un nuevo fichero temporal con un nombre único y devuelve un objeto File que apunta a él. Es útil para crear archivos temporales, que luego se borran, asegurándonos tener un nombre de archivo no repetido.
* **setLastModified()**: establece la fecha y la hora de modificación del archivo. Ejemplo, ```new File("prueba.txt").setLastModified(new Date().getTime());``` para establecerle la fecha actual al fichero que se le pasa como parámetro, en este caso prueba.txt.
* **mkdir()**: crear un directorio.
* **mkdirs()**: crea los directorios superiores si no existen.
* **list()**: listar el contenido de un directorio. Devuelve un vector de String con los nombres de los archivos
* **listFiles()**: listar el contenido de un directorio. Devuelve un vector de objetos File.
* **listRoots()**: Listar los nombres de archivo de la raíz del sistema de archivos. Método estático.
* **exists()**: podemos ver si un fichero cualquiera, existe o no. 


### FILEWRITER

#### CONSTRUCTORES
* FileWriter(File file): construye un objeto FileWriter dado u objeto File.


## INTERFACES

### FILEFILTER
Se puede usar para crear filtros que establezcan criterios de filtrado relativos al nombre de los ficheros. Una clase que lo implemente debe definir e implementar el método: ```boolean accept(File dir, String nombre)```.  
Este método devolverá verdadero en el caso de que el fichero cuyo nombre se indica en el parámetro nombre aparezca en la lista de los ficheros del directorio indicado por el parámetro dir.

## EXCEPCIONES

# SWING

## CLASES

### JCOMPONENT
Clase base para los componentes swing.

### ABSTRACTBUTTON
Define el comportamiento común de los botones y los menús.

### JBUTTON
Botón.

### JMENUITEM
Elemento de un menú.

### JCHECKBOXMENUITEM
Elemento del menú que se puede seleccionar o deseleccionar.

### JMENU
Menú de una barra de menús.

### JRADIOBUTTONMENUITEM
Elemento que forma parte de un grupo de elementos de menú.

### JTOGGLEBUTTON
Botón de estados.

### JCHECKBOX
Casilla de verificación.

### JRADIOBUTTON
Botón de opción.

### JCOLORCHOOSER
Diálogo para seleccionar colores.

### JCOMBOBOX
Combinación de caja de texto y lista desplegable.

### JLABEL
Etiqueta.

### JLIST
Lista desplegable.

### JMENUBAR
Barra de menús.

### JOPTIONPANE
Componente que facilita la visualización de un cuadro de diálogo.

### JPANEL
Contenedor genérico.

### JPOPUPMENU
Menú que aparece cuando se selecciona un elemento de una barra de menús.

### JPROGRESSBAR
Barra de progreso.

### JSCROLLBAR:
Barra de desplazamiento.

### JSROLLPANE
Área de trabajo con barras de desplazamiento.

### JSEPARATOR
Separador para colocar entre dos elementos del menú.

### JSLIDER
Permite seleccionar un valor dentro de un intervalo que define.

### JTABLEHEADER
Se utiliza para manejar la cabecera de una tabla.

### JTEXTCOMPONENT
Clase base para los componentes de texto.

### JEDITORPANE
Edita diferentes tipos de contenido.

### JTEXTPANE
Edita texto con formato, incluyendo imágenes.

### JTEXTAREA
Caja de texto multilínea.

### JTEXTFIELD
Caja de texto de una línea.

### JPASSWORDFIELD
Se usa para introducir contraseñas.

### JTOOLBAR
Barra de herramientas.
