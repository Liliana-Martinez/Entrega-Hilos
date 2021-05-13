
package entrega_Hilos;

public class Suma extends Thread{
    
    private int a[];
    private int total;
    
    public Suma(int a[]){
        this.a = a;
    }
    
    public void run(){
        for(int i=0; i<a.length; i++){
            total += a[i];
        }
    }
    
    public int getTotal(){
        return this.total;
    }
    
}
