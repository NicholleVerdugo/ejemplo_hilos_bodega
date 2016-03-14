/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Programa {
    
	public static void main(String main[]){

        Bodega bode = new Bodega();

        Descargador procesoDescarga = new Descargador(bode);
        Empacador procesoCarga=new Empacador(bode);

        procesoDescarga.start();
        procesoCarga.start();

    }
    
}
