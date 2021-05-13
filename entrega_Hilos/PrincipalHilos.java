
package entrega_Hilos;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PrincipalHilos {
    public static void main(String args[]){
        
        int array[] = new int[10];
        
        System.out.println("Almacenamiento de datos en el array");
        for(int i=0; i<array.length; i++){
            array[i] = (int)(Math.random()*50+1);
            System.out.println(array[i]);
        }
        
        
        
        Suma h1 = new Suma(array);
        Cuadrados h2 = new Cuadrados(array);
        Media h3 = new Media(array);
        h1.start();
        h2.start();
        h3.start();
        
        try{
            h1.join();
        }catch(InterruptedException ex){
            Logger.getLogger(PrincipalHilos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try{
            h2.join();
        }catch(InterruptedException ex){
            Logger.getLogger(PrincipalHilos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try{
            h3.join();
        }catch(InterruptedException ex){
            Logger.getLogger(PrincipalHilos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("La suma de los valores del vector es: " + h1.getTotal());
        System.out.println("La suma de los cuadrados de los valores del vector es: " + h2.getTotal());
        System.out.println("La media de los valores del vector es: " + h3.getTotal());
    }
}
