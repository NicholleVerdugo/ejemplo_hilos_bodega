import static java.lang.Thread.sleep;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Descargador extends Thread {

    Bodega bodega;

    public Descargador(Bodega bodega) {

        this.bodega = bodega;
    }

    public void run() {

        while (true) {

            int tiempo = 2;
            int tipo = 1 + (int) (Math.random() * 2);
            System.out.println("La descarga de tipo " + tipo + " tarda " + tiempo + " segundos");
            try {
                sleep(tiempo * 1000);
            } catch (InterruptedException e) {
				
            }

            bodega.descargarArticulo(tipo);
            
        }
    }
}
