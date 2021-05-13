
package entrega_Hilos;

public class Media extends Thread {
    
    private int a[];
    private double total;
    
    public Media(int a[]){
        this.a = a;
    }
    int suma = 0;
    
    @Override
    public void run(){
        for(int i=0; i<a.length; i++){
            suma += a[i];
        }
        total = (double)suma/a.length;
    }
    
    public double getTotal(){
        return this.total;
    }
}
