// SEPARADOR DE RUTAS
static String pathSeparator(String path){
    String separatorSlash = "\\";
    try {
        // If we are on Windows
        if (File.separator.equals(separatorSlash)) {
            separatorSlash = "/";
        // Replace all strings that have a match with the regular expression for the string File.separator.
        }
        return path.replaceAll(separatorSlash, File.separator); 
    } catch (Exception e) {
        // If a java.util.regex.PatternSyntaxException happens.
        return path.replaceAll(separatorSlash + separatorSlash, File.separator);
    } 
}

// CREACIÓN FICHEROS
try {
    // We create the object that encapsules the file.
    File newFile = new File ("pathComplete");
    // From the File object we create the file physically.
    if (newFile.createNewFile()) {
        System.out.println("sentence");
    } else {
        System.out.println("sentence");
    }
} catch (Exception ioe) {
    ioe.getMessage();
}

// BORRAR FICHEROS
try {
    // We create the object that encapsules the file.
    File newFile = new File ("pathComplete");
    // From the File object we delete the file physically.
    if (newFile.exists()) {
        newFile.delete();
            System.out.println("sentence");
    } else {
        System.out.println("sentence");
    }
} catch (Exception ioe) {
    ioe.getMessage();
}

// CREACIÓN DIRECTORIOS
try {
    // Declaring variables
    String newFolder = ("folderPath");
    String newFolders = ("folder1/folder2/folder3");
    // Creating the new folder
    boolean success = (new File(newFolder)).mkdir();
    if (success) {
        System.out.println("sentence");
    } else {
        System.out.println("sentence");
    }
    // Creating the new folders
    boolean success = (new File(newFolders)).mkdirs();
    if (success) {
        System.out.println("sentence");
    } else {
        System.out.println("sentence");
    }
} catch (Exception ioe) {
    ioe.getMessage();
}
