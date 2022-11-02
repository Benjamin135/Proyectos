package Test;

import java.util.Arrays;

public class TestAgendaRegistro {
 
    public static void main(String[] args) {
        
        String fila = "Nombre: Benjamin, Correo: benjamin@gmail.com, Telefono: 76075113";
        String filas[] = fila.split(" ");
        System.out.println(Arrays.toString(filas));
        
        String s = "";
        for (int i = 0; i < filas.length; i++) {
            if (i == 1 || i == 3 || i == 5 ) {
                if (i == 5) {
                    s = s + filas[i] + " ";
                } else {
                    filas[i] = filas[i].substring(0, filas[i].length() - 1);
                    s = s + filas[i] + " ";
                }
            }
        }
        s = s.substring(0, s.length() - 1);
        System.out.println(s);
        filas = s.split(" ");
        System.out.println(Arrays.toString(filas));
        
    }
    
}
