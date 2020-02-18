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
        this.caras = new CaraDado[]{CaraDado.CARA_1,CaraDado.CARA_2,CaraDado.CARA_3,CaraDado.CARA_4,CaraDado.CARA_5,CaraDado.CARA_6};
        this.caraSeleccionada = 1;
        this.disponible = true;
    }
}
