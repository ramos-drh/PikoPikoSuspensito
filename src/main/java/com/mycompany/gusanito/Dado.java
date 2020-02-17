/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gusanito;

/**
 *
 * @author juan
 */
public class Dado {
    CaraDado[] caras;
    int caraSeleccionada;
    boolean disponible;

    public Dado(CaraDado[] caras) {
        this.caras = new CaraDado[]{CaraDado.CARA_UNO,CaraDado.CARA_DOS,CaraDado.CARA_TRES,CaraDado.CARA_CUATRO,CaraDado.CARA_CINCO,CaraDado.CARA_SEIS};
        this.caraSeleccionada = 1;
        this.disponible = true;
    }
}
