# JAVA.LANG

## STRING  
Se puede utilizar en Java como si de un tipo de datos primitivo se tratase, y 
como caso especial, no necesita del operador **new** para ser creado.  

### MÉTODOS  

```charAt``` obtención del carácter que se encuentra en una posición 
determinada de la cadena.`char character = sentence.charAt(3);`  
```length``` obtención de longitud de un String. `int large = sentence.lenth();`  ```concat``` para concatenar cadenas de caracteres.`String sentence3 = sentence1.concat(sentence2);`  
```equals``` devuelve un valor booleano que indica si las cadenas comparadas 
son o no iguales.`boolean compare = sentence1.equals(sentence2);`  
```equalsIgnoreCase``` igual que el anterior pero ignorando las mayúsculas de 
las cadenas a considerar. `boolean compare = sentence1.equalsIgnoreCase(sentence2);`  
```substring``` obtener cadenas derivadas de una cadena original. Debemos 
indicar el inicio y el fin de la subcadena a obtener. `String sentence2 = sentence1.substring(0, 5);`  
```toUpperCase``` devuelven una nueva variable que transforma en mayúsculas la
 variable inicial. `String sentence2 = sentence1.toUperCase();`  
```toLowerCase``` devuelven una nueva variable que transforma en minúsculas la
 variable inicial. `String sentence2 = sentence1.toLowerCase();`  
```valueOf``` para convertir un tipo de dato primitivo (int, long, float, etc.)
 a una variable de tipo String. `String value = String.valueOf(number);`

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

# SWING / AWT

## CLASES

### JFRAME

#### MÉTODOS

```
etTitle()
setBounds(x,yx,w,h)
setLocation
setMaximumSize(w,h)
setMinimumSize(w,h)
setPreferredSize(w,h)
setResizable(bool)
setSize(w,h)
setTitle(str)
setVisible(bool).
```

### JCOMPONENT
Clase base para los componentes swing.

### ABSTRACTBUTTON
Define el comportamiento común de los botones y los menús.

### JBUTTON
Botón.

#### MÉTODOS

```setEnabled(bool)``` que permite activar o desactivar el botón.  
```isEnabled()``` que permite comprobar si está o no activo.  
```setMnemonic(char)``` que permite asociar una tecla al botón, etc.

### JMENUITEM
Elemento de un menú.

#### MÉTODOS

```addSeparator()``` o ```nsertSeparator(posn)``` para añadir separadores.  
```setEnabled(bool)``` para activar o desactivar el menú item.  
```isEnabled()``` comprobar si están activos.  
```etMnemonic(char)``` para añadir teclas de acceso rápido se usa el método.

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

#### MÉTODOS

```isSelected()``` que devuelve el estado del mismo.

### JCOLORCHOOSER
Diálogo para seleccionar colores.

### JCOMBOBOX
Combinación de caja de texto y lista desplegable.  

#### MÉTODOS

```setEditable(true)``` que permite editar los items del combo box.   
```getSelectedItem()``` y ```getSelectedIndex()``` para recuperar los ítems seleccionados.
```
getItemAt(idx)
getItemCount()
setSelectedItem(obj)
setMaximumRowCount(x).
```

### JLABEL
Etiqueta.

#### MÉTODOS

```setText()``` permite modificar el texto.  
```setVerticalAlignment()``` para modificar la alineación vertical, etc..

### JLIST
Lista desplegable.

#### MÉTODOS

```addElement(objName)```, ```elementAt(index)```, ```removeElement(objName)```, r```emoveAllElements()``` y ```removeElementAt(idx)``` para editar los elementos de la lista.  
```contains(objName)```, ```indexOf(name)``` y ```size()``` para comprobar el estado de la lista.  
```copyInto(array)``` para convertir la lista en array.

### JMENUBAR
Barra de menús.

### JOPTIONPANE
Componente que facilita la visualización de un cuadro de diálogo.

### JPANEL
Contenedor genérico.

#### MÉTODOS

```add()``` para añadir componentes al panel.  

### JPOPUPMENU
Menú que aparece cuando se selecciona un elemento de una barra de menús.

### JPROGRESSBAR
Barra de progreso.

#### MÉTODOS

```
setExtent()
setMaximum()
setMinimum()
setValue()
getValueIsAdjusting()
setOrientation()
```  

### JSCROLLBAR:
Barra de desplazamiento.

#### MÉTODOS

```
setExtent()
setMaximum()
setMinimum()
setValue()
getValueIsAdjusting()
setOrientation()
```  

### JSCROLLPANE
Área de trabajo con barras de desplazamiento.

### JSEPARATOR
Separador para colocar entre dos elementos del menú.

### JSLIDER
Permite seleccionar un valor dentro de un intervalo que define.

#### MÉTODOS

```
setPaintTicks(bool)
setPaintLabels(bool)
setSnapToTicks(true)
setInverted(bool)
```  
```setMajorTickSpacing(int)``` y ```setMinorTickSpacing(int)``` para determinar los valores del intervalo.

### JTABLEHEADER
Se utiliza para manejar la cabecera de una tabla.

### JTEXTCOMPONENT
Clase base para los componentes de texto.

### JEDITORPANE
Edita diferentes tipos de contenido.

### JTEXTPANE
Edita texto con formato, incluyendo imágenes.

#### MÉTODOS

```
getText()
setText()
append(str)
insert(str,pos)
replace(str,beg,end)
setEditable(bool)
setLineWrap(bool)
 setWrapStyleWord(bool)
```

### JTEXTAREA
Caja de texto multilínea.

#### MÉTODOS

```
getText()
setText()
append(str)
insert(str,pos)
replace(str,beg,end)
setEditable(bool)
setLineWrap(bool)
 setWrapStyleWord(bool)
```

### JTEXTFIELD
Caja de texto de una línea.

### JPASSWORDFIELD
Se usa para introducir contraseñas.

### JTOOLBAR
Barra de herramientas.

## INTERFACES

### ACTIONLISTENER

Interfaz de escucha para recibir eventos de acción.  
La clase que está interesada en procesar un evento de acción implementa esta interfaz, y el objeto creado con esa clase se registra con un componente, utilizando el método addActionListener del componente. Cuando se produce el evento de acción, se invoca el método actionPerformed de ese objeto.

#### MÉTODOS

```actionPerformed(ActionEvent e)``` invocado cuando ocurre una acción.

### WINDOWSLISTENER

La interfaz de escucha para recibir eventos de ventana. La clase interesada en procesar un evento de ventana implementa esta interfaz (y todos los métodos que contiene) o extiende la clase abstracta WindowAdapter (sobrescribiendo sólo los métodos de interés). El objeto listener creado a partir de esa clase se registra en una ventana mediante el método addWindowListener de la ventana. Cuando el estado de la ventana cambia en virtud de ser abierta, cerrada, activada o desactivada, iconificada o deiconificada, se invoca el método relevante en el objeto listener, y se le pasa el WindowEvent.

#### MÉTODOS

