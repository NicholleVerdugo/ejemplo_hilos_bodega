import static java.lang.Thread.sleep;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Empacador extends Thread{
    
    Bodega bodega;
    
    public Empacador(Bodega bodega){
        this.bodega=bodega;
    }
    
    public void run(){
		
        while(true){
			int tiempoEntregando = 2;
            System.out.println("El empacador espera por " + tiempoEntregando + " segundos para armar el paquete");

            try {
                sleep(tiempoEntregando*1000);
            } catch (InterruptedException e) {
				
            }
            bodega.crearPaquete();
            
        }

    }
}
