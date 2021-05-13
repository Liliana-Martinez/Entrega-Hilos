
package entrega_Hilos;

public class Cuadrados extends Thread{

        private int a[];
        private int total;
        
        public Cuadrados(int a[]){
            this.a = a;
        }
        
        @Override
        public void run(){
            for(int i=0; i<a.length; i++){
                total += Math.pow(a[i], 2);
            }
        }
        
        public int getTotal(){
            return this.total;
        }
        
}
