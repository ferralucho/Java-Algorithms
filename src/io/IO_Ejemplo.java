package io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class IO_Ejemplo {
    public static void main(String[] args) throws IOException {
        File path = new File("Hola.txt");
        System.out.println("¿Existe el archivo? " + path.exists());
        try (OutputStream outStream = new FileOutputStream(path)) {
            String contentsToWrite = "Hola mundo";
            outStream.write(contentsToWrite.getBytes());
            System.out.println("Archivo: " + path);
        }
    }
}
