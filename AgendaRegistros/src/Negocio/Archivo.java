package Negocio;

import java.io.*;
import javax.swing.JOptionPane;

public class Archivo {
    
    File archivo;
    
    public void crearArchivo() {
        archivo = new File("AgendaContactos.txt");
        try {
            if (archivo.createNewFile()) { 
                //JOptionPane.showMessageDialog(null, "Archivo creado", "Mensaje", 1);
                System.out.println("Archivo creado");
            }   
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
    public void escribirArchivo(Persona persona) {
        try {
            FileWriter escritura = new FileWriter(archivo, true);
            escritura.write("Nombre: " + persona.getNombre() + ", Correo: " + persona.getCorreo() + ", Telefono: " + persona.getTelefono() + "\r\n");
            escritura.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
}
