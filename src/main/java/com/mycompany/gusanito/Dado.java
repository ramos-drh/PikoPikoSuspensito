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
    private CaraDado[] caras;
    private int caraSeleccionada;
    private boolean disponible;

    public Dado(CaraDado[] caras) {
        this.caras = new CaraDado[]{CaraDado.CARA_1,CaraDado.CARA_2,CaraDado.CARA_3,CaraDado.CARA_4,CaraDado.CARA_5,CaraDado.CARA_6};
        this.caraSeleccionada = 1;
        this.disponible = true;
    }

    
    
    public CaraDado[] getCaras() {
        return caras;
    }

    public void setCaras(CaraDado[] caras) {
        this.caras = caras;
    }

    public int getCaraSeleccionada() {
        return caraSeleccionada;
    }

    public void setCaraSeleccionada(int caraSeleccionada) {
        this.caraSeleccionada = caraSeleccionada;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
