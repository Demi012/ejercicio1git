
package ejerciciogit1;


public class Ejerciciogit1 {

    
    public static void main(String[] args) {
       int multiplicando = 10; // El número del cual queremos la tabla de multiplicar
        
        System.out.println("Tabla de multiplicar del " + multiplicando + ":");
        
        for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
            int resultado = multiplicando * multiplicador;
            System.out.println(multiplicando + " x " + multiplicador + " = " + resultado);
        }
    }
}
        
    
    

