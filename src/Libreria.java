/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author r618b
 */
public class Libreria {

        public static void main(String[] args) {
     
   Dialogo miDialogo = Dialogo.crearDialogo(Dialogo.Tipo.CONSOLA);
        miDialogo.mostrar("Hola desde una consola");
        Dialogo otroDialogo = Dialogo.crearDialogo(Dialogo.Tipo.VENTANA);
        otroDialogo.mostrar("Hola desde una ventana");
    }

}

